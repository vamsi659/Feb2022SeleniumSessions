package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderHandle {
static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.cssSelector("a.cookie-choices-button#cookieChoiceDismiss")).click();
		
		
		driver.findElement(By.id("datepicker")).click();
		
		// driver.findElement(By.xpath("//a[text()='15']")).click();
		
		selectFutureDate("June 2022", "30");	
		
	}
	
	public static void selectFutureDate(String expMonthYear, String dateNum) {
		if(expMonthYear.contains("February") && Integer.parseInt(dateNum)>29) {
			System.out.println("wrong date passed...please pass the right day/date..."+expMonthYear);
			return;
		}
		
		if(Integer.parseInt(dateNum) > 31) {
			System.out.println("wrong date passed...please pass the right day/date..."+dateNum);
			return;
		}
		
		
		String actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actMonthYear);
		
		while(!actMonthYear.equalsIgnoreCase(expMonthYear)) {
		//click on next arrow;
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
	}
		
		selectDate(dateNum);		
		
	}
	
	
	public static void selectDate(String dateNum) {
		driver.findElement(By.xpath("//a[text()='"+dateNum+"']")).click();
	}

}
