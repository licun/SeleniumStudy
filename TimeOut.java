package SeleniumStudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TimeOut {
	public static void main(String[] args) {
		WebDriver dr = new FirefoxDriver();
		dr.get("http://www.google.com.hk");

		dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		dr.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		dr.manage().timeouts().setScriptTimeout(3, TimeUnit.SECONDS);
	}
}
