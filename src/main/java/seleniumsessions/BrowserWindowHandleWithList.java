package seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandleWithList {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.cssSelector("img[alt='OrangeHRM on Facebook']")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		// Convert Set to List
		List<String> handlesList = new ArrayList<String>(handles);
		
		String parentWindowID = handlesList.get(0);
		String childWindowID = handlesList.get(1);
		
		driver.switchTo().window(childWindowID);
		System.out.println("Child window URL : " + driver.getCurrentUrl());
		
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		System.out.println("Parent window URL : " + driver.getCurrentUrl());
		System.out.println("Parent window title : " + driver.getTitle());
		
		driver.quit();
		
}
}