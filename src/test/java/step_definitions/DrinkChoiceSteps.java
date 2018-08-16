package step_definitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import modules.DrinkChoiceAction;
import modules.HealthPrioritiesAction;
import modules.TakeCareAction;
import pageobjects.BaseClass;
import pageobjects.DrinkChoice;

public class DrinkChoiceSteps {
	
	@Then("^I choose one of my favorite drinks from given \"(.*?)\" and click Next$")
	public void i_choose_one_of_my_favorite_drinks_from_given(String options) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    PageFactory.initElements(BaseClass.driver, DrinkChoice.class);
	    String delim = ",";
		String[] split_options = options.split(delim);
		int len = split_options.length;
		for (int i = 0; i < len; i++) {
			if (split_options[i].equalsIgnoreCase("1"))
				DrinkChoiceAction.selectSugarDrinks();
			else if (split_options[i].equalsIgnoreCase("2"))
				DrinkChoiceAction.selectDietDrinks();
			else if (split_options[i].equalsIgnoreCase("3"))
				DrinkChoiceAction.selectWater();
			else if (split_options[i].equalsIgnoreCase("4"))
				DrinkChoiceAction.selectTea();
	}
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseClass.driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(1000);
		TakeCareAction.clickNext(); Thread.sleep(1000);
	
	}

}
