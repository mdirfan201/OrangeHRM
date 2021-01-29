package com.OrangeHRMPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPageFactory {

	public RecruitmentPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Recruitment']")
	WebElement btnRecruitment;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[1]/div/div[5]/ul/li[7]/div/ul/li[1]/a/span[2]")
	WebElement btnVacancies;
	
	
	public void ClickOnRecruitment() {
		btnRecruitment.click();
	}
	
	public void ClickOnVacancies() {
		btnVacancies.click();
	}
}
