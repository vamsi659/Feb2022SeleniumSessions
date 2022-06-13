package testngsessions;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppLoginTestWithBM {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

	}

	// AAA Rule (Arrange, Act and Assert)
	@Test
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("page title is : " + title);
		Assert.assertEquals(title, "Account Login");
	}

	@Test
	public void subtitleTest1() {
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='row']//h2[text()='New Customer']")).isDisplayed());
	}

	@Test
	public void subtitleTest2() {
		Assert.assertTrue(
				driver.findElement(By.xpath("//div[@class='well']//h2[text()='Returning Customer']")).isDisplayed());

	}

	@Test
	public void forgottenPasswordlinkTest() {
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='list-group']/a[text()='Forgotten Password']"))
				.isDisplayed());

	}

	@Test
	public void searchTest() {
		Assert.assertTrue(driver.findElement(By.name("search")).isDisplayed());

	}

	@Test
	public void urlTest() {
		String url = driver.getCurrentUrl();
		System.out.println("page url is : " + url);
		Assert.assertTrue(url.contains("route=account/login"));

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
