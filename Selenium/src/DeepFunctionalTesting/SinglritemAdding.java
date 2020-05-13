package DeepFunctionalTesting;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SinglritemAdding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		driver.manage().window().maximize();

		List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']"));

		for (int i = 0; i < products.size(); i++) {

			String name = products.get(i).getText();// getting text and index of all 30 items and storing
			
			if (name.contains("Cucumber")) {
				
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}

		}

	}

}
