package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId = By.id("input-email");
		By password = By.id("input-email");
		By loginbtn = By.xpath("//input[@value='Login']");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement email_ele = wait.until(ExpectedConditions.presenceOfElementLocated(emailId));
//		
//		email_ele.sendKeys("vishal@gmail.com");
//		
//		driver.findElement(password).sendKeys("India@123");
//	
//		WebElement login_ele = wait.until(ExpectedConditions.presenceOfElementLocated(loginbtn));
//		login_ele.click();
		
		doSendKeysWithWait(emailId, 5, "vishal@gmail.com");
		doSendKeys(password, "India@123");
		doClick(loginbtn);
//		doSendKeysWithWait(loginbtn, 5, );
		
	}
	
	public static void doClick(By locator){
		getElement(locator).click();
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void doSendKeysWithWait(By locator, int timeOut, String value){
		waitForElementPresence(locator, timeOut).sendKeys(value);
	}
	/**
	 * An expectation for checking that an element is present on the DOM of a page. 
	 * This does not necessarily mean that the element is visible.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	
	public static WebElement waitForElementPresence(By locator, int timeOut){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}
