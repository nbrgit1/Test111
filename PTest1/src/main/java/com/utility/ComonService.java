package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testbase.TestBase;

public class ComonService extends TestBase {
	
	public void waitForPageLoad()
	{
		String status;
		do
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			status=(String) js.executeScript("return document.readyState");
		}while(!status.equals("complete"));
		
	}
	
	public boolean waitForVisibility(WebElement element)
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver,50);
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

}
