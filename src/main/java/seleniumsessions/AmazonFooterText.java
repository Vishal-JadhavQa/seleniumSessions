package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonFooterText {

	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");	
		
		
		System.out.println(getFooterValue("Careers"));
		System.out.println(getFooterValue("Sell apps on Amazon"));
		System.out.println(getFooterValue("Reload Your Balance"));
		System.out.println(getFooterValue("Help"));
	}
	public static String getFooterValue(String footerLinkText)
	{
		String footer = driver.findElement(By.xpath("//a[text()='"+ footerLinkText + "']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div")).getText();
		return footer;
	}

}
