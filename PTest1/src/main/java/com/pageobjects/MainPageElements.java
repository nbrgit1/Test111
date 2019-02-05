package com.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testbase.TestBase;

public class MainPageElements extends TestBase {
	
	private WebElement element;
	
	public WebElement letsGetStarted()
	{
		return driver.findElement(By.xpath("//button[contains(text(),'get started')]"));
	}

	public WebElement newPage()
	{
		return driver.findElement(By.id("add-page"));
	}
	
	public WebElement newPageName()
	{
		return driver.findElement(By.xpath("//form[@class='unsubmittable']//input[@name='name']"));
	}
	
	public WebElement createNewPage()
	{
		return driver.findElement(By.xpath("(//button[text()='Create'])[2]"));
	}
	
	public WebElement messageMenu()
	{
		return driver.findElement(By.xpath("//a[contains(text(),'Messaging')]"));
	}
	public List<WebElement> Messaging()
	{
		List<WebElement> elist=driver.findElements(By.xpath("//ul//li[@class='module-item ui-widget-content ui-corner-all module-item-green ui-draggable']"));
		return elist;
	}
	
	public List<WebElement> startNode()
	{
		List<WebElement> elist=driver.findElements(By.xpath("//div[contains(@id,'node-')]"));
		return elist;
	}
	
	public WebElement MessageEnd()
	{
		return driver.findElement(By.xpath("//div[contains(@id,'rec-')]"));
	}
	
}
