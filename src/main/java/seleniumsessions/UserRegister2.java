package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserRegister2 {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver("chrome");
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		System.out.println(brUtil.getPageTitle());
		System.out.println(brUtil.getPageUrl());
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By emailId = By.id("input-email");
		By telePhone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(firstName, "Vishal");
		eleUtil.doSendKeys(lastName, "Jadhav");
		eleUtil.doSendKeys(emailId, "jvishh@gmail.com");
		eleUtil.doSendKeys(telePhone, "+918655182452");
		eleUtil.doSendKeys(password, "India@123");
		eleUtil.doSendKeys(confirmPassword, "India@123");
		
	}

}
