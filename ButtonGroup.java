package SeleniumStudy;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ButtonGroup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new FirefoxDriver();

		File file = new File("src/button_group.html");
		String filePath = "file:///" + file.getAbsolutePath();
		System.out.printf("now accesss %s \n", filePath);

		dr.get(filePath);
		Thread.sleep(1000);

		List<WebElement> btns = dr.findElement(By.className("btn-group"))
				.findElements(By.className("btn"));

		for (WebElement btn : btns) {
			if (btn.getText().equals("second")) {
				btn.click();
				break;
			}
		}

		Thread.sleep(1000);
		System.out.println("browser will be close");
		dr.quit();
	}
}
