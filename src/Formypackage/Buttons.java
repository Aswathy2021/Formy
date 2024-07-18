package Formypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\aswat\\OneDrive\\Desktop\\AUTOMATION\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.navigate().to("https://formy-project.herokuapp.com/buttons");
			
			driver.manage().window().maximize();
			
			WebElement primary = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[1]"));
			
			primary.click();
			
			Thread.sleep(1000);
			
            WebElement success = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[2]"));
			
		    success.click();
		    
		    Thread.sleep(1000);
		   
		    WebElement info = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[3]"));
			
		    info.click();
		    
		    Thread.sleep(1000);
		    
		    WebElement warning = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[4]"));
			
		    warning.click();
		    
		    Thread.sleep(1000);
		    
            WebElement danger = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[5]"));
			
		    danger.click();
		    
		    Thread.sleep(1000);
		    
            WebElement link = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[6]"));
			
		    link.click();
		    
		    Thread.sleep(1000);
		    
            WebElement left = driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[1]"));
			
		    left.click();
		    
		    Thread.sleep(1000);
		    
            WebElement middle = driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[2]"));
			
		    middle.click();
		    
		    Thread.sleep(1000);
		    
            WebElement right = driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[3]"));
			
		    right.click();
		    
		    Thread.sleep(1000);
		    
            WebElement one = driver.findElement(By.xpath(" /html/body/div/form/div[3]/div/div/div/button[1]"));
			
		    one.click();
		    
		    Thread.sleep(1000);
		    
            WebElement two = driver.findElement(By.xpath(" /html/body/div/form/div[3]/div/div/div/button[2]"));
			
		    two.click();
		    
		    Thread.sleep(1000);
		    
            WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"btnGroupDrop1\"]"));
			
		    dropdown.click();
		    
		    Thread.sleep(1000);
		    
            WebElement dropdown1 = driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/div/div/a[1]"));
			
		    dropdown1.click();
		    
		    Thread.sleep(1000);
		    
            WebElement dropdown2 = driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/div/div/a[2]"));
			
		    dropdown2.click();
		    
		    
		    
		
		    
		    
		    
		
		    
		    
		    
		   
		  
			
			
			
			
			
			
			
		

	}

}
