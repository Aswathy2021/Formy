package Formypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\aswat\\OneDrive\\Desktop\\AUTOMATION\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://formy-project.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement draganddrop = driver.findElement(By.xpath("/html/body/div/div/li[5]/a"));
		
	    draganddrop.click();		
		
		Actions act = new Actions(driver);
		
		WebElement sourceElement = driver.findElement(By.xpath("//*[@id=\"image\"]/img"));
		
		WebElement targetElement = driver.findElement(By.id("box"));
		
		act.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		

	}

}


