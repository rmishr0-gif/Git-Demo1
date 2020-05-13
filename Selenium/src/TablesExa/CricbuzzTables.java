package TablesExa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricbuzzTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/22972/afg-vs-wi-1st-odi-afghanistan-v-west-indies-in-india-2019"); // url
																																	// of
																																	// the
																																	// browser
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		// System.out.println(table.findElements(By.cssSelector("div[class='cb-col
		// cb-col-100 cb-scrd-itms']")).size());
		System.out.println(table
				.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size());

		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"))
				.size();
		int sum = 0;
		for (int i = 0; i < count - 2; i++) {

			String value = table
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i)
					.getText();
			int valueInteger = Integer.parseInt(value);

			sum = sum + valueInteger;

		}
		// System.out.println(sum);

		String extras = table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div[1]")).getText();
		int extrasValue = Integer.parseInt(extras);
		int totalValue = sum + extrasValue;
		System.out.println(totalValue);

		//System.out.println(table.findElement(By.xpath("//div[text()='Total']/following-sibling::div[1]")).getText());
		
		String actualTotal = table.findElement(By.xpath("//div[text()='Total']/following-sibling::div[1]")).getText();
		int actualTotalvalue= Integer.parseInt(actualTotal);
		
		if (actualTotalvalue==totalValue ) {
			
			System.out.println("Count Matches");
		}else {
			
			
			System.out.println("Count does not  Matche");
		}
	}

}
