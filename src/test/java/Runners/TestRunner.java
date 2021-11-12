package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(publish = true,
		features = "src/test/java/Features",
		glue = {"stepDefinations","src/test/java/stepDefinations/"},
		tags = "@Sanity or @Regression",
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"
		}
		
		)

public class TestRunner extends AbstractTestNGCucumberTests{


}
