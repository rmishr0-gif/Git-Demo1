package DeepFunctionalTesting;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleitemAdding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.manage().window().maximize();
		
		String[] itemsNeeded= {  "Cauliflower","Cucumber","Beetroot"}; 
		
		
		List<WebElement> products=driver.findElements(By.cssSelector("h4[class='product-name']" ));// common in all items in array
	
		int j=0;
		for(int i=0; i<products.size(); i++) {
			//convert array to arraylist for easy search and saving memory
			
			List itemsNeededList=Arrays.asList(itemsNeeded);//converting array to arraylist
			
			
			String[]  name = products.get(i).getText().split("-");// spilt always return in array
			String formattedName= name[0].trim();//removing spaces
	System.out.println(formattedName);
			
			
			
			if(itemsNeededList.contains(formattedName)) {
				
				System.out.println("found:" + i);
				System.out.println(formattedName);
				
				j++;
				
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				//break;can not use break when you have multiple values in array
				
				if(j==itemsNeeded.length) {
					break;
				}
				
			}
		}
	}

}
