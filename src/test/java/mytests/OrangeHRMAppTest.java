package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMAppTest extends BaseTest{

	@Test(priority = 1)
	public void hrmTitleTest() {
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
	}

	@Test(priority = 2)
	public void hrmUrlTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("orangehrm-30-day-trial"));
	}

}
