import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.OrangeHRMPageFactory.ValidIDandPassPagefactory;
import com.Utility.ScreenShotUtility;

public class GetLeftBarTitle {
	
	static WebDriver driver;
	@Test
	public void LeftBarAndTitle() throws InterruptedException {
		
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
		//ScreenShotUtility.CaptureScreenShot(driver, "Login with Valid ISD and Pass");
		String getAccountName=driver.findElement(By.xpath("//span[@id='account-name']")).getText();
		System.out.println("The user’s name on left bar is: "+ getAccountName);
		System.out.println();
		Thread.sleep(3000);
		String getAccountJob=driver.findElement(By.xpath("//span[@id='account-job']")).getText();
		System.out.println("The title is on left bar is: "+ getAccountJob);
		
		Thread.sleep(5000);
		driver.close();
		
}
	
	
}
