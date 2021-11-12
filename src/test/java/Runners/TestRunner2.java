package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/Features/Test.feature"},
		glue = {"stepDefinations","src/test/java/stepDefinations/TestStep"},
		tags = "@Sanity",
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"
		}
		
		)

public class TestRunner extends AbstractTestNGCucumberTests{


}
