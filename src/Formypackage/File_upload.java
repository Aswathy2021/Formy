package Formypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		

	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\aswat\\OneDrive\\Desktop\\AUTOMATION\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://formy-project.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement fileIn = driver.findElement(By.xpath("/html/body/div/div/li[8]/a"));
		
	    fileIn.click();
	    
	    Thread.sleep(3000);
		
		WebElement fileInput = driver.findElement(By.id("file-upload-field"));
		 	 
	    fileInput.sendKeys("\"C:\\Users\\aswat\\Downloads\\Software Testing Syllabus - One Team Solutions (2).pdf\"");
	    
	    Thread.sleep(4000);
	    
	    WebElement reset = driver.findElement(By.xpath("/html/body/div/form/div/div/span[2]/button"));
	    
	    reset.click();
	    
	    

	}

}
