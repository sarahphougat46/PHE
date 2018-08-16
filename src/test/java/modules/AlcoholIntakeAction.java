package modules;

import org.openqa.selenium.support.ui.Select;

import pageobjects.AlcoholIntakePage;

public class AlcoholIntakeAction {

	public static void clickMostly() {
		AlcoholIntakePage.mostWeeks.click();
	}

	public static void clickTwoMonths() {
		AlcoholIntakePage.twoMonths.click();
	}

	public static void clickOneMonth() {
		AlcoholIntakePage.oneMonth.click();
	}

	public static void clickNever() {
		AlcoholIntakePage.never.click();
	}

	public static void clicMonday() {
		AlcoholIntakePage.monday.click();
	}

	public static void clickTuesday() {
		AlcoholIntakePage.tuesday.click();
	}

	public static void clicWednesday() {
		AlcoholIntakePage.wednesday.click();
	}

	public static void clickThursday() {
		AlcoholIntakePage.thursday.click();
	}

	public static void clickFriday() {
		AlcoholIntakePage.friday.click();
	}

	public static void clicSaturday() {
		AlcoholIntakePage.saturday.click();
	}

	public static void clicSunday() {
		AlcoholIntakePage.sunday.click();
	}

	public static void clickNext_AI() {
		AlcoholIntakePage.next_DF.click();
	}

	// *****************Drinks and Volumes*********************//
	// ############ WeekDays ################//
	/*public static void clickBeer4WD() {
		AlcoholIntakePage.beer4WD.click();
	}

	public static void clickBeer5WD() {
		AlcoholIntakePage.beer5WD.click();
	}

	public static void clickSpiritWD() {
		AlcoholIntakePage.spiritsWD.click();
	}

	public static void clickWineWD() {
		AlcoholIntakePage.wineWD.click();
	}
*/
	// **Volumes
	public static void clickBeer4VolWD(String vol) {
		Select sel = new Select(AlcoholIntakePage.beer4VolWD);
		
		sel.selectByValue(vol);
	}

	public static void clickBeer5VolWD(String vol) {
		Select sel = new Select(AlcoholIntakePage.beer5VolWD);
		
		sel.selectByValue(vol);
	}

	public static void clickSpiritVolWD(String vol) {
		Select sel = new Select(AlcoholIntakePage.spiritsVolWD);
		
		sel.selectByValue(vol);
	}

	public static void clickWineVolWD(String vol) {
		Select sel = new Select(AlcoholIntakePage.wineVolWD);
		
		sel.selectByValue(vol);
	}
	
	
	
	public static void clickBeer4VolOcc(String vol) {
		Select sel = new Select(AlcoholIntakePage.beer4VolOcc);
		
		sel.selectByValue(vol);
	}

	public static void clickBeer5VolOcc(String vol) {
		Select sel = new Select(AlcoholIntakePage.beer5VolOcc);
		
		sel.selectByValue(vol);
	}

	public static void clickSpiritVolOcc(String vol) {
		Select sel = new Select(AlcoholIntakePage.spiritsVolOcc);
		
		sel.selectByValue(vol);
	}

	public static void clickWineVolOcc(String vol) {
		Select sel = new Select(AlcoholIntakePage.wineVolOcc);
		
		sel.selectByValue(vol);
	}


	// ########### Weekends ##################3
	/*public static void clickBeer4WE() {
		AlcoholIntakePage.beer4WE.click();
	}

	public static void clickBeer5WE() {
		AlcoholIntakePage.beer5WE.click();
	}

	public static void clickSpiritWE() {
		AlcoholIntakePage.spiritsWE.click();
	}

	public static void clickWineWE() {
		AlcoholIntakePage.wineWE.click();
	}
*/
	// **Volumes

	public static void clickBeer4VolWE(String vol) {
		Select sel = new Select(AlcoholIntakePage.beer4VolWE);
		
		sel.selectByValue(vol);
	}

	public static void clickBeer5VolWE(String vol) {
		Select sel = new Select(AlcoholIntakePage.beer5VolWE);
		
		sel.selectByValue(vol);
	}

	public static void clickSpiritVolWE(String vol) {
		Select sel = new Select(AlcoholIntakePage.spiritsVolWE);
		
		sel.selectByValue(vol);
	}

	public static void clickWineVolWE(String vol) {
		Select sel = new Select(AlcoholIntakePage.wineVolWE);
		
		sel.selectByValue(vol);
	}
public static void clickNoToDrink()
{
	AlcoholIntakePage.noToDrink.click();
}
public static void clickLessMonthly()
{
	AlcoholIntakePage.lessMonth.click();
}
public static void clickMonthly()
{
	AlcoholIntakePage.monthly.click();
}
}
