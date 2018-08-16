package modules;

import cucumber.runtime.Timeout;
import pageobjects.BaseClass;
import pageobjects.OneYouLandingPage;

public class OneYouLand {

	/********** Getter Functions **************/

	public static void clickNext() {

		OneYouLandingPage.next1.click();

	}

	public static void enterFirstName(String fname) throws InterruptedException {
		// System.out.println("Return Fname");

		Thread.sleep(3000);
		OneYouLandingPage.firstName.sendKeys(fname);

	}

	public static void selectFemale() {
		OneYouLandingPage.genderF.click();
	}

	public static void selectMale() {
		OneYouLandingPage.genderM.click();
	}

	public static void enterAge(String age) {
		OneYouLandingPage.age.sendKeys(age);
	}

}
