package seleniumsessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLocators {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1. id : unique attribute	
		
		//2. name : can be duplicate 
//		driver.findElement(By.name("email")).sendKeys("vishal@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("India@123");
		
//		By emailId = By.name("email"); 
//		String email_name = "email";
//		String email_password = "password";
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(emailId, "vishal@gmail.com");
//		eleUtil.doSendKeys("name", email_password, "India@123");

		//3. classname : can be duplicate for multiple elements..use only when its unique for the single element
//		driver.findElement(By.className("form-control")).sendKeys("vishal@gmail.com");
		
		//4. xpath : is not attribute. its the address of the element in HTML DOM
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("vishal@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("India@123");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
		//5. By locator
		By emailId = By.xpath("//*[@id=\"input-email\"]");
		String password_xpath = "//*[@id=\"input-password\"]";
		By loginBtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(emailId, "vishal@gmail.com");
		eleUtil.doSendKeys("xpath", password_xpath, "India@123");
		eleUtil.doClick(loginBtn);
		//doClick(loginBtn);
		
	}
	public static void doClick(By locator){
		getElement(locator).click();
	}
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}

}
