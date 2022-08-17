package mytests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithNegativeTest {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}

	@DataProvider
	public Object[][] getLoginNegativeData() {
		return new Object[][] { 
			{ "tes14t@gmail.com", "India@123" }, 
			{ "test1@@gmail.com", "India@123" },
			{ "test11gmail.com", "India@123" }, 
			{ "testpp@gmailcom", " " }, 
			{ " ", "India@123" } };
	}

	@Test(dataProvider = "getLoginNegativeData")
	public void loginTestWithNegativeData(String usernmae, String password) {
		
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys("testselenium123666@gmail.com");
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String errorMesg = driver.findElement(By.cssSelector("div.alert-dismissible")).getText().trim();
		System.out.println(errorMesg);

		Assert.assertEquals(errorMesg, "Warning: No match for E-Mail Address and/or Password.");
	}
}
