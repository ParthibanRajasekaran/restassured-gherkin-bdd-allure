package com.template.project.stepDefinitions;

import static com.template.project.common.RestAssuredUtils.convertRawToJson;
import static com.template.project.common.RestAssuredUtils.verifyStatusCode;

import com.template.project.customer.request.CustomerRequests;
import com.template.project.customer.utils.CustomFunctions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import java.io.IOException;
import java.util.Objects;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;

@Log4j2
public class CustomerStepDefinition {

  private Response rawRes;
  public static String customerId = null;

  @When("^User calls createCustomer with \"([^\"]*)\" and \"([^\"]*)\"$")
  public void user_calls_createcustomer_with_something_and_something(String firstname, String lastname)
      throws IOException {
    rawRes = CustomerRequests.createCustomer(firstname, lastname);
    customerId = CustomFunctions.getCustomerId(rawRes);
    log.debug("Customer Id: "+customerId+" is created");
  }

  @And("^CustomerId is not null$")
  public void customerid_is_not_null() {
    CustomFunctions.verifyCustomerIdNotNull(rawRes);
    log.debug("Customer Id is not Null");
  }

  @When("^User calls getCustomerDetails$")
  public void user_calls_getcustomerdetails()  {
    log.debug(String.format("Get customer details for customer id: %s", customerId));
    rawRes = CustomerRequests.getCustomerDetails(customerId);
  }

  @When("^User calls updateCustomerDetails with \"([^\"]*)\" and \"([^\"]*)\"$")
  public void user_calls_updatecustomerdetails_with_something_and_something(String customerFirstName, String customerSecondName) throws Throwable {
    rawRes = CustomerRequests.updateCustomerDetails(
        customerId, customerFirstName, customerSecondName);
  }

  @When("^User calls deleteCustomerDetails$")
  public void user_calls_deletecustomerdetails() {
    log.debug("Deleting customer details for customer id: "+customerId);
    rawRes = CustomerRequests.deleteCustomerDetails(customerId);
  }

  @Then("^the API response is \"([^\"]*)\" with status code \"([^\"]*)\"$")
  public void the_api_response_is_something_with_status_code_something(String status, int statusCode) {
    verifyStatusCode(rawRes, statusCode);
    log.debug(String.format("API response is %s with status code %s", status, statusCode));
  }

  @And("^\"([^\"]*)\" in response body is \"([^\"]*)\"$")
  public void something_in_response_body_is_something(String key, String expectedValue) {
    final String actualValue = Objects.requireNonNull(convertRawToJson(rawRes)).get(key);
    Assert.assertEquals(actualValue, expectedValue, "Invalid value is returned");
  }

}
