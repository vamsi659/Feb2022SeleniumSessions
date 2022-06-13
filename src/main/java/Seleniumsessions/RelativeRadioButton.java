package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeRadioButton {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();

		driver.findElement(By.id("input-firstname")).sendKeys("naveen");
		driver.findElement(By.id("input-lastname")).sendKeys("NAVEEN");
		driver.findElement(By.id("input-email")).sendKeys("naveenanimation20@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("1234567890");

		driver.findElement(By.id("input-password")).sendKeys("Test@12345");
		driver.findElement(By.id("input-confirm")).sendKeys("Test@12345");
		

		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		WebElement ele = driver.findElement(By.xpath("//div/label[@class='radio-inline']/input[@value='1']"));
		jsUtil.scrollIntoView(ele);
		
		// WebElement ele = driver.findElement(By.linkText("Yes"));

		driver.findElement(with(By.xpath("//div[@id='content']//div[@class='form-group']//label[@class='radio-inline'][1]"))).click();
		
		driver.findElement(with(By.xpath("//div[@id='content']//div[@class='pull-right']//input[@name='agree']"))).click();
		
		driver.findElement(By.xpath("//div[@id='content']//div[@class='pull-right']//input[@class='btn btn-primary']")).click();
			
//WebElement ele = driver.findElement(By.xpath("//div[@id='content']//div[@class='form-group']//label[@class='radio-inline'][1]"));
		
		//driver.findElement(with(By.className("radio-inline")).toRightOf(ele)).click();

	}

}
