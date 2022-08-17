package testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {

	@Test
	public void loginTest() {
		System.out.println("login test");
	}
	@Test(dependsOnMethods = "loginTest")
	public void homeTest() {
		System.out.println("home test");
	}
	@Test
	public void searchTest() {
		System.out.println("search test");
	}
	
	
	
}
