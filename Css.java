package SeleniumStudy;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new FirefoxDriver();
		
        File file = new File("src/css.html");
        String filePath = "file:///" + file.getAbsolutePath();
        System.out.printf("now accesss %s \n", filePath);

        dr.get(filePath);
        Thread.sleep(1000);

        WebElement link = dr.findElement(By.id("tooltip"));

        System.out.println(link.getCssValue("color"));

        System.out.println(dr.findElement(By.tagName("h3")).getCssValue("font"));

        Thread.sleep(1000);
        System.out.println("browser will be close");
        dr.quit(); 
	}
}
