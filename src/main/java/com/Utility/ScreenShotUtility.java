package com.Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtility {

	public static void CaptureScreenShot(WebDriver driver, String FileName) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File SrcFile=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(SrcFile, new File("D:\\IRFAN---\\java program\\OrangeHRM\\ScreenShot" +FileName+ ".png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
