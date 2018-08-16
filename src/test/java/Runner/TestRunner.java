package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Automation\\PHE_HowAreYou\\src\\test\\resources\\features\\OneYou.feature",
		glue= {"step_definitions"}	
		)
	
public class TestRunner {

}
