package EndtoEnd;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import WindowHandels.MultplewindowUtility;

public class Footersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());// count of links on whole page
		WebElement footerdriver = driver
				.findElement(By.xpath("//div[@class=' footer_top_agile_w3ls gffoot footer_style']"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());// count of links in footer section only

		WebElement footerColumn = footerdriver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul[1]"));
		System.out.println(footerColumn.findElements(By.tagName("a")).size());
		int countoflinks = footerColumn.findElements(By.tagName("a")).size();

		
		// opens all the tabs
		for (int i = 1; i < countoflinks; i++) {

			String clickonLinks = Keys.chord(Keys.CONTROL, Keys.ENTER);
			footerColumn.findElements(By.tagName("a")).get(i).sendKeys(clickonLinks);
		}
		
		//gets title of all windows
			Set<String> ids = driver.getWindowHandles();
			Iterator<String> it = ids.iterator();
			while (it.hasNext()) {

				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());

			}
		}
		// driver.close();
	

}
