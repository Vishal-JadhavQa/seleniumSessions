package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandle {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.cssSelector("img[alt='OrangeHRM on Facebook']")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String parentWindowID = it.next();	
		System.out.println("This is parent window ID " + parentWindowID);
		
		String childWindowID = it.next();
		System.out.println("This is child window ID " + childWindowID);

		driver.switchTo().window(childWindowID);
		System.out.println("Child window URL : " + driver.getCurrentUrl());
		
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		System.out.println("Parent window URL : " + driver.getCurrentUrl());
		System.out.println("Parent window title : " + driver.getTitle());
		
		driver.quit();
	}
}
