package practise;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablePagination {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		Thread.sleep(4000);

//		ArrayList ar = new ArrayList();
		ArrayList<String> namesList = new ArrayList<String>();
		namesList.add("India");
		namesList.add("USA");
		System.out.println(namesList.size());
		
		while(true){
			if(driver.findElements(By.xpath("//td[text()='India']")).size()>0){
				selectMultipleCountry("India");
			}
			if(driver.findElements(By.xpath("//td[text()='United States']")).size()>0){
				selectMultipleCountry("United States");
			}
			//pagination logic
			WebElement next = driver.findElement(By.linkText("Next"));
			
			if(next.getAttribute("class").contains("disabled")){
				System.out.println("Pagination is over..Country not found");
				break;
			}
			next.click();
			Thread.sleep(1000);
		
		}	
}
	
	
	public static void selectMultipleCountry(String country){
		List<WebElement> eleList = driver.findElements(By.xpath("(//td[text()='"+country+"'])/preceding-sibling::td/input[@type='checkbox']"));
		for(WebElement e : eleList){
			e.click();
		}
	}
	public static void selectCountry(String country){
		driver.findElement(By.xpath("//td[text()='"+country+"']/preceding-sibling::td/input[@type='checkbox']")).click();
	}
}