package step_definitions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import modules.ExerciseAction;
import pageobjects.BaseClass;
import pageobjects.ExercisePage;

public class ExerciseSteps {

	@Then("^I choose my exercise metrics \"(.*?)\"$")
	public void i_choose_my_exercise_days_and_strength(String exer) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
PageFactory.initElements(BaseClass.driver,ExercisePage.class);
		String[] options_days_list = exer.split(";");
		int len = options_days_list.length;
		int num = 0;
		
		for (int i = 0; i < len; i++) {
			String[] stregth_list = options_days_list[i].split(",");
			if (stregth_list[0].equalsIgnoreCase("1")) {
				num = Integer.parseInt(stregth_list[1]);
				ExerciseAction.dragMonday(num);
				// width = ExercisePage.mondayExercise.
			   // Actions act = new Actions(BaseClass.driver);
			   // act.moveToElement(ExercisePage.mondayExercise).moveByOffset((width/2)-2, 0).click().perform();
				
				
				Thread.sleep(500);
			} else if (stregth_list[0].equalsIgnoreCase("2")) {
				num = Integer.parseInt(stregth_list[1]);
				ExerciseAction.dragTuesday(num);
				Thread.sleep(500);
			} else if (stregth_list[0].equalsIgnoreCase("3")) {
				num = Integer.parseInt(stregth_list[1]);
				ExerciseAction.dragWednesday(num);
				Thread.sleep(500);
			} else if (stregth_list[0].equalsIgnoreCase("4")) {
				num = Integer.parseInt(stregth_list[1]);
				ExerciseAction.dragThursday(num);
				Thread.sleep(500);
			} else if (stregth_list[0].equalsIgnoreCase("5")) {
				num = Integer.parseInt(stregth_list[1]);
				ExerciseAction.dragFriday(num);
				Thread.sleep(500);
			} else if (stregth_list[0].equalsIgnoreCase("6")) {
				num = Integer.parseInt(stregth_list[1]);
				ExerciseAction.dragSaturday(num);
				Thread.sleep(500);
			} else if (stregth_list[0].equalsIgnoreCase("7")) {
				num = Integer.parseInt(stregth_list[1]);
				ExerciseAction.dragSunday(num);
				Thread.sleep(500);
			}
		}
		ExerciseAction.clickNext_Ex();Thread.sleep(900);
	}

}
