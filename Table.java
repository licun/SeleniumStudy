package SeleniumStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table {
	private WebDriver driver;

	Table(WebDriver driver) {
		this.driver = driver;
	}

	public String getCellText(By by, String tableCellAddress) {

		WebElement table = driver.findElement(by);

		int index = tableCellAddress.trim().indexOf('.');
		int row = Integer.parseInt(tableCellAddress.substring(0, index));
		int cell = Integer.parseInt(tableCellAddress.substring(index + 1));

		List<WebElement> rows = table.findElements(By.tagName("tr"));
		WebElement theRow = rows.get(row);

		String text = getCell(theRow, cell).getText();
		return text;
	}

	private WebElement getCell(WebElement Row, int cell) {
		List<WebElement> cells;
		WebElement target = null;

		if (Row.findElements(By.tagName("th")).size() > 0) {
			cells = Row.findElements(By.tagName("th"));

			target = cells.get(cell);
		}
		if (Row.findElements(By.tagName("td")).size() > 0) {
			cells = Row.findElements(By.tagName("td"));
			target = cells.get(cell);
		}
		return target;
	}

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///E:/table.html");
		Table table = new Table(driver);
		By by = By.id("myTable");
		String address = "0.2";
		System.out.println(table.getCellText(by, address));
	}
}
