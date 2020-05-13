package WindowHandels;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindowsguru99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.kohls.com/");
		driver.manage().window().maximize();

		System.out.println(driver.getTitle());

		driver.findElement(By.cssSelector(".dcp-banner-left")).click();

		String mainWindows = driver.getWindowHandle();// parent window

		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();// iterating set

		while (it.hasNext()) {

			String childWindow = it.next();
			
			if (!mainWindows.equals(childWindow)) {

				driver.switchTo().window(childWindow);
				System.out.println(driver.getTitle());
				driver.findElement(By.xpath("//a[text()='Review our complete ']")).click();
				
			}

		}
		
		
		driver.switchTo().window(mainWindows);
		System.out.println(driver.getTitle());
	}

}
