import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//SSL certification
		
		DesiredCapabilities ch= DesiredCapabilities.chrome();// local browser
		ch.acceptInsecureCerts();// accepets certifications
		ch.setCapability(Type.a, value);
		ChromeOptions c= new ChromeOptions();// chrome browser
		c.merge(ch);
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("hf");
		
		
		
	}

}
