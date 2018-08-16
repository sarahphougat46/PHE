package step_definitions;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import modules.NonVegChoicesAction;
import pageobjects.BaseClass;
import pageobjects.NonVegChoicesPages;

public class NonVegChoicesSteps {
	
	@Then("^I choose my favorite NonVeg item from the available options \"(.*?)\" and click next$")
	public void i_choose_my_favorite_NonVeg_item_from_the_available_options_and_click_next(String options) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(BaseClass.driver, NonVegChoicesPages.class);

		if (options.equalsIgnoreCase("1"))
			NonVegChoicesAction.clickBurger();
		else if (options.equalsIgnoreCase("2"))
			NonVegChoicesAction.clickFish();
		else if (options.equalsIgnoreCase("3"))
			NonVegChoicesAction.clickHam();
		else if (options.equalsIgnoreCase("4"))
			NonVegChoicesAction.clickMeat();

		NonVegChoicesAction.clickNextNC();
		Thread.sleep(1000);

	}

}
