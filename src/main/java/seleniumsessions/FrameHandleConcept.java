package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandleConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		
		//** frame by index **
		//driver.switchTo().frame(2);
		
		//** frame by nameOrid **
		//driver.switchTo().frame("main");
		
		//** frame by webElement
		driver.switchTo().frame(driver.findElement(By.name("main")));
		
		
		
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
	
	}

}
