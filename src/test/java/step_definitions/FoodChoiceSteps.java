package step_definitions;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import modules.FoodChoiceAction;
import pageobjects.BaseClass;
import pageobjects.FoodChoice;

public class FoodChoiceSteps {

	@Then("^I select my favorite snacks out of given options \"(.*?)\"$")
	public void i_select_my_favorite_snacks_out_of_given_options(String options) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		PageFactory.initElements(BaseClass.driver, FoodChoice.class);
		String delim = ",";
		String[] split_options = options.split(delim);
		int len = split_options.length;
		for (int i = 0; i < len; i++) {
			if (split_options[i].equalsIgnoreCase("1"))
				FoodChoiceAction.clickChips();
			else if (split_options[i].equalsIgnoreCase("2"))
				FoodChoiceAction.clickBPotato();
			else if (split_options[i].equalsIgnoreCase("3"))
				FoodChoiceAction.clickRPotato();
			else if (split_options[i].equalsIgnoreCase("4"))
				FoodChoiceAction.clickJPotato();
		}
		FoodChoiceAction.clickNextFC();
		Thread.sleep(1000);

	}

}
