package Seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSingleSuggestionClick {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("L2AGLb")).click();
		Thread.sleep(1000);

		driver.findElement(By.name("q")).sendKeys("Naveen Automation Labs");
		Thread.sleep(1000);

		List<WebElement> suggList = driver
				.findElements(By.xpath("//ul[@role='listbox']/li//div[@class='wM6W7d']/span"));

		System.out.println(suggList.size());
		for(WebElement e : suggList) {
			String text = e.getText();
			System.out.println("=========="+text+"===========");
		}
		
		driver.findElement(By.xpath("//ul[@role='listbox']/li//div[@class='wM6W7d']/span/b[contains(text(),'java')]"))
				.click();
		// System.out.println(driver.get);

	}

}