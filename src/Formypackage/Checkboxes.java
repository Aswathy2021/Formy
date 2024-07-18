package Formypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\aswat\\OneDrive\\Desktop\\AUTOMATION\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.navigate().to("https://formy-project.herokuapp.com/");
			
			driver.manage().window().maximize();
			
			WebElement checkbox = driver.findElement(By.xpath("/html/body/div/div/li[3]/a"));
			 
		    Actions ae = new Actions(driver);
		    
		    ae.click(checkbox).perform();
		    
		    WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(5));
			
		    WebElement checkbox1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("checkbox-1")));
		    
            checkbox1.click();
		    
           WebElement checkbox2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("checkbox-2")));
		    
            checkbox2.click();
		    
           WebElement checkbox3 = wait.until(ExpectedConditions.elementToBeClickable(By.id("checkbox-3")));
		    
            checkbox3.click();
		    
		
		

	}

}
