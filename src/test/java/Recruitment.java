import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.OrangeHRMPageFactory.RecruitmentPageFactory;
import com.OrangeHRMPageFactory.ValidIDandPassPagefactory;
import com.Utility.ScreenShotUtility;

public class Recruitment {

	static WebDriver driver;
	@Test
	public void ClickOnRecruitment() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\IRFAN---\\java program\\OrangeHRM\\Browser-Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
		
		String DashbordGetText=driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='content']/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]")).getText();
		System.out.println("The bottom of left pane on central object...: "+ DashbordGetText);
		
		Thread.sleep(2000);
		ValidIDandPassPagefactory Valid= new ValidIDandPassPagefactory(driver);
		Valid.setUserName("admin");
		Valid.setPassword("admin123");
		Valid.ClickLoginBtn();
		Thread.sleep(4000);
		
		RecruitmentPageFactory rec= new RecruitmentPageFactory(driver);
		rec.ClickOnRecruitment();
		ScreenShotUtility.CaptureScreenShot(driver, "Recruitment");
		Thread.sleep(5000);
		
		rec.ClickOnVacancies();
		ScreenShotUtility.CaptureScreenShot(driver, "Vacancies");
		Thread.sleep(10000);
		driver.close();
	}
	
}
