package Seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindowConceptPractise {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");//parent window
		String parentWindowId = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		
		//driver.switchTo().newWindow(WindowType.WINDOW);//sel 4.x feature for opening in new window
		driver.switchTo().newWindow(WindowType.TAB);//sel 4.x feature
		driver.get("http://www.google.com");
		String childWindowId1 = driver.getWindowHandle();
		System.out.println(driver.getTitle());
				
		driver.switchTo().newWindow(WindowType.TAB);//sel 4.x feature
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String childWindowId = driver.getWindowHandle();
		//System.out.println(driver.getTitle());
		
		driver.switchTo().window(childWindowId1);
		driver.close();
		
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getTitle());
		
		//cross origin testing is used 
		
		
		
	}

}