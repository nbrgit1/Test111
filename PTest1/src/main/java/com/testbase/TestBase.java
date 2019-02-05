package com.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
	
	public static WebDriver driver;
	
	
	public void initialize()
	{
		System.setProperty("webdriver.chrome.driver", "files/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-infobars");
		driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
