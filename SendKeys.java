package SeleniumStudy;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SendKeys {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new FirefoxDriver();

		File file = new File("src/send_keys.html");
		String filePath = "file:///" + file.getAbsolutePath();
		System.out.printf("now accesss %s \n", filePath);

		dr.get(filePath);
		Thread.sleep(1000);

		dr.findElement(By.id("A")).sendKeys(Keys.chord(Keys.CONTROL + "a"));
		Thread.sleep(1000);
		dr.findElement(By.id("A")).sendKeys(Keys.chord(Keys.CONTROL + "x"));

		dr.findElement(By.id("B")).sendKeys(Keys.chord(Keys.CONTROL + "v"));

		dr.findElement(By.id("A"))
				.sendKeys(
						Keys.chord("watir webdriver is better than selenium webdriver"));

		Thread.sleep(1000);
		System.out.println("browser will be close");
		dr.quit();
	}
}
