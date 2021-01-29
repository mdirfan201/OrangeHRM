import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.OrangeHRMPageFactory.InvalidCredentials;
import com.OrangeHRMPageFactory.ValidIDandPassPagefactory;
import com.Utility.ScreenShotUtility;

public class TestOrangeHRM {

	
	static WebDriver driver;
	@Test
	public void ExeOragneHRMApp() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\IRFAN---\\java program\\OrangeHRM\\Browser-Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
		
		String DashbordGetText=driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='content']/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]")).getText();
		System.out.println("The bottom of left pane on central object...: "+ DashbordGetText);
		
		Thread.sleep(2000);
		
		
		  InvalidCredentials invalid= new InvalidCredentials(driver);
		  invalid.setUserName("admin12345"); 
		  invalid.setPassword("admin");
		  Thread.sleep(2000); invalid.ClickLoginBtn();
		  
		  Thread.sleep(3000); 
		  String InvalidGetText=driver.findElement(By.xpath("//div[contains(text(),'Invalid Credentials')]")).getText(); 
		  System.out.println("Massage for InvalidCredentials is: "+InvalidGetText); 
		  Thread.sleep(4000);
		 
		
		//  driver.navigate().back(); 
		 // Thread.sleep(6000);
		 
		
		
		ValidIDandPassPagefactory Valid= new ValidIDandPassPagefactory(driver);
		Valid.setUserName("admin");
		Valid.setPassword("admin123");
		Valid.ClickLoginBtn();
		Thread.sleep(3000);
		ScreenShotUtility.CaptureScreenShot(driver, "Login with Valid ISD and Pass");
		Valid.btnDownArrow();
		Thread.sleep(5000);
		Valid.btnLogout();
		
		driver.close();
		
	}
	

}
