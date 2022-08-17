package seleniumsessions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class QuitVsClose {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart");
		String title = 	driver.getTitle();
		System.out.println("The page title is :" + title);
		
		if(title.equals("Your Store"))
		{
			System.out.println("Page title is correct");
		}
		else{
			System.out.println("Page title is not correct");
		}
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.quit(); //close the browser
		
		driver = new ChromeDriver(); //open browser
		driver.get("https://naveenautomationlabs.com/opencart");
		System.out.println(driver.getTitle());
	}

}
