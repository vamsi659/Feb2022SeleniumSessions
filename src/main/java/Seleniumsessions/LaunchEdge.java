package Seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchEdge {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\vamsi Projects\\Training_Vamsi\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");//launch url
		String title = driver.getTitle();//get the title
		System.out.println(title);
		
		//validation/checkpoint/act vs exp result:
		if(title.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
		
		//Automation Steps (Selenium) + validation/checkpoint (Java/TestNG-Assertions) ==> Automation Testing
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//driver.quit();//close the browser

		
		
		
	}

}