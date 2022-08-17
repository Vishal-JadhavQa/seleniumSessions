package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchFirefox {

	public static void main(String[] args) {
		
		//geckodriver.exe --> mozilla
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\GeckoDriver\\geckodriver.exe");
		
	//	WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
	} 

}
