package Dropdowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	

		driver.get("https://www.makemytrip.com/"); // url of the browser
		 
		Thread.sleep(7000);
		 
		driver.findElement(By.id("fromCity")).click();
				
		WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));
		 
		source.sendKeys("mum");
		 
		Thread.sleep(3000);
		 
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ARROW_DOWN);
		 
		source.sendKeys(Keys.ENTER);
		 
		WebElement destination = driver.findElement(By.cssSelector("input[placeholder='To']"));
		 
		destination.sendKeys("del");
		 
		destination.sendKeys(Keys.ARROW_DOWN);
		 
		destination.sendKeys(Keys.ENTER);
		
		
		driver.findElement(By.xpath("//div[@class='fsw_inputBox dates inactiveWidget ']")).click();
		
	}

}
