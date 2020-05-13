package WindowHandels;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.kohls.com/");
		driver.manage().window().maximize();

		driver.findElement(By.cssSelector(".dcp-banner-left")).click();
		System.out.println(driver.getTitle());
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> iterate = ids.iterator();
		String parentId = iterate.next();
		String childId = iterate.next();

		driver.switchTo().window(childId);
		
		
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//a[text()='Review our complete ']")).click();// element on child window
		ids = driver.getWindowHandles();
		 iterate = ids.iterator();
		// String childId1 = iterate.next();
			
		iterate.next();
		iterate.next();
	    String tab3 = iterate.next();
		

		driver.switchTo().window(tab3);
		
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentId);

	}

}
