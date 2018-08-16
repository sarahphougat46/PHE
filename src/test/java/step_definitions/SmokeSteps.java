package step_definitions;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import modules.SmokeAction;
import pageobjects.BaseClass;
import pageobjects.SmokePage;

public class SmokeSteps {
	@Then("^I am asked about my smoking habbits \"(.*?)\"$")
	public void i_am_asked_about_my_smoking_habbits(String options) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    PageFactory.initElements(BaseClass.driver,SmokePage.class);
	    if (options.equalsIgnoreCase("1"))
			SmokeAction.selectEveryDay();
		else if (options.equalsIgnoreCase("2"))
			SmokeAction.selectSometimes();
		else if (options.equalsIgnoreCase("3"))
			SmokeAction.selectQuit();
		else if (options.equalsIgnoreCase("4"))
			SmokeAction.selectNeverHad();

		SmokeAction.clickNext_SM();
		Thread.sleep(1000);
		SmokeAction.clickNext_SM();

	}
}
