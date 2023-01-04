package com.template.project.customer.builder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.template.project.customer.model.CustomerModel;
import com.template.project.common.RestAssuredUtils;

public class CustomerBuilder {
  public static String getJsonPayload(CustomerModel sampleModel) throws JsonProcessingException {
    return RestAssuredUtils.serializeToJson(sampleModel, true);
  }

  public static CustomerModel addCustomer(String firstname, String lastname) {
    CustomerModel sampleModel = new CustomerModel();
    sampleModel.setFirstname(firstname);
    sampleModel.setLastname(lastname);
    return sampleModel;
  }

  public static CustomerModel updateCustomerDetails(String firstname, String lastname) {
    CustomerModel customerModel = new CustomerModel();
    customerModel.setFirstname(firstname);
    customerModel.setLastname(lastname);
    return customerModel;
  }
}
