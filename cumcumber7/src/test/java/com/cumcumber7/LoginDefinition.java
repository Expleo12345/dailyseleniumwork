package com.cumcumber7;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class LoginDefinition {
	LoginActions objLogin = new LoginActions();
	UtitlityClass data = new UtitlityClass();
	HomePageActions objHome = new HomePageActions();
	
 
	@Given("User is on OrangeHRM Login page")
	public void user_is_on_orange_hrm_login_page() {
		HelperClass.openPage(data.strUrl);
	    System.out.println("login page");
		
		
	}
 
	@When("User enters Correct username and password")
	public void user_enters_correct_username_and_password() {
		objLogin.login(data.strUserName, data.strPassword);
		   System.out.println("Username and password");
		
 
	}
   
	@When("User clicks login")
	public void user_clicks_login() throws InterruptedException {
		
		   objLogin.clickLogin();
		   System.out.println("login button");
		
 
	}
 
	@Then("User should be able to login sucessfully")
	public void user_should_be_able_to_login_sucessfully() {
		Assert.assertTrue(objHome.getVerifyText().contains("Dashboard"));
		   System.out.println("sucessfull login");
	}
 
}
 
