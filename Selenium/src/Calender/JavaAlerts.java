package Calender;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	

	/*	driver.get("http://demo.guru99.com/test/delete_customer.php"); // url of the browser
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();*/
		
		driver.get("https://www.redbus.in/");
		
		Thread.sleep(5000L);
		
		//System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		
	
		
		
	}

}
