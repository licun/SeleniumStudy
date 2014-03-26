package SeleniumStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Download {
	public static void main(String[] args) {
		FirefoxProfile firefoxProfile = new FirefoxProfile();

		firefoxProfile.setPreference("browser.download.folderList", 2);
		firefoxProfile.setPreference(
				"browser.download.manager.showWhenStarting", false);
		firefoxProfile.setPreference("browser.download.dir", "c:\\downloads");
		firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk",
				"text/csv");

		WebDriver driver = new FirefoxDriver(firefoxProfile);
		// new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
		// capability);

		driver.navigate().to("http://www.myfile.com/hey.csv");
	}
}
