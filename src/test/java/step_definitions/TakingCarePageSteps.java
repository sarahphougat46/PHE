package step_definitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;
import modules.TakeCareAction;
import pageobjects.BaseClass;
import pageobjects.TakingCarePage;

public class TakingCarePageSteps {

	@When("^I select options from What Stops you taking care of yourself \"(.*?)\" and click next$")
	public void i_select_options_from_What_Stops_you_taking_care_of_yourself(String options) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(BaseClass.driver, TakingCarePage.class);
	 String delim=",";
	 String [] split_options=options.split(delim);
		int len = split_options.length;
		for (int i = 0; i < len; i++) {
			if (split_options[i].equalsIgnoreCase("1"))
				TakeCareAction.selectIDontHaveTime();

			else if (split_options[i].equalsIgnoreCase("2"))
				TakeCareAction.selectILookAfterOthers();

			else if (split_options[i].equalsIgnoreCase("3"))
				TakeCareAction.selectIDontKnowWhatToDo();

			else if (split_options[i].equalsIgnoreCase("4"))
				TakeCareAction.selectIDontHaveTheMoney();

			else if (split_options[i].equalsIgnoreCase("5"))
				TakeCareAction.selectIStartCantKeepUp();

			else if (split_options[i].equalsIgnoreCase("6"))
				TakeCareAction.selectIllDisabled();
			else if (split_options[i].equalsIgnoreCase("7"))
				TakeCareAction.selectITakeGoodCare();
		  
	 }
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)BaseClass.driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(1000);
		
		
			TakeCareAction.clickNext();		
	 Thread.sleep(1000);
	}
	

}
