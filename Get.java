package SeleniumStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new FirefoxDriver();
		Thread.sleep(2000);
		
		String url="http://www.baidu.com";
		System.out.printf("now accesss %s \n",url);
		dr.get(url);
		Thread.sleep(1000);
		
		System.out.print("Browser will be close");
		dr.quit();
	}	
}
