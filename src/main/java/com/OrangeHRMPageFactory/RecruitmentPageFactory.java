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
	
	@FindBy(xpath="//span[text()='Vacancies']")
	WebElement btnVacancies;
	
	
	public void ClickOnRecruitment() {
		btnRecruitment.click();
	}
	
	public void ClickOnVacancies() {
		btnVacancies.click();
	}
}
