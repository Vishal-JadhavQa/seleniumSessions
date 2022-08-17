package seleniumsessions;

public class AmazonTest {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initDriver("Chrome");
		brUtil.launchUrl("https://www.amazon.com");
		
		if(brUtil.getUrlFraction("amazon")){
		System.out.println("Url is correct with Amazon..");
		}
		else {
			System.out.println("Fail");
		}
		if(brUtil.isInfoExistInPage("https://completion.amazon.com")){
			System.out.println("Page source is correct..");
		}
		else{
			System.out.println("Fail");
		}
		if(brUtil.getPageTitle().contains("Amazon.com. Spend less. Smile more.")){
			System.out.println("Correct title");
		}
		else{
			System.out.println("Incorrect title");
		}
		brUtil.quitBrowser();
	}
}

