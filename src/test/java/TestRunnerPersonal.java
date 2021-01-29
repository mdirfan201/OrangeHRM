import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.OrangeHRMPageFactory.PersonalDetailsPageFactory;
import com.OrangeHRMPageFactory.ValidIDandPassPagefactory;
import com.Utility.ScreenShotUtility;

public class TestRunnerPersonal {

	
	static WebDriver driver;
	
	@Test
	public void PersonalDetailsPrefrence() throws InterruptedException {
		
	
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
		
		  PersonalDetailsPageFactory perdetails= new PersonalDetailsPageFactory(driver);
		  perdetails.ClickonMyInfo(); 
		  Thread.sleep(25000);
		 
		System.out.println("Scrolling Down to Prefrences");
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("scrollBy(0,900)");
		
		Thread.sleep(3000);
		perdetails.clickBaseball();
		perdetails.clickBasketball();
		perdetails.SaveBtn();
		Thread.sleep(3000);
		ScreenShotUtility.CaptureScreenShot(driver, "CheckBok Save successfully");
		
		perdetails.ClickOnJobs();
		
		
		//Validate BaseBall and BasketBall Clickable
		Thread.sleep(6000);
		perdetails.ClickonMyInfo(); 
		 Thread.sleep(5000);
		 
		System.out.println("Scrolling Down to Prefrences");
		JavascriptExecutor jse1= (JavascriptExecutor)driver;
		jse1.executeScript("scrollBy(0,900)");
		ScreenShotUtility.CaptureScreenShot(driver, "Verify Checkbox");
		Thread.sleep(5000);
		
		driver.close();
	}
	

//	@AfterMethod
//	public void tearDown() {
//		driver.close();
//	}
}
