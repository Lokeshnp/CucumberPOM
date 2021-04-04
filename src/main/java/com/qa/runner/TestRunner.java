package com.qa.runner;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "D:\\Automation\\code\\CucumberPOMDesign\\src\\main\\java\\com\\qa\\features\\CRM.feature", //the path of the feature files
        glue={"com.qa.stepDefinitions"}, //the path of the step definition files
        plugin = {"pretty", "html:test-output/cucumber.html", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
        dryRun = false,
        strict = true,
        monochrome = true //display the console output in a proper readable format
        )

public class TestRunner {

}
