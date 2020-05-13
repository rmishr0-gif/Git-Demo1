package WindowHandels;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultplewindowUtility {
	
	
	public String LastTab( WebDriver driver) {
		
		Set<String> ids= driver.getWindowHandles();
		Iterator<String> it= ids.iterator();
		String lastTab  = "";
		
		while (it.hasNext()) {
			lastTab = it.next();
		}
		
		return lastTab ;
				
		
	}

	
	public String FirstTab( WebDriver driver) {
		
		Set<String> ids= driver.getWindowHandles();
		Iterator<String> it= ids.iterator();
		String FirstTab  = "";
		
		FirstTab = it.next();
		return FirstTab ;
				
		
	}
	
	
}
