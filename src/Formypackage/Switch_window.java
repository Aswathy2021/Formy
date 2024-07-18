package Formypackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_window {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aswat\\OneDrive\\Desktop\\AUTOMATION\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://formy-project.herokuapp.com/switch-window");
		
		driver.manage().window().maximize();
		
	    WebElement Newtab = driver.findElement(By.id("new-tab-button"));
			
	    Newtab.click();
		 
	    Thread.sleep(3000);
		 
		String originalWindow = driver.getWindowHandle();
	        
	        
	       Set<String> allWindowHandles = driver.getWindowHandles();
	        
	        for (String windowHandle : allWindowHandles) {
	        	
	            if (!windowHandle.equals(originalWindow)) {
	            	
	                driver.switchTo().window(windowHandle);
	                
	                driver.close(); 
	                
	                break;                  
	            }
	        }
	     driver.switchTo().window(originalWindow);

		 
	    WebElement alert = driver.findElement(By.id("alert-button"));
			
		alert.click();
			
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		

	}

}
