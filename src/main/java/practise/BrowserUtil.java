package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	private WebDriver driver;
	
	public WebDriver initDriver(String browserName){
		System.out.println("Browser name is : " + browserName);
		
		if(browserName.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
	}
		else if(browserName.equalsIgnoreCase("edge")){
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
		}
		else {
			System.out.println("Please pass the right browser " + browserName);
		}
		return driver;
	}
	
	public void launchUrl(String url){
		if(url == null){
			System.out.println("URL is null...");
			return;
		}
		if(url.indexOf("http")== -1){
			System.out.println("Url not having http..");
		}
		if(url.indexOf("https")== -1){
			System.out.println("Url not having https..");
		}
		if(url.length() == 0){
			System.out.println("Url is blank");
		}
		driver.get(url);
	}
	public String getPageTitle(){
		String title = driver.getTitle();
		System.out.println("Page title is : " + title);
		return title;
	}
	public String getPageUrl(){
		String url = driver.getCurrentUrl();
		System.out.println("Current page url is :" + url);
		return url;
	}
	public boolean isUrlFractionExist(String urlfraction){
		if(getPageUrl().contains(urlfraction)){
			return true;
		}
		return false;
	}
	public String getPageSource(){
		String pageSource = driver.getPageSource();
//		System.out.println("Page source is :" + pageSource);
		return pageSource;
	}
	public boolean isInfoExistInPageSource(String info){
		if(getPageSource().contains(info)){
			return true;
		}
			return false;
	}
	public void closeBrowser(){
		driver.close();
	}
	public void quitBrowser(){
		driver.quit();
	}
}

