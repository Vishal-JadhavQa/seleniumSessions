package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserRegister {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//1st 
		driver.findElement(By.id("input-firstname")).sendKeys("vishal");
		driver.findElement(By.id("input-lastname")).sendKeys("Jadhav");
		driver.findElement(By.id("input-email")).sendKeys("jvishh@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("+918655182452");
		driver.findElement(By.id("input-password")).sendKeys("India@123");
		driver.findElement(By.id("input-confirm")).sendKeys("India@123");
		
		
	}

}
