package step_definitions;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import modules.BeingHealthyAction;
import modules.TakeCareAction;
import pageobjects.BaseClass;

public class BeingHealthy {
	
	@Then("^I choose who all depend on me for being healthy \"(.*?)\"and click next$")
	public void i_choose_who_all_depend_on_me_for_being_healthy(String choices)
	{
		PageFactory.initElements(BaseClass.driver,pageobjects.BeingHealthy.class);
		String delim=",";
		 String [] split_options=choices.split(delim);
			int len = split_options.length;
			for (int i = 0; i < len; i++) {
				if (split_options[i].equalsIgnoreCase("1"))
					BeingHealthyAction.selectMyPartner();
				
				else if (split_options[i].equalsIgnoreCase("2"))
				BeingHealthyAction.selectMyKids();

				else if (split_options[i].equalsIgnoreCase("3"))
					BeingHealthyAction.selectMyParents();

				else if (split_options[i].equalsIgnoreCase("4"))
					BeingHealthyAction.selectMyGrandChildren();

				else if (split_options[i].equalsIgnoreCase("5"))
					BeingHealthyAction.selectMyCloseFriends();

				else if (split_options[i].equalsIgnoreCase("6"))
					BeingHealthyAction.selectMyCloseFriends();
				
				else if (split_options[i].equalsIgnoreCase("7"))
					BeingHealthyAction.selectMyBrotherSister();
				
				else if (split_options[i].equalsIgnoreCase("8"))
					BeingHealthyAction.selectMyPets();
				
				else if (split_options[i].equalsIgnoreCase("9"))
					BeingHealthyAction.selectNone();
				
				
			  
		 }
			
			TakeCareAction.clickNext();		

		
	}

}
