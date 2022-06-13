package Seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickMenuPractice1 {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/context_menu");
		driver.manage().window().maximize();

		By rightClickPlace = By.id("hot-spot");
		Actions actions = new Actions(driver);
		WebElement rightClickPlaceElem = driver.findElement(rightClickPlace);
		actions.contextClick(rightClickPlaceElem).perform();

		Alert alert = driver.switchTo().alert();

		String text1 = alert.getText();
		System.out.println(text1);
		alert.accept();

//	        WebDriverWait wait = new WebDriverWait(driver, 30);
//	        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//	        System.out.println(alert.getText());
//	        alert.accept();

		// This is to refresh the page and remove the triggered conteext menu
		driver.navigate().refresh();

		//driver.quit();
	}
}
