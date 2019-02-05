package com.modules;

import com.pageobjects.LoginPageElements;
import com.utility.ComonService;

public class LoginPage extends ComonService{
	
	LoginPageElements pageElements=new LoginPageElements();
	
	public void click_createApp()
	{
		driver.findElement(pageElements.createApp).click();
	}

}
