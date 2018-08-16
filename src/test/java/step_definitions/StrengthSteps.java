package step_definitions;

import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.JavascriptExecutor;

import cucumber.api.java.en.Then;
import modules.StrengthAction;
import pageobjects.BaseClass;
import pageobjects.StrengthPage;

public class StrengthSteps {


@Then("^I choose my strengthening metrics \"(.*?)\"$")
public void i_choose_my_strengthening_metrics(String exer) throws Throwable {	// Write code here that turns the phrase above into concrete actions
PageFactory.initElements(BaseClass.driver,StrengthPage.class);

		String[] options_days_list = exer.split(";");
		int len = options_days_list.length;
		int num = 0;
		for (int i = 0; i < len; i++) {
			String[] stregth_list = options_days_list[i].split(",");
			
			if (stregth_list[0].equalsIgnoreCase("1")) {
				num = Integer.parseInt(stregth_list[1]);
				StrengthAction.dragMonday(num);
				Thread.sleep(500);
			} else if (stregth_list[0].equalsIgnoreCase("2")) {
				num = Integer.parseInt(stregth_list[1]);
				StrengthAction.dragTuesday(num);
				Thread.sleep(500);
			} else if (stregth_list[0].equalsIgnoreCase("3")) {
				num = Integer.parseInt(stregth_list[1]);
				StrengthAction.dragWednesday(num);
				Thread.sleep(500);
			} else if (stregth_list[0].equalsIgnoreCase("4")) {
				num = Integer.parseInt(stregth_list[1]);
				StrengthAction.dragThursday(num);
				Thread.sleep(500);
			} else if (stregth_list[0].equalsIgnoreCase("5")) {
				num = Integer.parseInt(stregth_list[1]);
				StrengthAction.dragFriday(num);
				Thread.sleep(500);
			} else if (stregth_list[0].equalsIgnoreCase("6")) {
				num = Integer.parseInt(stregth_list[1]);
				StrengthAction.dragSaturday(num);
				Thread.sleep(500);
			} else if (stregth_list[0].equalsIgnoreCase("7")) {
				num = Integer.parseInt(stregth_list[1]);
				StrengthAction.dragSunday(num);
				
				Thread.sleep(500);
			}
		}
		StrengthAction.clickNext_St();Thread.sleep(500);
		JavascriptExecutor jse = (JavascriptExecutor)BaseClass.driver;
		jse.executeScript("window.scrollBy(0,250)", ""); Thread.sleep(600);

		StrengthAction.clickNext_St();Thread.sleep(500);
	}

}
