package Dropdowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Autosuggestivedropbox {

	
	public static void main(String[] args) throws InterruptedException {
		
	
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5000L, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/"); // url of the browser
		driver.manage().window().maximize();

		Thread.sleep(7000);

		driver.findElement(By.id("fromCity")).click();

		WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));
		source.clear();
		source.sendKeys("pun");

		Actions a = new Actions(driver);
		a.moveToElement(source).build().perform();
		a.moveToElement(source).sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		String script = "return document.getElementById(\"fromPlaceName\").value";

		String text = (String) js.executeScript(script);
		System.out.println(text);
		
		while(!text.equalsIgnoreCase("Punta Cana")) {
			
			a.moveToElement(source).sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
			text = (String) js.executeScript(script);// overriding value of text with new value
			text = (String) js.executeScript(script);
			
		}
	}

}
