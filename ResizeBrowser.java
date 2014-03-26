package SeleniumStudy;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ResizeBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new FirefoxDriver();
		Thread.sleep(1000);
		System.out.println("custom browser size ");
		dr.manage().window().setSize(new Dimension(600,400));
		Thread.sleep(1000);
		dr.quit();
		System.out.println("browser is closed");
	}
}
