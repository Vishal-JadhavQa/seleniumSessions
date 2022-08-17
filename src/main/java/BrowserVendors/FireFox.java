package BrowserVendors;

import Browser.BrowserUtil;

public class FireFox extends BrowserUtil{
	@Override
	public void click() {
		System.out.println("Firefox Clicking..");
	}
	public void launchURL() {
		System.out.println("https://www.google.com");
	}
}
