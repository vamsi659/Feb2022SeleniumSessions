package Seleniumsessions;

	import java.util.Iterator;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class BrowserWindowHandlePractice {

		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.elekta.com/#bottom");//parent window
			driver.findElement(By.id("cookie-accept")).click();
			
			driver.findElement(By.xpath("//*[@id=\"footer\"]/div/ul/li[1]/a/img")).click();
					
								
			//child window will be opened
			
			//window handler api
			Set<String> handles = driver.getWindowHandles();
			
			Iterator<String> it = handles.iterator();
			
			String parentWindowId = it.next();
			System.out.println("Parent window id : " + parentWindowId);
			
			String childWindowId = it.next();
			System.out.println("Child window id : " + childWindowId);
			
			//switch to child window:
			driver.switchTo().window(childWindowId);
						
			Thread.sleep(3000);
			System.out.println("child window title is : " + driver.getTitle());
						
			driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[2]/div[1]/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/div/div[1]/div/span/span")).click();
			Thread.sleep(3000);
			driver.close(); //close the child window
			
			driver.switchTo().window(parentWindowId);
			
			System.out.println("parent window title is : " + driver.getTitle());
			
		}

	}


