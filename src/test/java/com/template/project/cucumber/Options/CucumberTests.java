package com.template.project.cucumber.Options;

import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;


@Suite
@IncludeEngines("cucumber")
@SelectDirectories("src/test/java/com/template/project/features")
@SelectClasspathResource("src/test/java/com/template/project/features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.template.project")
@ConfigurationParameter(key = Constants.PLUGIN_PUBLISH_QUIET_PROPERTY_NAME, value = "true")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME, value = "json:target/jsonReports/cucumber-report.json")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME, value = "html:target/cucumber-report.html")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME, value = "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm")
public class CucumberTests {
}

// mvn clean test -D"cucumber.filter.tags=@Customer and not @Creation"

// plugin options for reporting : "json:target/jsonReports/cucumber-report.json", "html:target/cucumber-report", "pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"