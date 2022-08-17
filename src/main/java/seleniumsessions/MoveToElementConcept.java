package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		driver.get("http://mrbool.com/");
		driver.get("https://nsc.org.in/");
		
//		WebElement parentMenu =  driver.findElement(By.id("menu-item-1682"));
//		
//		Actions act = new Actions(driver);
//		act.moveToElement(parentMenu).perform();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.linkText("E-Learning")).click();	
		By parentMenu = By.id("menu-item-1682");
	//	By elearning = By.linkText("E-Learning");
		By parentMenu1 = By.linkText("Campaigns");
		By WorldEnvironmentDay = By.xpath("//*[@id='menu-item-1814']/a");
		
		handleTwoLevelMenuItems(parentMenu, parentMenu1, WorldEnvironmentDay, WorldEnvironmentDay);
		
	}
	//generic method for action class
	public static void handleTwoLevelMenuItems(By parentMenu, By parentMenu1,By childMenu, By childMenu1) throws InterruptedException{
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(2000);
		act.moveToElement(getElement(parentMenu1)).perform();
		getElement(childMenu).click();
		getElement(childMenu1).click();
	}
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
		
	}

}
