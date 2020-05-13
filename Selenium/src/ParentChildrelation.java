import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildrelation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		driver.findElement(By.cssSelector("input[name='emailOrPhone']")).sendKeys("awidc");
		driver.findElement(By.cssSelector("input[name='emailOrPhone']")).sendKeys("awidc");
		
		

	}

}
