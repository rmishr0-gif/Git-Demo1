package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggablebox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
	System.out.println(driver.findElements(By.tagName("iframe")).size());
	driver.switchTo().frame(0);
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement source = driver.findElement(By.cssSelector("#draggable"));
		WebElement target = driver.findElement(By.cssSelector("#droppable"));

		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();;
		
		driver.switchTo().defaultContent();//go back to webpage
		driver.findElement(By.xpath("//div[@id='sidebar']/aside[2]/ul[1]/li[1]")).click();
		
		System.out.println(driver.getTitle());

	}

}
