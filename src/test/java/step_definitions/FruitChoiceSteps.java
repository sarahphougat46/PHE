package step_definitions;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import modules.FruitChoiceActions;
import pageobjects.BaseClass;
import pageobjects.FruitsChoicesPage;

public class FruitChoiceSteps {
	
	@Then("^I choose servings of fruits and vegetables from \"(.*?)\"$")
	public void i_choose_servings_of_fruits_and_vegetables_from(String options) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(BaseClass.driver, FruitsChoicesPage.class);

		if (options.equalsIgnoreCase("1"))
			FruitChoiceActions.clickZero();
		else if (options.equalsIgnoreCase("2"))
			FruitChoiceActions.clickOne();
		else if (options.equalsIgnoreCase("3"))
			FruitChoiceActions.clickThree();
		else if (options.equalsIgnoreCase("4"))
			FruitChoiceActions.clickFive();

		FruitChoiceActions.clickNextFrC();
		Thread.sleep(1000);

	}
}
