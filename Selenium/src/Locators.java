import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		// Since all the browser are third party can not be invoked directly , each has
		// .exe file given to invoke
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("a[title*='Already a user? Sign in']")).click();

		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("weuriur");

		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("12344");

		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();

		// driver.close();

	}

}
