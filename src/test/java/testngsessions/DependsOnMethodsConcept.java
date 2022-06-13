package testngsessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodsConcept {

	//AAA -test should be written independently
	
	@Test
	public void homePageTest() {
		System.out.println("HP test");

	}

	@Test(dependsOnMethods = "homePageTest")
	public void searchTest() {
		System.out.println("Search test");

	}

	@Test(dependsOnMethods = "homePageTest")
	public void addToCartTest() {
		System.out.println("Add to cart test");

	}
}