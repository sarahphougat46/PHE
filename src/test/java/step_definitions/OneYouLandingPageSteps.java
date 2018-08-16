package step_definitions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;
import modules.OneYouLand;
import pageobjects.BaseClass;
import pageobjects.OneYouLandingPage;
import helpers.*;

public class OneYouLandingPageSteps extends BaseClass {

	ReadPropertiesFile rp = new ReadPropertiesFile();

	DataHelper dp = new DataHelper();

	@When("^I start quiz on OneYou website$")
	public void i_open_seleniumframework_website() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, ReadPropertiesFile.class);
		String browser = rp.ReadFile("browser", "config.properties");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rwadhawa\\Desktop\\drivers\\chromedriver.exe");
			BaseClass.driver = new ChromeDriver();
			// driver.manage().deleteAllCookies();
			BaseClass.driver.manage().window().maximize();
			Thread.sleep(2);
		}

		BaseClass.driver.get(rp.ReadFile("url", "config.properties"));
		// OneYouActions.clickStartQuiz();
		Thread.sleep(5);
	}

	@When("^I fill first page \"(.*?)\",\"(.*?)\",\"(.*?)\" and click Next$")
	public void i_feed_first_page_and_click_next(String name, String gender, String age) throws Throwable {

		PageFactory.initElements(driver, OneYouLandingPage.class);
		/*
		 * String Fname=DataHelper.hm1.get(arg1).get("Name"); String
		 * Gender=DataHelper.hm1.get(arg1).get("Gender");
		 * 
		 * System.out.println(Fname+" "+Gender+"  got from teh function");
		 */
		OneYouLand.enterFirstName(name);

		if (gender.equalsIgnoreCase("m")) {
			OneYouLand.selectMale();

		} else if (gender.equalsIgnoreCase("f")) {
			OneYouLand.selectFemale();

		}
		OneYouLand.enterAge(age);
		OneYouLand.clickNext();
		Thread.sleep(300);

	}

	/*
	 * @Then("^I validate title and URL$") public void i_print_title_and_URL()
	 * throws Throwable { // Write code here that turns the phrase above into
	 * concrete actions
	 * assertEquals("Selenium Framework | Selenium, Cucumber, Ruby, Java et al."
	 * ,driver.getTitle());
	 * assertEquals("http://www.seleniumframework.com/",driver.getCurrentUrl()); }
	 */

}