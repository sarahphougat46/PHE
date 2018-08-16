package step_definitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import cucumber.api.java.en.Then;
import modules.AlcoholIntakeAction;
import pageobjects.AlcoholIntakePage;
import pageobjects.BaseClass;

public class AlcoholIntakeSteps {
	JavascriptExecutor jse = (JavascriptExecutor) BaseClass.driver;

	@Then("^I select frequency of alcohol intake \"(.*?)\",\"(.*?)\",\"(.*?)\",\"(.*?)\" and click Next$")
	public void i_select_frequency_of_alcohol_intake_and_click_Next(String options_freq, String options_days,
			String options_volume_WD, String options_volume_WE) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(BaseClass.driver, AlcoholIntakePage.class);

		if (options_freq.equalsIgnoreCase("1")) {
			AlcoholIntakeAction.clickMostly();
			DaysDrink(options_days);
			WeeklyDrinkVol("1", "WeekDays", options_volume_WD);
			jse.executeScript("window.scrollBy(0,250)", "");
			WeeklyDrinkVol("1", "WeekEnds", options_volume_WE);
			AlcoholIntakeAction.clickNext_AI();

		}

		else if (options_freq.equalsIgnoreCase("2")) {
			AlcoholIntakeAction.clickTwoMonths();
			AlcoholIntakeAction.clickNext_AI();
			Thread.sleep(1000);
			WeeklyDrinkVol("2", "WeekDays", options_volume_WD);
			AlcoholIntakeAction.clickNext_AI();
			Thread.sleep(1000);

		} 
		else if (options_freq.equalsIgnoreCase("3")) {
			AlcoholIntakeAction.clickOneMonth();
			AlcoholIntakeAction.clickNext_AI();
			Thread.sleep(1000);
			WeeklyDrinkVol("3", "WeekDays", options_volume_WD);
			AlcoholIntakeAction.clickNext_AI();Thread.sleep(500);
			AlcoholIntakeAction.clickNoToDrink();
			AlcoholIntakeAction.clickNext_AI();Thread.sleep(500);
			
			Thread.sleep(1000);
		}

		else if (options_freq.equalsIgnoreCase("4"))
			AlcoholIntakeAction.clickNever();
		Thread.sleep(1000);
		AlcoholIntakeAction.clickNext_AI();
		Thread.sleep(1000);

	}

	public void DaysDrink(String days) throws Throwable {

		String delim = ",";
		String[] options_days_list = days.split(delim);
		int len = options_days_list.length;
		for (int i = 0; i < len; i++) {
			if (options_days_list[i].equalsIgnoreCase("1"))
				AlcoholIntakeAction.clicMonday();
			else if (options_days_list[i].equalsIgnoreCase("2"))
				AlcoholIntakeAction.clickTuesday();
			else if (options_days_list[i].equalsIgnoreCase("3"))
				AlcoholIntakeAction.clicWednesday();
			else if (options_days_list[i].equalsIgnoreCase("4"))
				AlcoholIntakeAction.clickThursday();
			else if (options_days_list[i].equalsIgnoreCase("5"))
				AlcoholIntakeAction.clickFriday();
			else if (options_days_list[i].equalsIgnoreCase("6"))
				AlcoholIntakeAction.clicSaturday();
			else if (options_days_list[i].equalsIgnoreCase("7"))
				AlcoholIntakeAction.clicSunday();
			else
				Reporter.log("Please choose atleast one option" + getClass());
			jse.executeScript("window.scrollBy(0,250)", "");
			Thread.sleep(1000);
			
			

		}
		AlcoholIntakeAction.clickNext_AI();Thread.sleep(1000);

	}

	public void WeeklyDrinkVol(String called, String day, String volume) {
		String delim = ";";
		String[] drink_list = volume.split(delim);
		int drink_len = drink_list.length;
		if (day.equalsIgnoreCase("WeekDays") & called.equalsIgnoreCase("1")) {
			for (int j = 0; j < drink_len; j++) {
				String[] vol_list = drink_list[j].split(",");

				if (vol_list[0].equalsIgnoreCase("1"))
					AlcoholIntakeAction.clickBeer4VolWD(vol_list[1]);
				else if (vol_list[0].equalsIgnoreCase("2"))
					AlcoholIntakeAction.clickBeer5VolWD(vol_list[1]);
				else if (vol_list[0].equalsIgnoreCase("3"))
					AlcoholIntakeAction.clickSpiritVolWD(vol_list[1]);
				else if (vol_list[0].equalsIgnoreCase("4"))
					AlcoholIntakeAction.clickWineVolWD(vol_list[1]);
				else
					Reporter.log("Wrong Input" + getClass());
			}

		}

		else if ((day.equalsIgnoreCase("WeekDays") & (called.equalsIgnoreCase("2") | called.equalsIgnoreCase("3")))) {
			for (int j = 0; j < drink_len; j++) {
				String[] vol_list = drink_list[j].split(",");

				if (vol_list[0].equalsIgnoreCase("1"))
					AlcoholIntakeAction.clickBeer4VolOcc(vol_list[1]);
				else if (vol_list[0].equalsIgnoreCase("2"))
					AlcoholIntakeAction.clickBeer5VolOcc(vol_list[1]);
				else if (vol_list[0].equalsIgnoreCase("3"))
					AlcoholIntakeAction.clickSpiritVolOcc(vol_list[1]);
				else if (vol_list[0].equalsIgnoreCase("4"))
					AlcoholIntakeAction.clickWineVolOcc(vol_list[1]);
				else
					Reporter.log("Wrong Input" + getClass());
			}

		} else if (day.equalsIgnoreCase("Weekends")) {
			for (int j = 0; j < drink_len; j++) {
				String[] vol_list = drink_list[j].split(",");
				try {
					if (vol_list[0].equalsIgnoreCase("1"))
						AlcoholIntakeAction.clickBeer4VolWE(vol_list[1]);
					else if (vol_list[0].equalsIgnoreCase("2"))
						AlcoholIntakeAction.clickBeer5VolWE(vol_list[1]);
					else if (vol_list[0].equalsIgnoreCase("3"))
						AlcoholIntakeAction.clickSpiritVolWE(vol_list[1]);
					else if (vol_list[0].equalsIgnoreCase("4"))
						AlcoholIntakeAction.clickWineVolWE(vol_list[1]);
					else
						Reporter.log("Wrong Input" + getClass());

				}

				catch (Exception e) {
					e.getStackTrace();
				}
			}
		}
	}

}