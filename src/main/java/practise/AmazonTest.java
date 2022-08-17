package practise;

public class AmazonTest {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initDriver("chrome");
		brUtil.launchUrl("https://www.amazon.com");
		
		if(brUtil.isUrlFractionExist("amazon")){
			System.out.println("URL is correct with fraction..");
		}
		else{
			System.out.println("URL not correct..");
		}
		if(brUtil.isInfoExistInPageSource("https://completion.amazon.com/")){
			System.out.println("Page source is correct..");
		}
		else{
			System.out.println("Page source is not correct..");
		}
		
		if(brUtil.getPageTitle().contains("Spend less")){
			System.out.println("Correct title..");
		}
		else{
			System.out.println("Incorrect title..");
		}
		brUtil.quitBrowser();
		
	}

}
