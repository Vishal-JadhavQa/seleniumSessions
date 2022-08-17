package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		// webElement + actions(click, sendKeys, getText, isDisplayed..)
		
		// Locator : ID
		
		//1st
		
//		driver.findElement(By.id("input-email")).sendKeys("jvishh@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("India@123");
		
		//2nd
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		emailId.sendKeys("vishal@gmail.com");
//		password.sendKeys("India@123");
		
		//3rd By locator : Object repository
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		WebElement emailEle = driver.findElement(emailId);
//		WebElement passEle = driver.findElement(password);
//		
//		emailEle.sendKeys("jvishh@gmail.com");
//		passEle.sendKeys("India@123");
		
		//4th By locator + generic fun.
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		
		getElement(emailId).sendKeys("Vishal@gmail.com");
		getElement(password).sendKeys("India@123");
		
	}
	
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}

}
