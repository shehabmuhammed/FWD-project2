package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
        features = "src\\main\\resources\\Features" ,

        plugin = {"pretty", "html:target/cucumber.html",
        "json:target/cucumber.json",
        "junit:target/cukes.xml",
        "rerun:target/rerun.txt"},

        glue = "stepDefinitions",

        tags = "@smokeTesting"
)


public class TestRunner extends AbstractTestNGCucumberTests {

}
