package step_definitions;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import modules.HowAreYouFeelingRightNowAction;
import pageobjects.BaseClass;
import pageobjects.HowAreYouFeelingRightNowPage;

public class HowAreYouFeelingRightNowPageSteps {

	HowAreYouFeelingRightNowAction hfrnw = new HowAreYouFeelingRightNowAction();

	@Then("^I land on How are you feeling right now \"(.*?)\",\"(.*?)\",\"(.*?)\",\"(.*?)\",\"(.*?)\",\"(.*?)\" and click Next$")
	public void i_land_on_How_are_you_feeling_right_now(int slide1, int slide2, int slide3, int slide4, int slide5,
			int slide6) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(BaseClass.driver, HowAreYouFeelingRightNowPage.class);
		hfrnw.dragReallyKnackered(slide1);
		hfrnw.dragCanRunForMiles(slide2);
		hfrnw.dragFeelingCalm(slide3);
		hfrnw.dragSleeplessNights(slide4);
		hfrnw.dragLeanMean(slide5);
		hfrnw.dragDownDumps(slide6);
		hfrnw.clickNext();
		Thread.sleep(3);

	}

}
