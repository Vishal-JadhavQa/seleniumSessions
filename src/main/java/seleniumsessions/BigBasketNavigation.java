package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BigBasketNavigation {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(5000);
		selectLevel4Product("Beauty & Hygiene", "Men's Grooming", "Moustache & Beard Care", "Soap");
	}
	public static void selectLevel4Product(String L1, String L2, String L3, String L4) throws InterruptedException{
		WebElement mainCat = driver.findElement(By.cssSelector("a.meganav-shop"));
		
		Actions act = new Actions(driver);
		act.moveToElement(mainCat).perform();
		Thread.sleep(2000);
		
		act.moveToElement(driver.findElement(By.linkText(L1))).perform();
		Thread.sleep(2000);

		act.moveToElement(driver.findElement(By.linkText(L2))).perform();
		Thread.sleep(1500);
		
		act.moveToElement(driver.findElement(By.linkText(L3))).perform();
		Thread.sleep(1500);
		
		act.moveToElement(driver.findElement(By.linkText(L4))).perform();
		Thread.sleep(1500);	
		
	}
	public static By selectProduct(String selector){
		By locator = By.linkText(selector);
		return locator;
		
	}

}
