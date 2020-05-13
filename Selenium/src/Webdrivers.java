import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdrivers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe"); 
		//Since all the browser are third party can not be invoked directly , each has .exe file given to invoke
		WebDriver driver = new ChromeDriver();//create Driver object for browser(chromedriver)
	/*	driver.get("https://www.collin.edu/ce/");
		//driver.findElement(By.id("search")).sendKeys("Java");
		//driver.findElement(By.className("form-submit")).click();
		driver.findElement(By.linkText("COUGARWEB LOGIN")).click();
		driver.findElement(By.id("username")).sendKeys("rmishr0");
		driver.findElement(By.id("password")).sendKeys("1234");
		driver.findElement(By.name("submit_form")).click();
		System.out.println(driver.findElement(By.id("status")).getText());*/
		
		driver.get("https://www.salesforce.com/form/signup/freetrial-elf-v2-hp/?d=cta-hp-promo-110");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("rashmi");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("joshy");
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("joshy");
		driver.findElement(By.xpath("//input[@name='UserTitle']")).sendKeys("joshy@icloud.com");
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("125374989");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("JCp");
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		//input[@id='UserFirstName-Q5v8'] 
		driver.close();
		
	
		
		
		
				
	}
}
