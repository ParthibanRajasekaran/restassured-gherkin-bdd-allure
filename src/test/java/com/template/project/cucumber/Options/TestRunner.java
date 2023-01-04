package com.template.project.cucumber.Options;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/template/project/features", plugin = { "pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm", "html:target/cucumber-report.html", "json:target/jsonReports/cucumber-report.json"}, monochrome = true , glue = {
    "com/template/project/stepDefinitions"}, publish = true,tags = "@Customer and not @Creation")
public class TestRunner {
}

// mvn clean test -D"cucumber.filter.tags=@Customer and not @Creation"

// plugin options for reporting : "json:target/jsonReports/cucumber-report.json", "html:target/cucumber-report", "pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
