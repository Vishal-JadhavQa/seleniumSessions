package BrowserVendors;

import Browser.BrowserUtil;

public class Safari extends BrowserUtil{
	@Override
	public void click() {
		System.out.println("Safari Clicking..");
	}
	public void launchURL() {
		System.out.println("https://www.google.com");
	}
}
