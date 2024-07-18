package Formypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Modal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\aswat\\OneDrive\\Desktop\\AUTOMATION\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://formy-project.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement modal = driver.findElement(By.xpath("/html/body/div/div/li[10]/a"));
		
		modal.click();
		
	    WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(5));
		  
	    WebElement Open_modal = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#modal-button")));
		  
        Open_modal.click();	
        
        WebElement close = wait.until(ExpectedConditions.elementToBeClickable(By.id("close-button")));
		  
        close.click();		 

	}

}
