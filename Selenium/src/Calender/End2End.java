package Calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class End2End {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("mum");
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("del");
		driver.findElement(By.cssSelector("#ctl00_mainContent_view_date1")).click();
		Thread.sleep(3000L);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {

			System.out.println("Its Enabled");
			Assert.assertTrue(false);

		} else {

			Assert.assertTrue(true);
		}

		driver.findElement(By.id("divpaxinfo")).click();

		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("4");

		Select s1 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		s.selectByVisibleText("2");

		Select s2 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		s2.selectByIndex(1);

		// ctl00_mainContent_DropDownListCurrency

		Select s3 = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s3.selectByVisibleText("USD");

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox'")).size());

		driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();

		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
