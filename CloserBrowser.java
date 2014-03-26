package SeleniumStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloserBrowser {
	public static void main(String[] args) {
		WebDriver dr=new FirefoxDriver();
		System.out.print("Browser will be close");
		dr.quit();
	}
}
