package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class userRegistration {

WebDriver driver;
	
	@BeforeTest
	public void setup(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	}
	@Test
		public void userRegister(){
		driver.findElement(By.id("input-firstname")).sendKeys("Vishal");
		driver.findElement(By.id("input-lastname")).sendKeys("India@123");
		driver.findElement(By.id("input-email")).sendKeys("vj6344@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("9666587410");
		driver.findElement(By.id("input-password")).sendKeys("India@123");
		driver.findElement(By.id("input-confirm")).sendKeys("India@123");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();	
	}
	@Test
	public void captureMsg(){
		
		String captureMsg = driver.findElement(By.cssSelector("div[id='content'] h1")).getText().trim();
		System.out.println(captureMsg);
		Assert.assertEquals(captureMsg, "Your Account Has Been Created!");
	}
	@AfterTest
	public void quitBrowser(){
		driver.quit();
	}
	}

