package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pageobjects.MainPageElements;
import com.utility.ComonService;

public class MainPage extends ComonService {
	
	MainPageElements pageElements=new MainPageElements();
	Actions action=null;
	
	public void Click_letsGetStarted()
	{
		waitForPageLoad();
		pageElements.letsGetStarted().click();
	}
	
	public void add_newPage()
	{
		pageElements.newPage().click();
		pageElements.newPageName().sendKeys("Test");
		pageElements.createNewPage().click();
	}
	
	public void sen_SMS()
	{
		action=new Actions(driver);
		pageElements.messageMenu().click();
		waitForVisibility(pageElements.Messaging().get(2));
		action.dragAndDropBy(pageElements.Messaging().get(2), 500, 20).build().perform();
		action.dragAndDrop(pageElements.startNode().get(1), pageElements.MessageEnd()).build().perform();
		
		
		action.dragAndDropBy(pageElements.Messaging().get(1), 800, 60).build().perform();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
