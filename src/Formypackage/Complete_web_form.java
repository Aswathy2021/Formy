package Formypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Complete_web_form {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\aswat\\OneDrive\\Desktop\\AUTOMATION\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
	   WebDriver driver = new ChromeDriver();
		
	   driver.navigate().to("https://formy-project.herokuapp.com/");
		
	   driver.manage().window().maximize();
		
	   WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(5));
		
	   WebElement completeform = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("	/html/body/div/div/li[14]/a")));
		
	   completeform.click();
		
	   WebElement firstname = wait.until(ExpectedConditions.elementToBeClickable(By.id("first-name")));
		
	   firstname.sendKeys("Aswathy");
	   
	   WebElement lastname = wait.until(ExpectedConditions.elementToBeClickable(By.id("last-name")));
		
	   lastname.sendKeys("P K");
	   
	   WebElement jobtitle = wait.until(ExpectedConditions.elementToBeClickable(By.id("job-title")));
		
	   jobtitle.sendKeys("Software Tester");
	      
	   WebElement education = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"radio-button-3\"]")));
		
	   education.click();
	   
	   WebElement gender = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"checkbox-2\"]")));
		
	   gender.click();
	   
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	    
	   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	   
	   Select experience = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"select-menu\"]"))));
		
	   experience.selectByVisibleText("0-1");    
	   
	   String month = "May 1998";
	   
	   WebElement dateofbirth =  wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#datepicker")));
		
	   dateofbirth.click();
       
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
