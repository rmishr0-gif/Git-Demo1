package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StaticDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");

		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".paxinfo")).click();
		Thread.sleep(2000L);
		int count = 9;

		for (int i = 1; i < count; i++) {

			driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']/option[3]")).click();
		}
		Assert.assertEquals(driver.findElement(By.cssSelector(".paxinfo")).getText(), "3 Adult");
		//System.out.println(driver.findElement(By.cssSelector(".paxinfo")).getText());

		// Select s = new
		// Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']")));
		// s.selectByVisibleText("2");
		// s.selectByIndex(3);
		Select s1 = new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Child']")));
		s1.selectByValue("2");
		Select s2 = new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Infant']")));
		s2.selectByIndex(2);
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']")).click();
		Select s3 = new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']")));
		s3.selectByVisibleText("USD");
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
