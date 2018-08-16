package step_definitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import modules.HealthPrioritiesAction;
import modules.TakeCareAction;
import pageobjects.BaseClass;
import pageobjects.HealthPriorties;

public class HealthPrioritiesSteps {

	@Then("^I identify top three health priorities from the given options \"(.*?)\"$")
	public void i_identify_top_three_health_priorities_from_the_given_options(String options) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(BaseClass.driver, HealthPriorties.class);
		String delim = ",";
		String[] split_options = options.split(delim);
		int len = split_options.length;
		for (int i = 0; i < len; i++) {
			if (split_options[i].equalsIgnoreCase("1"))
				HealthPrioritiesAction.selectFittingJeans();

			else if (split_options[i].equalsIgnoreCase("2"))
				HealthPrioritiesAction.selectMorweEnergy();
			else if (split_options[i].equalsIgnoreCase("3"))
				HealthPrioritiesAction.selectAchespain();
			else if (split_options[i].equalsIgnoreCase("4"))
				HealthPrioritiesAction.selectFeelingYoung();
			else if (split_options[i].equalsIgnoreCase("5"))
				HealthPrioritiesAction.selectStayIndependent();
			else if (split_options[i].equalsIgnoreCase("6"))
				HealthPrioritiesAction.selectMindSharp();
			else if (split_options[i].equalsIgnoreCase("7"))
				HealthPrioritiesAction.selectSocialLife();
			else if (split_options[i].equalsIgnoreCase("8"))
				HealthPrioritiesAction.selectYoungLooking();
			else if (split_options[i].equalsIgnoreCase("9"))
				HealthPrioritiesAction.selectForKids();

		}
		JavascriptExecutor jse = (JavascriptExecutor)BaseClass.driver;
		jse.executeScript("window.scrollBy(0,250)", ""); Thread.sleep(1000);
		TakeCareAction.clickNext(); Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(1000);
		HealthPrioritiesAction.clickNextPage();
		
	}

}
