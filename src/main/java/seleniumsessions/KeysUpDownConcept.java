package seleniumsessions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeysUpDownConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");	
		
		Actions act = new Actions(driver);
		
		//Scroll down using action class
		act.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		
		Thread.sleep(2000);
		
		//Scroll up using action class
		act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		
	}

}
