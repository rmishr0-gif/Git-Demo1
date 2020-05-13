package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DynamicDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");

		driver.manage().window().maximize();
		
		//get the count of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox'")).size());
		
		//System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		Assert.assertFalse(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		//System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
	
		driver.findElement(By.xpath("//input[@name='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='DED']")).click();
		// Thread.sleep(2000L);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		// driver.findElement(By.xpath("//a[@value='MAA']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']"))
				.click();
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isDisplayed());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isDisplayed());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	if(	driver.findElement(By.id("Div1")).getAttribute("Style")	.contains("1")	) {
		
		System.out.println("Its enabled");
		Assert.assertTrue(true);
	}else {
		
		
		Assert.assertTrue(false);
	}
		

	}

}
