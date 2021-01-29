package com.OrangeHRMPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePageFactory {

	
	public LeavePageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[text()=\'Leave\']")
	WebElement btnLeavePage;
	
	@FindBy(xpath="//span[text()='Leave List']")
	WebElement btnLeaveList;
	
	
	
	public void ClickLeavePage() {
		btnLeavePage.click();
	}
	
	public void ClickLeaveList() {
		btnLeaveList.click();
	}
	
	
}
