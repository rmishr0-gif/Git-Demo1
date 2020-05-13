import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sortingtablecontent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
//driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		List<WebElement> firstcollist = driver.findElements(By.cssSelector("tr td:nth-child(2)"));

		ArrayList<String> originalArraylist = new ArrayList<String>();
		ArrayList<String> copiedArraylist = new ArrayList<String>();
		for (int i = 0; i < firstcollist.size(); i++) {

			 System.out.println((firstcollist.get(i).getText()));
			String tableContent = (firstcollist.get(i).getText());

			originalArraylist.add(tableContent);
		}

		// copy above list in new list

		for (int i = 0; i < originalArraylist.size(); i++) {

			copiedArraylist.add(originalArraylist.get(i));
		}
		
		System.out.println("*******************************************");
		
		Collections.sort(copiedArraylist);// sorting the content 
		
		for(String s:copiedArraylist ) {
			System.out.println(s);
		}
		
		Assert.assertTrue(originalArraylist.equals(copiedArraylist));// Test fails because original list was not sorted by default
	}

}
