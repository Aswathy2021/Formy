package Formypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Radio_Button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\aswat\\OneDrive\\Desktop\\AUTOMATION\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
	   WebDriver driver = new ChromeDriver();
		
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));	
		
       driver.navigate().to("https://formy-project.herokuapp.com/");
		
	   driver.manage().window().maximize();
		
	   WebElement radiobtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/li[12]/a")));
		
       radiobtn.click();
		
	   WebElement radioButton1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("radio-button-1")));
	   
	   if (radioButton1.isSelected()) {
		   
           System.out.println("Radio Button 1 is already selected");
           
       } else {
           radioButton1.click();
           
       }    
	   
	   Thread.sleep(3000);
	    
	   WebElement radioButton2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[2]/input"))); 
        
       radioButton2.click();
        
       WebElement radioButton3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[3]/input")));
        
       radioButton3.click();
	}

}
