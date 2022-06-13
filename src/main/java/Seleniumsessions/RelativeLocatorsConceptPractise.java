package Seleniumsessions;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;
	import static org.openqa.selenium.support.locators.RelativeLocator.with;

	public class RelativeLocatorsConceptPractise {

		public static void main(String[] args) {

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.aqi.in/dashboard/canada");
			
			WebElement ele = driver.findElement(By.linkText("New Brunswick"));
			
			//right of (ele) --> tagname(p)
			String rightIndex = driver.findElement(with(By.tagName("td")).toRightOf(ele)).getText();
			System.out.println(rightIndex);
			
			WebElement ele1 = driver.findElement(By.linkText("GOOD"));
			
			String rightIndex1 = driver.findElement(with(By.tagName("td")).toRightOf(ele1)).getText();
			System.out.println(rightIndex1);
			
//			String leftRank = driver.findElement(with(By.tagName("td")).toLeftOf(ele)).getText();
//			System.out.println(leftRank);
//			
//			String belowCity = driver.findElement(with(By.tagName("td")).below(ele)).getText();
//			System.out.println(belowCity);
//
//			String aboveCity = driver.findElement(with(By.tagName("td")).above(ele)).getText();
//			System.out.println(aboveCity);
//			
//			String nearCity = driver.findElement(with(By.tagName("td")).near(ele)).getText();
//			System.out.println(nearCity);

		}

	}
