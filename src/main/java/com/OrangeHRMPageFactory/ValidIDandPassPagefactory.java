package com.OrangeHRMPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidIDandPassPagefactory {
	
	public ValidIDandPassPagefactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//input[@id='txtUsername']")
	WebElement txtUserName;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	WebElement btnLogin;
	
	
	@FindBy(xpath="//i[contains(text(),'keyboard_arrow_down')]")
	WebElement btnDownArrow;
	
	@FindBy(xpath="//a[@id='logoutLink']")
	WebElement btnLogout;
	
	
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
	
	public void btnDownArrow() {
		btnDownArrow.click();
	}
	
	public void btnLogout() {
		btnLogout.click();
	}
}
