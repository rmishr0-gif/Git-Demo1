package Dropdowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeUtility {

	
	public void ticketSearch(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(5000L, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/"); // url of the browser
		driver.manage().window().maximize();
		
		driver.findElement(By.id("fromCity")).click();
		WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));
		source.clear();
		source.sendKeys("pun");
		
		String expectedAirport= "Punta Arenas";
		
	while(!driver.findElement(By.xpath("//input[@placeholder='From']")).getAttribute("value").contains("Punta Arenas")) {
		
		source.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
	}
		String actualAirport= driver.findElement(By.xpath("//input[@placeholder='From']")).getAttribute("value");
		if (actualAirport.equals(expectedAirport)) {
			
			source.sendKeys(Keys.ENTER);
		}

	}

}
