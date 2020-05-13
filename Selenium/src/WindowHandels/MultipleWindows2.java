package WindowHandels;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindows2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.kohls.com/");
		driver.manage().window().maximize();

		driver.findElement(By.cssSelector(".dcp-banner-left")).click();
		MultplewindowUtility mW= new MultplewindowUtility();
		System.out.println(driver.getTitle());
		
		String tab = "";
		tab = mW.LastTab(driver);
		driver.switchTo().window(tab);		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[contains(text(),'Review our complete ')]")).click();
		
		
		tab = mW.LastTab(driver);
		driver.switchTo().window(tab);	
		
		System.out.println(driver.getTitle());
		
		
		tab = mW.FirstTab(driver);
		
		driver.switchTo().window(tab);
		
			
		
		driver.close();
		
		
		
//		
//		String parentId= it.next();
//		String childId= it.next();
//
//		driver.switchTo().window(childId);
//		System.out.println(driver.getTitle());
//		driver.findElement(By.xpath("//a[contains(text(),'Review our complete ')]")).click();
//		
//		ids=driver.getWindowHandles();
//		 it= ids.iterator();
//		 parentId=it.next();
//		 childId=it.next();
//		String childId2= it.next();
//		
//		driver.switchTo().window(childId2);
//		System.out.println(driver.getTitle());
//				driver.switchTo().window(parentId);
//		System.out.println(driver.getTitle());
//		
//
		
		
	
		
		
		

	}

}
