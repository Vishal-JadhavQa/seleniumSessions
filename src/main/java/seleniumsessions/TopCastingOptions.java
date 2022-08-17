package seleniumsessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TopCastingOptions {

	public static void main(String[] args) {

		//1. cross browser  //Recommended
		//local execution
// 		WebDriver driver = new ChromeDriver();
//		driver = new FirefoxDriver();
//		driver = new SafariDriver();
		
		//2. browser specific  //not recommended for cross browser
//		ChromeDriver d1 = new ChromeDriver();
		
		//3. RemoteWebDriver - ChromeDriver  //recommended
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\ChromeDriver\\chromedriver.exe");
//		RemoteWebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
		
		//4. WebDriver - RemoteWebDriver	//recommended //for local execution
		//Remote execution : grid, cloud, aws, docker grid
//		WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);
		
		//5. Search context - WebDriver  // Not recommended
//		SearchContext driver = new ChromeDriver();
		
		
	}

}
