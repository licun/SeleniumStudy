package SeleniumStudy;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OperateLocate {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new FirefoxDriver();
		
        File file = new File("src/operate_element.html");
        String filePath = "file:///" + file.getAbsolutePath();
        System.out.printf("now accesss %s \n", filePath);

        dr.get(filePath);
        Thread.sleep(1000);

        dr.findElement(By.linkText("Link1")).click();
        Thread.sleep(1000);
        dr.findElement(By.linkText("Link1")).click();

        WebElement element = dr.findElement(By.name("q"));
        element.sendKeys("something");
        Thread.sleep(1000);

        element.clear();

        Thread.sleep(1000);
        System.out.println("browser will be close");
        dr.quit();
	}
}
