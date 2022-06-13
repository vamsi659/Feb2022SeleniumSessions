package testngsessions;

	import org.testng.annotations.Test;

	public class InvocationCountConcept {

		//AAA -test should be written independently
		
		@Test (invocationCount = 10)
		public void createUserTest() {
			System.out.println("create user test");

		}
	}