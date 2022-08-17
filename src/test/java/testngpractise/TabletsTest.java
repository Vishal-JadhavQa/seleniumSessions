package testngpractise;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TabletsTest extends BaseTest{

	@Test
	public void tabletsTest() {
		driver.get("https://naveenautomationlabs.com/opencart/");
		driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[4]/a")).click();
		boolean flag = driver.findElement(By.xpath("//*[@id=\"content\"]/h2")).isDisplayed();
		Assert.assertEquals(flag, true);
	}
	@Test
	public void TabTest() {
		driver.findElement(By.linkText("Contact Us")).click();
		boolean flag = driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).isDisplayed();
		Assert.assertEquals(flag, true);
	}
}
