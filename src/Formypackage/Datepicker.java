package Formypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Datepicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\aswat\\OneDrive\\Desktop\\AUTOMATION\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.navigate().to("https://formy-project.herokuapp.com/");
			
			driver.manage().window().maximize();
			
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			WebElement datepicker =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/li[4]/a")));
			
			datepicker.click();
			
		    String month = "May 1998";
			
            WebElement date =  wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#datepicker")));
			
			date.click();

	        Thread.sleep(2000);
	        
	        while(true)
	      
	        {
	        	
	        WebElement Monthyear =wait.until(ExpectedConditions.elementToBeClickable(By.className("datepicker-switch")));	
	       
	        String text = Monthyear.getText();
	       
	       if(text.equals(month))
	       {   
	        break ;  
	       }
	       
	       else
	       {  
	    	   WebElement Previousbutton =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[2]/th[1]")));	
	    	   Previousbutton.click();
	       }
	         
	        }
	        
	       WebElement day = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[4]/td[7]")));
	       day.click();
	}

}
