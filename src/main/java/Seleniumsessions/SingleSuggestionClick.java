package Seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleSuggestionClick {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(1000);
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		Thread.sleep(3000);

		List<WebElement> suggList = driver.findElements(By.xpath("//div[@class='ac_results']//li"));
		System.out.println(suggList.size());

		for (WebElement e : suggList) {
			String text = e.getText();
			System.out.println("==========" + text + "===========");
		}

//		for (WebElement e : suggList) {
//			String text = e.getText();
//			if (text.contains("Casual Dresses > Printed")) {
//				e.click();
//				break;
//			}
//
//		}  
		// OR for clicking an element
		 driver.findElement(By.xpath("//div[@class=\"ac_results\"]/ul/li[contains(text(),'Casual Dresses > Printed')]")).click();
		
		

	}

}
