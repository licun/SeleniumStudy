package SeleniumStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ForwardAndBack {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new FirefoxDriver();
		Thread.sleep(2000);
		
		String firsturl="http://www.baidu.com";
		System.out.printf("now accesss %s \n", firsturl);
		dr.get(firsturl);
		Thread.sleep(1000);
		
		String secondurl="http://www.soso.com";
		System.out.printf("now accesss %s \n", secondurl);
		dr.get(secondurl);
		Thread.sleep(1000);
		
		System.out.printf("now back to %s \n",firsturl);
		dr.navigate().back();
		Thread.sleep(1000);
		
		System.out.printf("now forward to %s \n",secondurl);
		dr.navigate().forward();
		Thread.sleep(1000);
		
		System.out.print("Browser will be close");
		dr.quit();
	}
}
