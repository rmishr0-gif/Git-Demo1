package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitGuru99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		String eTitle = "Demo Guru99 Page";
		String aTitle = "";
		driver.get("http://demo.guru99.com/test/guru99home/");
		aTitle = driver.getTitle();

		if (aTitle.equals(eTitle)) {

			System.out.println("Test Passed");
		} else {

			System.out.println(" Test failed");
		}

		driver.close();

	}

}
