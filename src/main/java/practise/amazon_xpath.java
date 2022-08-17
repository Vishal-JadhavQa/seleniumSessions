package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon_xpath {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		String f_L1 = driver.findElement(By.xpath("((//div[@class='navFooterLinkCol navAccessibility'])[1]//a[1])[1]")).getText();	
		System.out.println(f_L1);
		
//		driver.navigate().back();
		
		String f_L2 = driver.findElement(By.xpath("((//div[@class='navFooterLinkCol navAccessibility'])[2]//a[1])[1]")).getText();
		System.out.println(f_L2);
		
//		driver.navigate().back();
		
		String f_L3 = driver.findElement(By.xpath("((//div[@class='navFooterLinkCol navAccessibility'])[3]//a[1])[1]")).getText();
		System.out.println(f_L3);
		
//		driver.navigate().back();
	
		String f_L4 = driver.findElement(By.xpath("((//div[@class='navFooterLinkCol navAccessibility'])[4]//a[1])[1]")).getText();
		System.out.println(f_L4);
		
//		driver.navigate().back();
	}
}