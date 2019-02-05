package com.testcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import com.modules.LoginPage;
import com.modules.MainPage;
import com.pageobjects.MainPageElements;
import com.utility.ComonService;

public class GivenTestCase extends ComonService{
  
   LoginPage loginPage=new LoginPage();
   MainPage mainPage=new MainPage();
   
	
  @Test
  public void execute() {
	  
	  driver.get("http://quickfuseapps.com/");
	  waitForPageLoad();
	  loginPage.click_createApp();
	  mainPage.Click_letsGetStarted();
	  mainPage.add_newPage();
	  mainPage.sen_SMS();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  initialize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
