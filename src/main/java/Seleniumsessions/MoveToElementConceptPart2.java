package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConceptPart2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bigbasket.com/");

		WebElement contentMenu = driver.findElement(By.xpath("//*[@id='navbar']/ul/li[1]"));

		Actions act = new Actions(driver);

		act.moveToElement(contentMenu).build().perform();
		Thread.sleep(10000);

		WebElement subcontentMenu = driver.findElement(By.xpath("(//a[@class='ng-binding active'])[1]"));

		Actions act1 = new Actions(driver);

		act1.moveToElement(contentMenu).build().perform();
		Thread.sleep(5000);

//WebElement contentMenu1 = driver.findElement(By.className("ng-binding"));
//		
//		
//		Actions act1 = new Actions(driver);
//		
//		act.moveToElement(contentMenu1).perform();
//		Thread.sleep(2000);
//		
//WebElement contentMenu2 = driver.findElement(By.className("ng-binding l2select"));
//		
//		
//		Actions act2 = new Actions(driver);
//		
//		act.moveToElement(contentMenu2).perform();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.linkText("Panini, Focaccia & Pita")).click();

	}

}
