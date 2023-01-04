package com.template.project.customer.payload;

import static com.template.project.customer.builder.CustomerBuilder.addCustomer;
import static com.template.project.customer.builder.CustomerBuilder.updateCustomerDetails;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.template.project.customer.builder.CustomerBuilder;
import com.template.project.customer.model.CustomerModel;

public class CustomerPayload {

  public static String buildCustomerCreationPayload(String firstname, String lastname)
      throws JsonProcessingException {
    CustomerModel sampleModel = addCustomer(firstname, lastname);
    return CustomerBuilder.getJsonPayload(sampleModel);
  }

  public static String buildUpdateCustomerDetailsPayload(String firstname, String lastname)
      throws JsonProcessingException {
    CustomerModel sampleModel = updateCustomerDetails(firstname, lastname);
    return CustomerBuilder.getJsonPayload(sampleModel);
  }
}
