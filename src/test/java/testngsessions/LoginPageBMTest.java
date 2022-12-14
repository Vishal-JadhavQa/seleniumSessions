package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageBMTest {

WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	@Test
	public void logoTest(){
		boolean flag = driver.findElement(By.cssSelector("img[title='naveenopencart']")).isDisplayed();
		Assert.assertEquals(flag, true);
	}
	
	@Test
	public void forgotPWDLinkExistTest(){
		Assert.assertTrue(driver.findElement(By.linkText("Forgotten Password")).isDisplayed());
	}
	
	@Test
	public void loginTest(){
		driver.findElement(By.id("input-email")).sendKeys("jvishh@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("India@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String errorMsg = driver.findElement(By.cssSelector("div.alert-dismissible")).getText().trim();
		System.out.println(errorMsg);
		Assert.assertEquals(errorMsg, "Warning: No match for E-Mail Address and/or Password.");
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
