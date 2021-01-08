package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/main/java/Features/Order.feature"
 ,glue={"StepsDefs"}
 ,plugin= {"pretty", "html:target/cucumber", "junit:target/cucumber/new.xml"}
 ,monochrome = true
 )

public class TestRunner {

}
