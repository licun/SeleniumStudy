package SeleniumStudy;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShotScreen {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver dr=new FirefoxDriver();
		dr.get("http://www.google.com.hk");
		Thread.sleep(1000);
		
		File screenShotFile = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShotFile, new File("D:/test.png"));
		
		System.out.print("Browser will be close");
		dr.quit();
	}
}
