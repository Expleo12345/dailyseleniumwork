package com.cumcumber7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
 
import org.openqa.selenium.support.PageFactory;
 
 
 
public class LoginActions {
	LoginLocators loginPageLocators=null;
	
	
	
	public LoginActions() {
		this.loginPageLocators=new LoginLocators();
		PageFactory.initElements(HelperClass.getDriver(), loginPageLocators);
	}
	public void setUserName(String strUserName) {
		loginPageLocators.username.sendKeys(strUserName);
	}
	public void setPassword(String strPassword) {
		loginPageLocators.Password.sendKeys(strPassword);
	}
	public void clickLogin() {
		loginPageLocators.login.click();
	}
	
	public void login(String username, String password) {
		
		
		this.setUserName(username);
		this.setPassword(password);
		
		
 
}
}
 
