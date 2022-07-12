package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
        features = "src\\main\\resources\\features" ,
        glue = "stepDefinitions",
       // plugin = {"pretty", "html:target/cucumber",""},
        tags = "@smokeTesting"
)


public class TestRunner extends AbstractTestNGCucumberTests {
}
