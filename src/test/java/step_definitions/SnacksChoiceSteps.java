package step_definitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import modules.SnacksChoiceAction;
import pageobjects.BaseClass;
import pageobjects.SnacksChoicePage;

public class SnacksChoiceSteps {
	JavascriptExecutor jse=(JavascriptExecutor)BaseClass.driver;
	@Then("^I choose my favorite snacks from given options \"(.*?)\"$")
	public void i_choose_my_favorite_snacks_from_given_options(String options) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  PageFactory.initElements(BaseClass.driver,SnacksChoicePage.class);
		String delim=",";
	    String [] options_list= options.split(delim);
	    int len=options_list.length;
	    Thread.sleep(1000);
	    for(int i=0;i<len;i++)
	    {
	    	if(options_list[i].equalsIgnoreCase("1"))
	    		SnacksChoiceAction.clickFruit();
	    	else if(options_list[i].equalsIgnoreCase("2"))
	    		SnacksChoiceAction.clickChocolate();
	    	else if(options_list[i].equalsIgnoreCase("3"))
	    		SnacksChoiceAction.clickCrisp();
	    	else if(options_list[i].equalsIgnoreCase("4"))
	    		SnacksChoiceAction.clickCakes();
	    	else if(options_list[i].equalsIgnoreCase("5"))
	    		SnacksChoiceAction.clickBiscuits();
	    	else if(options_list[i].equalsIgnoreCase("6"))
	    		SnacksChoiceAction.clickTeaCakes();
	    	else if(options_list[i].equalsIgnoreCase("7"))
	    		SnacksChoiceAction.clickNuts();
	    	else if(options_list[i].equalsIgnoreCase("8"))
	    		SnacksChoiceAction.clickToast();
	    	else if(options_list[i].equalsIgnoreCase("9"))
	    		SnacksChoiceAction.clickNone();
	      }
	    jse.executeScript("window.scrollBy(0,250)", ""); Thread.sleep(1000);
	    SnacksChoiceAction.clickNext_SC();
	    Thread.sleep(1000);
	    jse.executeScript("window.scrollBy(0,250)","");
	    SnacksChoiceAction.clickNext_SC();
		}


}
