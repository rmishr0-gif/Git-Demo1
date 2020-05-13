package TablesExa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class qaclickacademy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement table= driver.findElement(By.cssSelector(".table-display"));
		
		int countrows= table.findElements(By.xpath("//tr")).size();
		System.out.println(countrows);
		for(int i=0; i<countrows; i++) {
			
			System.out.println(table.findElements(By.xpath("//tr")).get(i).getText());
		}
		
		
	}

}
