package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		driver.findElement(By.cssSelector("div#imageTemplateContainer")).click();
		Thread.sleep(5000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, 'frame-one')]")));
		
		//form fill
		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("2020");
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("Honda");
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("HondaCity");
		driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Black");
		driver.findElement(By.id("RESULT_TextField-6")).sendKeys("20KM/L");
		driver.findElement(By.id("RESULT_TextField-7")).sendKeys("1315");
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("Vishal");
		driver.findElement(By.id("RESULT_TextField-9")).sendKeys("Kharghar");
		driver.findElement(By.id("RESULT_TextField-10")).sendKeys("Navi Mumbai");
		driver.findElement(By.id("RESULT_TextField-11")).sendKeys("Panvel");
		
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@class='drop_down']")));
		dropdown.selectByIndex(3);
		driver.findElement(By.id("RESULT_TextField-13")).sendKeys("410210");
		driver.findElement(By.id("RESULT_TextField-14")).sendKeys("8898500410");
		driver.findElement(By.id("RESULT_TextField-15")).sendKeys("vishal@gmail.com");
	
		driver.switchTo().defaultContent(); //come back to main page
	}

}
