import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.OrangeHRMPageFactory.ValidIDandPassPagefactory;
import com.Utility.ScreenShotUtility;

public class Expense {
	static WebDriver driver;
	@Test
	public void ClickOnExpense() throws InterruptedException {
		
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
		
		driver.findElement(By.xpath("//span[text()='Expense']")).click();
		Thread.sleep(3000);
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("scrollBy(0,500)");
		ScreenShotUtility.CaptureScreenShot(driver, "Expense List");
	
	}

}
