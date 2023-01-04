@Customer
@severity=blocker
Feature: Validating Customer APIs

  @Creation
  Scenario Outline: Verify Customer creation
    When User calls createCustomer with "<firstName>" and "<lastName>"
    Then the API response is "success" with status code "201"
    And CustomerId is not null
    And "firstname" in response body is "<firstName>"
    And "lastname" in response body is "<lastName>"

    Examples:
      | firstName   | lastName    |
      | first name  | second name |
      | second name | first name  |

  Scenario Outline: Verify Customer data retrieval
    Given User calls createCustomer with "<firstName>" and "<lastName>"
    When User calls getCustomerDetails
    Then the API response is "success" with status code "200"
    And "firstname" in response body is "<firstName>"
    And "lastname" in response body is "<lastName>"

    Examples:
      | firstName   | lastName    |
      | first name  | second name |

  Scenario: Verify Customer data modification
    Given User calls createCustomer with "firstName" and "lastName"
    When User calls updateCustomerDetails with "updatedFirstName" and "updatedLastName"
    Then the API response is "success" with status code "200"
    When User calls getCustomerDetails
    Then "firstname" in response body is "updatedFirstName"
    And "lastname" in response body is "updatedLastName"

  @Deletion
  Scenario: Delete Customer data
    Given User calls createCustomer with "firstName" and "lastName"
    When User calls deleteCustomerDetails
    Then the API response is "success" with status code "200"
    When User calls getCustomerDetails
    Then the API response is "failure" with status code "404"