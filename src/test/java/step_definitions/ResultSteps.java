package step_definitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.ReadPropertiesFile;
import modules.ResultAction;
import pageobjects.BaseClass;
import pageobjects.ResultPage;

public class ResultSteps {
	
	@When("^I do not opt for sign up$")
	public void i_do_not_opt_for_sign_up() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	PageFactory.initElements(BaseClass.driver, ResultPage.class);
	
	JavascriptExecutor jse = (JavascriptExecutor)BaseClass.driver;
	jse.executeScript("window.scrollBy(0,250)", ""); Thread.sleep(600);

	ResultAction.clickNoThanks();
		
	   
	}

	@Then("^I land on Result Page with the score \"(.*?)\"$")
	public void i_land_on_Result_Page_with_the_score(String expScore) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(BaseClass.driver, ResultPage.class);
		ResultAction.findChild(expScore);
	}

	@And("^I validate messages against each section$")
	public void i_validate_messages_against_each_section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(BaseClass.driver, ResultPage.class);
		PageFactory.initElements(BaseClass.driver, ReadPropertiesFile.class);
		ReadPropertiesFile rp=new ReadPropertiesFile();
		
		//** Moving text validation*****//
		String exMove=rp.ReadFile("moving","config.properties");
		JavascriptExecutor jse = (JavascriptExecutor)BaseClass.driver;
		jse.executeScript("window.scrollBy(0,120)", ""); Thread.sleep(600);
		ResultAction.validateMovingContent(exMove);
		
		//***Eating*************/
		
		/*String exEating=rp.ReadFile("Eating","config.properties");
		jse.executeScript("window.scrollBy(0,230)", ""); Thread.sleep(600);
		ResultAction.validateEatingContent(exEating);*/
		
		//****Drinking*********//
		/*String exDrinking=rp.ReadFile("Drinking","config.properties");
		ResultAction.validateDrinkingContent(exDrinking);
		*/
		//********Smoking********//
		/*String exSmoking=rp.ReadFile("Smoking","config.properties");
		ResultAction.validateSmokingContent(exSmoking);
		*/	
		Thread.sleep(200);
			
	}



}
