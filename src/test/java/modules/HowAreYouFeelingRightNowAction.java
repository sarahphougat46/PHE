package modules;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import pageobjects.BaseClass;
import pageobjects.HowAreYouFeelingRightNowPage;
public class HowAreYouFeelingRightNowAction {
	
	public void dragReallyKnackered(int d)
	{
		Actions move=new Actions(BaseClass.driver);//
		Action action=(Action)move.dragAndDropBy(HowAreYouFeelingRightNowPage.reallyKnackered,d, 0).build();
		action.perform();
				
	}
	public void dragCanRunForMiles(int d)
	{
		Actions move=new Actions(BaseClass.driver);//
		Action action=(Action)move.dragAndDropBy(HowAreYouFeelingRightNowPage.canRunForMiles,d, 0).build();
		action.perform();
				
	}
	public void dragFeelingCalm(int d)
	{
		Actions move=new Actions(BaseClass.driver);//
		Action action=(Action)move.dragAndDropBy(HowAreYouFeelingRightNowPage.feelingCalm,d, 0).build();
		action.perform();
				
	}
	
	public void dragSleeplessNights(int d)
	{
		Actions move=new Actions(BaseClass.driver);//
		Action action=(Action)move.dragAndDropBy(HowAreYouFeelingRightNowPage.sleeplessNights,d, 0).build();
		action.perform();
	}
	public void dragLeanMean(int d)
	{
		Actions move=new Actions(BaseClass.driver);//
		Action action=(Action)move.dragAndDropBy(HowAreYouFeelingRightNowPage.leanMean,d, 0).build();
		action.perform();
		
	}
	public void dragDownDumps(int d)
	{
		Actions move=new Actions(BaseClass.driver);//
		Action action=(Action)move.dragAndDropBy(HowAreYouFeelingRightNowPage.downDumps,d, 0).build();
		action.perform();
		
	}
	public void clickNext()
	{
		HowAreYouFeelingRightNowPage.Next2.click();
	}
	
	


}
