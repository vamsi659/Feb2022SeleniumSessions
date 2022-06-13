package Seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Elektafooterlinks {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.elekta.com/#bottom");
		driver.findElement(By.id("cookie-accept")).click();

		By footers = By.xpath("//footer//ul[@class=\"sub-menu level-2\"]//a");
		clickOnElementFromSection(footers, "About us");
		// driver.findElement(By.xpath("menu-item active")).click();

		// Actions action = new Actions(driver);
		// action.moveToElement(driver.findElement(By.className("menu-item"))).build().perform();
//		By footers = By.xpath("//footer//ul[@class=\"sub-menu level-2\"]//a");
		// driver.findElement(By.linkText("About us")).click();

	}

	public static void clickOnElementFromSection(By locator, String value) {
		List<WebElement> eleList = driver.findElements(locator);

		System.out.println(eleList.size());

		for (WebElement e : eleList) {
			String text = e.getText();
			System.out.println("=================" + text + "==================");
			

		}

		for (WebElement e : eleList) {
			String text = e.getText();
			if (text.contains("About us")) {
				e.click();
				System.out.println("Clicked on link :" + text );
				System.out.println(text + " Page opened" + ": PASSED");
				break;
			}

			if (text.equals("About us")) {
				System.out.println("Does not Contains " + text + ": FAILED");
				break;
			}
		}

	}
}
