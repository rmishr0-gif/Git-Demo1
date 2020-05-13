package Synchronization;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ImplicitWait2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		driver.manage().window().maximize();

		String[] itemsNeeded = { "Cauliflower", "Cucumber", "Beetroot" };

		ImplicitWaitMethod implictWait = new ImplicitWaitMethod();

		implictWait.addItems(driver, itemsNeeded);

		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		driver.findElement(By.cssSelector(".promoCode")).click();
		
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		
	//	Assert.assertTrue(driver.findElement(By.cssSelector(".promoInfo")).isDisplayed());
		
		driver.findElement(By.cssSelector(".promoBtn")).click();
		
		//Thread.sleep(5000L);
		
		WebDriverWait wait= new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".promoInfo")));
		
		 WebElement textPresent = driver.findElement(By.cssSelector(".promoInfo"));
		 
		 if (textPresent.equals(textPresent)) {
			 
			 System.out.println("Text present");
		 }
		 else {
			 System.out.println("Text not present");
		 }
	//System.out.println((driver.findElement(By.cssSelector(".promoInfo")).getText()));
	
	
	
	}

}
