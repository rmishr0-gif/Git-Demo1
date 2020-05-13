package Calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DateUtility {
	
	public void departureDate(WebDriver driver, String depdate) {
		 driver.findElement(By.xpath("//div[@class='fsw_inner ']/div[3]")).click();
	WebElement nextButton= driver.findElement(By.xpath("//div[@class='DayPicker-NavBar']/span[2]"));
	nextButton.click();
	
	WebElement aprilMonth= driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[2]"));//selecting months
	
	System.out.println(aprilMonth.findElements(By.cssSelector("div[class='DayPicker-Day']")).size());//counting dates in April month
			
	int count =aprilMonth.findElements(By.cssSelector("div[class='DayPicker-Day']")).size();
	
	List<WebElement> dates= aprilMonth.findElements(By.cssSelector("div[class='DayPicker-Day']"));
	
//	List<WebElement> aprilDates= aprilMonth.findElements(By.cssSelector("div[class='DayPicker-Day']"));
	
	for(int i=0; i<count;i++) {
		
		String text= dates.get(i).getText();
		
		if(text.equalsIgnoreCase(depdate)) {
			
			
			dates.get(i).click();
			break;
		}
	}
	}
	
	public void returnDate(WebDriver driver, String redate) {
		
		 driver.findElement(By.xpath("//div[@class='fsw_inner ']/div[4]")).click();
		
		WebElement nextButton= driver.findElement(By.xpath("//div[@class='DayPicker-NavBar']/span[2]"));
		//nextButton.click();
		
		WebElement aprilMonth= driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[1]"));//selecting months
		
		System.out.println(aprilMonth.findElements(By.cssSelector("div[class='DayPicker-Day']")).size());//counting dates in April month
				
		int count =aprilMonth.findElements(By.cssSelector("div[class='DayPicker-Day']")).size();
		
		List<WebElement> dates= aprilMonth.findElements(By.cssSelector("div[class='DayPicker-Day']"));
		
//		List<WebElement> aprilDates= aprilMonth.findElements(By.cssSelector("div[class='DayPicker-Day']"));
		
		for(int i=0; i<count;i++) {
			
			String text= dates.get(i).getText();
			
			if(text.equalsIgnoreCase(redate)) {
				
				
				dates.get(i).click();
				break;
			}
		}
		}

}
