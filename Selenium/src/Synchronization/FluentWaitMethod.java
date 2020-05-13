package Synchronization;

import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitMethod<WebDriver> {
	
	
	
	public void Title(String eTitle, String aTitle) {
		
		if (aTitle.equals(eTitle)) {
			
			System.out.println("Test Passed");
		}else {
			
			System.out.println("Test Failed");
		}
		
		
		
	}

}
