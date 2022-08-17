package seleniumsessions;

public class CustomXpath {

	public static void main(String[] args) {

		//xpath is not an attribute
		//its an address of an element in the DOM
		//1. Absolute xpath eg. /html/div/div[2]/div[3]/div/ul/li[2]/a
		//2. Relative xpath/ custom xpath
		
		// Syntax : (for single attribute)
		//htmltag[@attribute='value']
		
		//input[@id='input-email']
		//input[@name='email']
		//input[@placeholder='E-Mail Address']
		
		// Syntax : (for multiple attribute)
		//htmltag[@attribute='value' and @attribute2='value']
		//input[@name='email' and @type='text']
		 //input[@name='email' or @type='text']
		
		//input
		//a
		//input[@id]
		//a[@href]
		
		//text function : Syntax
		//htmltag[text()='value']
		//a[text()='Login']
		//h2[text()='Returning Customer']
		//label[text()='First Name']
		 
		//contains : used for dynamic elements  (with contains never use 'equal to' always use 'comma' 
		//syntax : //htmltag[contains(@attribute,'value')]
		//input[contains(@id,'firstname')] 
		
		//htmltag[contains(@attribute,'value') and contains(@attribute,'value')]
		//input[contains(@id,'firstname')and (@name='firstname')] 
		
		//contains() with text(): syntax
		//htmltag[contains(text(),'value']
		//h1[contains(text(),'Register')]
		
		//contains() with text() and attribute : syntax
		//htmltag[contains(text(),'value') and contains(@attr,'value')]
		//a[contain(text(),'Customers') and contains(@href,'customers')]
		
		//htmltag[contains(text(),'value') and contains(@attr,'value') and @attr='value']
		
		//starts-with():
		//syntax : 
		//htmltag[starts-with(@attr,'value')]
		//p[starts-with(text(),'If you already')]
		
		//ends-with() : deprecated in xpath 3.0

		//index :
		// ** (//input[@class='form-control'])[2] **
		// ** (//input[@class='form-control'])[position()=2] ** 
		// ** (//input[@class='form-control'])[last()] ** 
		// ** (//input[@class='form-control'])[last()-1] ** 
		
		// ** ((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()] **
		
		//parent to child :
		//dropdown options
		//select[@id='Form_submitForm_Country']/option
		//select[@id='Form_submitForm_Country']/child::option
		
		//child to parent :
		//backward traversing in xpath 
		//input[@id='username']/../../../../../../..
		//input[@id='username']/parent::div
		
		//parent keyword is used for immediate parent
		//ancestor keyword is used for grandparent 
		
		//child to ancestor :
		//input[@id='username']/ancestor::form
		
		
		
	}

}
