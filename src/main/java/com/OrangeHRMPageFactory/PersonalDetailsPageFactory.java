package com.OrangeHRMPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetailsPageFactory {

	public PersonalDetailsPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//Clicking MyInfo
	@FindBy(xpath="//span[contains(text(),'My Info')]")
	WebElement clickOnMyInfo;
	
	@FindBy(xpath="//label[contains(text(),'Baseball')]")
	WebElement btnBaseBall;
	
	@FindBy(xpath="//label[contains(text(),'Basketball')]")
	WebElement btnBasketball;
	
	
	@FindBy(xpath="//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[2]/div[1]/custom-fields-panel[1]/div[2]/form[1]/materializecss-decorator[4]/div[1]/sf-decorator[1]/div[1]/button[1]")
	WebElement clickSavebtn;
	
	@FindBy(xpath="//span[contains(text(),'ohrm_jobs')]")
	WebElement btnJobs;
	
	public void ClickonMyInfo() {
		clickOnMyInfo.click();
	}
	
	public void clickBaseball() {
		btnBaseBall.click();
	}
		
	
	public void clickBasketball() {
		btnBasketball.click();
	}
	
	public void SaveBtn() {
		clickSavebtn.click();
	}
	
	public void ClickOnJobs() {
		btnJobs.click();
	}
}
