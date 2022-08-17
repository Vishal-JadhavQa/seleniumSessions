package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ElementUtil {

	private WebDriver driver;
	private Actions act;
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
		act = new Actions(driver);
	}

	public By getBy(String locatorType, String selector) {
		By locator = null;
		switch(locatorType.toLowerCase()) {
		case "id":
			locator = By.id(selector);
			break;
		case "class":
			locator = By.className(selector);
		case "xpath":
			locator = By.xpath(selector);
		default:
			break;
		}
		return locator;
	}

	public void doSendKeys(String locatorType, String selector, String value) {
		By locator = getBy(locatorType, selector);
		getElement(locator).sendKeys(value);
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	public void doActionsSendKeys(By locator, String value){
		act.sendKeys(getElement(locator), value).perform();
	}
	public void doActionsClick(By locator){
		act.click(getElement(locator)).perform();
	}
	public void doClick(String locatorType, String selector){
		By locator = getBy(locatorType, selector);
		getElement(locator).click();
	}
	public void doClick(By locator){
		getElement(locator).click();
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
}
