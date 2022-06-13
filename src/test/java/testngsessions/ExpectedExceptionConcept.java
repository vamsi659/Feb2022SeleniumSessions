package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	String name = "naveen";
	
	@Test (expectedExceptions = {NullPointerException.class, ArithmeticException.class})
	public void searchProductTest() {
		System.out.println("macbook");
		//int i =9/0;
		ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
		obj = null;
		System.out.println(obj.name);//NPE
		
	}
	
	//At the time of demo can use "Exception.class" to make the test pass
	@Test (expectedExceptions = Exception.class)
	public void testingTest() {
		
	}
	
}
