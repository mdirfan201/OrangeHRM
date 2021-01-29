import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.OrangeHRMPageFactory.ValidIDandPassPagefactory;

public class ValidateCompanyNameColor {

	static WebDriver driver;
	@Test
	public void ValidateCompanyNameAndColor() throws InterruptedException {
		
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
		Valid.btnDownArrow();
		driver.findElement(By.xpath("//a[@id='aboutDisplayLink']")).click();
		
		Thread.sleep(5000);
		String alertMessage =driver.findElement(By.xpath("//p[contains(text(),'Company Name: OrangeHRM (Pvt) Ltd(Parallel Demo)')]")).getText();
		                                                  //p[contains(text(),'Company Name: OrangeHRM (Pvt) Lghvgvhg')]
		if(alertMessage.contentEquals("Company Name: OrangeHRM (Pvt) Ltd(Parallel Demo)")) {
		System.out.println("The Company name is :"+alertMessage);
			
		}
		//Ensure that banner color of the dialog is “#00ac51”.
		WebElement eleSearch = driver.findElement(By.xpath("//h4[contains(text(),'About')]"));
		String rgbFormat = eleSearch.getCssValue("background-color");
		    
		String hexcolor = Color.fromString(rgbFormat).asHex(); 
		System.out.println("The banner color of the dialog is: "+ hexcolor);
    }
		
}
