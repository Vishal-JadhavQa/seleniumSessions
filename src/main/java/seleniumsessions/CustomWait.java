package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWait {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		By amazonDevices = By.linkText("Amazon Devices");
		
		retryingElement(amazonDevices, 20).click();
	}
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}
	
	public static WebElement retryingElement(By locator, int timeOut){
		
		WebElement element = null;
		int attempts = 0;
		
		while(attempts<timeOut){
			
			try{
			element = getElement(locator);
			break;
			}
			catch(NoSuchElementException e){
				System.out.println("Element is not found in attempt: " + attempts + "for locator :" + locator);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			attempts++;
	}
		
		if(element == null){
			try{
			throw new Exception("ElementNotFoundException");
			}
			catch(Exception e){
				System.out.println("Element is not found exception..tried for :" + timeOut + "secs" + 
						"with the interval of : " + 500 + "ms");
			}
		}
		return element;
	}
}
