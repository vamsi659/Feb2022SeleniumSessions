package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchSuggestionList {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.name("search_query_top")).sendKeys("Dress");
		Thread.sleep(10000);
		
		driver
			.findElement(By.xpath("//div[@class='ac_results']//li[contains(text(),'Casual Dresses > Printed')]"))
				.click();
		
		//iterate - for loop
	}

}
			
	//     "//" indirect and "/" direct for xpath creation
	//		ul -unorder list
	//		li - list element
	//		<a - link
	//		<div - 
			
	//		"ctrl + f"  gives you a window for creating the xpath
			
	
