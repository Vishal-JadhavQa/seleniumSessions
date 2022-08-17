package testngpractise;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftwareTest extends BaseTest{

	@Test
	public void softwareTest() {
		driver.get("https://naveenautomationlabs.com/opencart/");
		driver.findElement(By.linkText("Software")).click();
		boolean flag = driver.findElement(By.xpath("//*[@id=\"content\"]/h2")).isDisplayed();
		Assert.assertEquals(flag, true);
}
	@Test
	public void continueTest() {
		driver.findElement(By.linkText("Continue"));
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Your Store");
	}
}