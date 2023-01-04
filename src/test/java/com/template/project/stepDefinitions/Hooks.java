package com.template.project.stepDefinitions;

import static com.template.project.common.RestAssuredUtils.verifyStatusCode;
import static com.template.project.stepDefinitions.CustomerStepDefinition.customerId;

import com.template.project.customer.request.CustomerRequests;
import io.cucumber.java.After;
import io.restassured.response.Response;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class Hooks {

  private Response rawRes;

  @After("not @Deletion")
  public void afterScenario(){
    if(customerId != null) {
      log.debug("Deleting customer id: "+customerId);
      rawRes = CustomerRequests.deleteCustomerDetails(customerId);
      verifyStatusCode(rawRes, 200);
      rawRes = CustomerRequests.getCustomerDetails(customerId);
      verifyStatusCode(rawRes, 404);
      log.debug("Deleted customer id: "+customerId);
    }
  }

}
