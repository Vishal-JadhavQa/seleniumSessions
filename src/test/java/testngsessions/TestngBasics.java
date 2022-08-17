package testngsessions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestngBasics {

	@BeforeSuite
	public void connectWithDB(){
		System.out.println("BS - connectWithDB");	
	}
	@BeforeTest
	public void createUser(){
		System.out.println("BT - createUser");
	}
	@BeforeClass
	public void launchBrowser(){
		System.out.println("BC - launchBrowser");
	}
	@BeforeMethod
	public void login(){
		System.out.println("BM - login");
	}
	@Test
	public void homePageTest(){	
		System.out.println("Home page - Test");
	}
	@Test
	public void searchTest(){	
		System.out.println("Search - Test");
	}
	@Test
	public void addToCartTest(){	
		System.out.println("Add to cart - Test");
	}
	@AfterMethod
	public void logout(){
		System.out.println("AM - Logout");
	}
	@AfterClass
	public void closeBrowser(){
		System.out.println("AC - CloseBrowser");
	}
	@AfterTest
	public void deleteUser(){
		System.out.println("AT - DeleteUser");
	}
	@AfterSuite
	public void disconnectWithDB(){
		System.out.println("AS - disconnectWithDB");		
	}
	
}
