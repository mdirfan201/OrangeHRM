package com.OrangeHRMPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvalidCredentials {
	
	public InvalidCredentials(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='txtUsername']")
	WebElement txtUserName;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	WebElement btnLogin;
	
	
	public void setUserName(String UserName) throws InterruptedException {
		txtUserName.clear();
		Thread.sleep(3000);
		txtUserName.sendKeys(UserName);
	}
	
	
	public void setPassword(String Password) throws InterruptedException {
		txtPassword.clear();
		Thread.sleep(3000);
		txtPassword.sendKeys(Password);
	}
	
	
	public void ClickLoginBtn() {
		btnLogin.click();
	}
	

}
