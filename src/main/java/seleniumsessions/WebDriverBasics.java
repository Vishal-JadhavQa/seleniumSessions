package seleniumsessions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriverBasics {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		String title = 	driver.getTitle();
		System.out.println("The page title is :" + title);
		
		//verification points //actual vs expected
		if(title.equals("Google"))
		{
			System.out.println("Page title is correct");
		}
		else{
			System.out.println("Page title is not correct");
		}
		
		//automation steps + verification point(checkpoint) => Automation testing 
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if(url.contentEquals("https://www.google.com/")){
			System.out.println("Right URL");
		}
		else{
			System.out.println("Wrong URL");
		}
		
		//page source
	//	String source = driver.getPageSource();
	//	System.out.println(source.contains("Copyright The Closure Library Authors"));
				
	driver.close(); //close the browser
	}

}
