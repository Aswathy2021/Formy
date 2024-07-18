package Formypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Key_And_Mouse_Press {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\aswat\\OneDrive\\Desktop\\AUTOMATION\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://formy-project.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement key_mouse = driver.findElement(By.xpath("/html/body/div/div/li[9]/a"));
		
		key_mouse.click();
		 
	    WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(5));
		
		WebElement name = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"name\"]")));
		 
		name.sendKeys("ASWATHY P K");
		
		Thread.sleep(2000);
		
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"button\"]")));
		
		button.click();	
		
     }

  }


