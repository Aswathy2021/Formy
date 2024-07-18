package Formypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aswat\\OneDrive\\Desktop\\AUTOMATION\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://formy-project.herokuapp.com/autocomplete");
		
		driver.manage().window().maximize();
	
        WebElement address = driver.findElement(By.xpath("//*[@id=\"autocomplete\"]"));
		
		address.sendKeys("Flat 302, Al Safa Building");
		
	    WebElement street1 = driver.findElement(By.xpath("//*[@id=\"street_number\"]"));
			
	    street1.sendKeys("Damascus street");
	    
	    WebElement street2 = driver.findElement(By.xpath("//*[@id=\"route\"]"));
		
	    street2.sendKeys("Al Nahda 1");
	    
        WebElement city = driver.findElement(By.id("locality"));
		
	    city.sendKeys("Al Nahda");
	    
        WebElement state = driver.findElement(By.id("administrative_area_level_1"));
		
	    state.sendKeys("Dubai");
	    
	    
        WebElement zip = driver.findElement(By.id("postal_code"));
		
	    zip.sendKeys("98623");
	    
        WebElement country = driver.findElement(By.id("country"));
		
	    country.sendKeys("United Arab Emirates");
	}

}
