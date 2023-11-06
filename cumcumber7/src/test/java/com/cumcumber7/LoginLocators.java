package com.cumcumber7;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class LoginLocators {
@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
public WebElement username;
@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
public WebElement Password;
@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
public WebElement login;
 
}