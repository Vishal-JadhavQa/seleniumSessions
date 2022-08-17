package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandleOneByOne {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		//1st link
		driver.findElement(By.cssSelector("img[alt='LinkedIn OrangeHRM group']")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		String parentWindowId = it.next();
		String childWindowId = it.next();
		
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		//2nd link
		driver.findElement(By.cssSelector("img[alt='OrangeHRM on Facebook']")).click();
		
		Set<String> handles2 = driver.getWindowHandles();
		
		Iterator<String> it2 = handles2.iterator();
		parentWindowId = it2.next();
		childWindowId = it2.next();
		
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		//3rd link
		driver.findElement(By.cssSelector("img[alt='OrangeHRM on twitter']")).click();
		
		Set<String> handles3 = driver.getWindowHandles();
		
		Iterator<String> it3 = handles3.iterator();
		parentWindowId = it3.next();
		childWindowId = it3.next();
		
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		//4th link 
		driver.findElement(By.cssSelector("img[alt='OrangeHRM on youtube']")).click();
		
		Set<String> handles4 = driver.getWindowHandles();
		
		Iterator<String> it4 = handles4.iterator();
		parentWindowId = it4.next();
		childWindowId = it4.next();
		
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);

	}
}
