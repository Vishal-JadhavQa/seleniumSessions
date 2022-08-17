package testngpractise;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartHomePageTest extends BaseTest{

	@Test
	public void homePageTest() {
		driver.get("https://naveenautomationlabs.com/opencart/");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Your Store");
	}
	@Test
	public void searchFeatureTest() {
		driver.findElement(By.name("search")).sendKeys("macbook");
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
		driver.findElement(By.id("button-search")).click();
		
		boolean flag = driver.findElement(By.cssSelector("img[title='naveenopencart']")).isDisplayed();
		Assert.assertEquals(flag, true);
	}
}
