package SeleniumStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleAndUrl {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new FirefoxDriver();
		Thread.sleep(2000);
		
		String url="http://www.baidu.com";
		System.out.printf("now accesss is %s \n",url);
		dr.get(url);
		Thread.sleep(1000);
		
		System.out.printf("Title of current page is %s \n", dr.getTitle());
		System.out.printf("Url of current page is %s \n",dr.getCurrentUrl());
		
		System.out.print("Browser will be close");
		dr.quit();
	}

}
