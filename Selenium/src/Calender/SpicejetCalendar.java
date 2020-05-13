package Calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpicejetCalendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/"); // url of the browser
		driver.manage().window().maximize();

		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		
		//WebElement nextButton = driver.findElement(By.cssSelector("a[class='ui-datepicker-next ui-corner-all']"));
		WebElement nextButton = driver.findElement(By.cssSelector("a[class='ui-datepicker-next ui-corner-all']"));
		nextButton.click();
		Thread.sleep(2000L);
		nextButton = driver.findElement(By.cssSelector("a[class='ui-datepicker-next ui-corner-all']"));
		nextButton.click();
		Thread.sleep(2000L);
		nextButton = driver.findElement(By.cssSelector("a[class='ui-datepicker-next ui-corner-all']"));
		nextButton.click();
		

		// driver.findElements(By.cssSelector("div[class='ui-datepicker-group
		// ui-datepicker-group-last'] td[data-handler='selectDay'] ")) Selects 2nd month
		// of box

		System.out.println(driver
				.findElements(By.cssSelector(
						"div[class='ui-datepicker-group ui-datepicker-group-last'] td[data-handler='selectDay'] "))
				.size());

		List<WebElement> lastMonths = driver.findElements(By.cssSelector(
				"div[class='ui-datepicker-group ui-datepicker-group-last'] td[data-handler='selectDay'] "));

		int count = driver
				.findElements(By.cssSelector(
						"div[class='ui-datepicker-group ui-datepicker-group-last'] td[data-handler='selectDay'] "))
				.size();

		for (int i = 0; i < count; i++) {

			String text = lastMonths.get(i).getText();

			if (text.equalsIgnoreCase("22")) {

				lastMonths.get(i).click();
				break;
			}
		}
	}

}
