package BrowserVendors;

import Browser.BrowserUtil;

public class Chrome extends BrowserUtil{

	@Override
	public void click() {
		System.out.println("Chrome Clicking..");
	}
	public void launchURL() {
		System.out.println("https://www.google.com");
	}
	
}
