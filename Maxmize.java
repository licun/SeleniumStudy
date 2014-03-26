package SeleniumStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Maxmize {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new FirefoxDriver();
		Thread.sleep(2000);
		System.out.print("maxmize browser");
		dr.manage().window().maximize();
		System.out.println("Browser will be close");
		dr.quit();
	}
}
