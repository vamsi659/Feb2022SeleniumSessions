package Seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinks {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.freshworks.com/");

//			driver.findElement(By.id("search_query_top")).sendKeys("Dress");
//			Thread.sleep(3000);

		List<WebElement> footerList = driver.findElements(By.xpath("//footer//ul[@class=\"footer-nav\"]//a"));
		System.out.println(footerList.size());
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();

		for (WebElement e : footerList) {
			String text = e.getText();
			System.out.println("==========" + text + "===========");
		}

//		for (WebElement e : footerList) {
//			String text = e.getText();
//			if (text.contains("Leadership")) {
//				System.out.println("Contains" + text + ": PASSED");
//			} else {
//				System.out.println("Does not Contains Leadership : FAILED");
//			}
//			//break;
//	}

		for (WebElement e : footerList) {
			String text = e.getText();
			if (text.contains("Leaderships")) {
				e.click();
				System.out.println(text + " Page opened" + ": PASSED");
				break;
			}

			if (text.equals("Leadership")) {
				System.out.println("Does not Contains " + text + ": FAILED");
				break;
			}
		}

	}
}

//driver.findElement(By.xpath("//footer//ul[@class=\"footer-nav\"]//a[@href=\"https://www.freshworks.com/company/leadership/?source=freshdesk&medium=referral&campaign=fdesk_footer_main\"]")).click();