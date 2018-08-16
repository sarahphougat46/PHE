package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HowAreYouFeelingRightNowPage extends BaseClass {
 public HowAreYouFeelingRightNowPage()
 {
	 super();
	
 }
 @FindBy(how=How.XPATH, using =("//form/div[1]/div/div[1]/div/div/div[4]"))
 public static WebElement reallyKnackered;


 @FindBy(how=How.XPATH, using =("//form/div[1]/div/div[2]/div/div/div[4]"))
 public static WebElement canRunForMiles;
 
 @FindBy(how=How.XPATH, using =("//form/div[1]/div/div[3]/div/div/div[4]"))
 public static WebElement feelingCalm;
 
 @FindBy(how=How.XPATH, using =("//form/div[1]/div/div[4]/div/div/div[4]"))
 public static WebElement sleeplessNights;
 
 @FindBy(how=How.XPATH, using =("//form/div[1]/div/div[5]/div/div/div[4]"))
 public static WebElement leanMean; 
 
 @FindBy(how=How.XPATH, using =("//form/div[1]/div/div[6]/div/div/div[4]"))
 public static WebElement downDumps; 
 
 @FindBy(how=How.XPATH, using =("//*[@class='hay-btn hay-btn--no-touch']"))
 public static WebElement Next2;
 
}
