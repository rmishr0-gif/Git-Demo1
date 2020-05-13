package Calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NextMonthDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/"); // url of the browser
		driver.manage().window().maximize();

		DateUtility dateU = new DateUtility();
		dateU.departureDate(driver, "20");
		dateU.returnDate(driver, "30");

	}

}
