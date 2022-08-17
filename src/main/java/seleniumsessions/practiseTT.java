package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practiseTT {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://beta.talenticks.meetcs.com/lauth/login");
		
		System.out.println(driver.findElement(By.tagName("title")).getText());
		
		driver.findElement(By.xpath("//*[@id='login_form']/div/div[2]/input")).sendKeys("apps000");
		driver.findElement(By.xpath("//*[@id='login_form']/div/div[3]/input")).sendKeys("Apps@123");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(3000);
		
//		WebElement sourceEle = driver.findElement(By.xpath("//*[@id='map']"));
//		WebElement targetEle = driver.findElement(By.xpath("//*[@id='li_profile']/div/div"));
//		
//		Actions act = new Actions(driver);
//		act.clickAndHold(sourceEle).moveToElement(targetEle).release().build().perform();
//	
//		act.dragAndDrop(sourceEle, targetEle).perform();
		
		driver.findElement(By.xpath("//span[text()=' Leave Management']")).click();
	}
	
	

}
