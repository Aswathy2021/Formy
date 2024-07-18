package Formypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\aswat\\OneDrive\\Desktop\\AUTOMATION\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://formy-project.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		 WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(5));
		
		WebElement drdw = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/li[6]/a")));
		
	    drdw.click(); 
	   
	    WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dropdownMenuButton\"]")));
	    
        dropdown.click();  
        
        

	}

}
