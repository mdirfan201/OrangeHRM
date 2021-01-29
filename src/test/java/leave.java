import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.OrangeHRMPageFactory.LeavePageFactory;
import com.OrangeHRMPageFactory.ValidIDandPassPagefactory;
import com.Utility.ScreenShotUtility;

public class leave {
	
	static WebDriver driver;
	
	@Test
	public void ClickonLeavea() throws InterruptedException {
	
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
		
		LeavePageFactory leave= new LeavePageFactory(driver);
		leave.ClickLeavePage();
		ScreenShotUtility.CaptureScreenShot(driver, "LeavePage");
		Thread.sleep(5000);
		
		leave.ClickLeaveList();
		ScreenShotUtility.CaptureScreenShot(driver, "LeaveList");
		Thread.sleep(6000);
		driver.close();
		
	}
}
