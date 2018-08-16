package step_definitions;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import modules.BreakfastChoiceAction;
import pageobjects.BaseClass;
import pageobjects.BreakfastChoicePage;

public class BreakfastChoiceSteps {
	@Then("^I choose my favorite breakfast out of given options \"(.*?)\" and click next$")
	public void i_choose_my_favorite_breakfast_out_of_given_options(String options) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    PageFactory.initElements(BaseClass.driver, BreakfastChoicePage.class);
	    
	    if (options.equalsIgnoreCase("1"))
	    	BreakfastChoiceAction.clickSugaryCereal();
	    else if (options.equalsIgnoreCase("2"))
	    	BreakfastChoiceAction.clickPorridge();
	    else if (options.equalsIgnoreCase("3"))
	    	BreakfastChoiceAction.clickCornFlakes();
	    else if (options.equalsIgnoreCase("4"))
	    	BreakfastChoiceAction.clickCereals();
	    
	 
	    
	    BreakfastChoiceAction.clickNextBC();
	    Thread.sleep(1000);
	    
	}

}
