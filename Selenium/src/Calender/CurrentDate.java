package Calender;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CurrentDate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	

		driver.get("https://www.makemytrip.com/"); // url of the browser
		driver.manage().window().maximize();
		 
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
		
		driver.findElement(By.xpath("c")).click();
		driver.findElement(By.cssSelector("span[class='appendRight10']")).click();
		Thread.sleep(3000L);
		driver.findElement(By.xpath( "//div[@class='appendBottom20']/ul[1]/li[3]")).click();
		Assert.assertEquals(driver.findElement(By.xpath( "//div[@class='appendBottom20']/ul[1]/li[3]")).getText(), "3");
		
		//guestCounter classSelect font12 darkText
		
		driver.findElement(By.xpath( "//div[@class='makeFlex column']/ul[1]/li[3]")).click();
		Assert.assertEquals(driver.findElement(By.xpath( "//div[@class='makeFlex column']/ul[1]/li[3]")).getText(), "2");
		
		driver.findElement(By.xpath( "//div[@class='makeFlex column pushRight']/ul[1]/li[1]")).click();
		Assert.assertEquals(driver.findElement(By.xpath( "//div[@class='makeFlex column pushRight']/ul[1]/li[1]")).getText(), "0");
		
	
		driver.findElement(By.xpath( "//ul[@class='guestCounter classSelect font12 darkText']/li[2]")).click();
		Assert.assertEquals(driver.findElement(By.xpath( "//ul[@class='guestCounter classSelect font12 darkText']/li[2]")).getText(), "Premium Economy");
		
		//System.out.println(driver.findElement(By.xpath("//p[@class='redText font11']")).getText());
		//Assert.assertEquals(driver.findElement(By.xpath("//p[@class='redText font11']")).getText(), "Number of infants cannot be more than adults");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		
	}

}
