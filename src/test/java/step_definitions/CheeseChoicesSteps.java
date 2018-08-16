package step_definitions;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import modules.BreakfastChoiceAction;
import modules.CheeseChoiceAction;
import pageobjects.BaseClass;
import pageobjects.BreakfastChoicePage;
import pageobjects.CheeseChoicePage;

public class CheeseChoicesSteps {
	@Then("^I choose my favorite cheese out of given options\"(.*?)\"$")
	public void i_choose_my_favorite_cheese_out_of_given_options(String options) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(BaseClass.driver, CheeseChoicePage.class);

		if (options.equalsIgnoreCase("1"))
			CheeseChoiceAction.clickHardCheese();
		else if (options.equalsIgnoreCase("2"))
			CheeseChoiceAction.clickCottageCheese();
		else if (options.equalsIgnoreCase("3"))
			CheeseChoiceAction.clickFatCheese();
		else if (options.equalsIgnoreCase("4"))
			CheeseChoiceAction.clickVeganCheese();

		CheeseChoiceAction.clickNextCC();
		Thread.sleep(1000);

	}

}
