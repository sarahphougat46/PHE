package step_definitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		glue= {},
		plugin = {"pretty", "html:target/cucumber-html-report",	"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/ExtentReport.html"},
		tags = {"@tag1"}
		)
public class RunCukesTest{
	
}  	