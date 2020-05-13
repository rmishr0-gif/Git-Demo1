package EndtoEnd;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class qacliclacademy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//Example of multiple window opening
		
		WebElement footerCoulumn= driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[4]/ul[1]"));
		
		System.out.println(footerCoulumn.findElements(By.tagName("a")).size());
		
		int countOfLinks= footerCoulumn.findElements(By.tagName("a")).size();
		
		for(int i=1; i<countOfLinks; i++) {
			
			
			String clickOnLinks = Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerCoulumn.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinks);
		}
		
		Set<String> ids= driver.getWindowHandles();
		Iterator<String> it= ids.iterator();
		
		while(it.hasNext()) {
			
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
	}

}
