package Seleniumsessions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConceptPractise {

	static WebDriver driver;

		public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		
		//By rightClickMe = By.xpath("//span[text()='right click me']");
		
		rightCliclink();

		//WebElement rightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));

		//Actions act = new Actions(driver);

		//act.contextClick(rightClickMe).perform();

//			List<WebElement> rightList = 
//						driver.findElements
//							(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]"));

//		selectValueFromRightClickDropDown("Copy");
//
//		selectUser("Joe.Root");
//
//		Alert alert = driver.switchTo().alert();
//
//		String text1 = alert.getText();
//		System.out.println(text1);
//		alert.accept();

//			selectValueFromRightClickDropDown("Copy");
	}

//	private static void rightCliclink(By rightClickMe) {
//			// TODO Auto-generated method stub
//			
//		}

//	public static void selectValueFromRightClickDropDown(String value) {
//				List<WebElement>	rightList = 
//							driver.findElements
//								(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]"));
//				for (WebElement e : rightList) {
//					String text = e.getText();
//					if (text.contains(value)) {
//						e.click();
//				
						
//			public static void selectValueFromRightClickDropDown(String value) {
//				WebElement rightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));
//				
//				Actions act = new Actions(driver);
//				
//				act.contextClick(rightClickMe).perform();
//				
//				List<WebElement> rightList = 
//						driver.findElements
//							(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]"));
////				
////				Select select = new Select(getElement(locator));
////				List<WebElement> rightList = select.getOptions();
//
//				for (WebElement e : rightList) {
//					String text = e.getText();
//					if (text.contains(value)) {
//						e.click();
//						
//				
//				Alert alert = driver.switchTo().alert();
//				
//				String text1 = alert.getText();
//				System.out.println(text1);			
//				alert.accept();
//				break;
//					}
//
//				}
						
						public static void rightCliclink() {
							WebElement rightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));
							
//							By rightClickMe = By.xpath("//span[text()='right click me']");
							//String xpath = "//a[text()='"+name+"']/parent::td/preceding-sibling::td/input";
//							driver.findElement((rightClickMe)).click();
							Actions act = new Actions(driver);

							act.contextClick((WebElement) rightClickMe).perform();
						}
//		}

//	}
//				}
}