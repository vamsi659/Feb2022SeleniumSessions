package Seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandlePractice {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.formsite.com/templates/registration-form-templates/club-registration-signup-form/");

		driver.findElement(By.xpath("//div[@id = \"imageTemplateContainer\"]")).click();

		driver.switchTo().frame("frame-one102941247");

		By firstname = By.name("RESULT_TextField-2");
		By lastname = By.name("RESULT_TextField-3");
		By address = By.name("RESULT_TextField-4");
		By city = By.name("RESULT_TextField-6");
		By state = By.id("RESULT_RadioButton-7");
		By zipcode = By.name("RESULT_TextField-8");
		By phone = By.name("RESULT_TextField-9");
		By email = By.name("RESULT_TextField-10");
//		By membtype = By.id("RESULT_RadioButton-11_0");
//		By prefcont = By.id("RESULT_RadioButton-12_0");
//		By terms = By.id("RESULT_CheckBox-13_0");
//		By sign = By.xpath("//div[@class=\"signature text_field\"]");

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(firstname, "vamsi");
		eleUtil.doSendKeys(lastname, "sai");
		eleUtil.doSendKeys(address, "123 street road");
		eleUtil.doSendKeys(city, "london");
		selectValueFromSelectDropDown(state, "Alaska");

		eleUtil.doSendKeys(zipcode, "123456");
		eleUtil.doSendKeys(phone, "9848466562");
		eleUtil.doSendKeys(email, "london@yahoo.com");
//		eleUtil.doSendKeys(membtype).click();
//		eleUtil.doSendKeys(prefcont, null);
//		eleUtil.doSendKeys(terms, null);

//		driver.findElements(By.id("RESULT_RadioButton-11_0"));
//		driver.findElements(By.id("RESULT_RadioButton-12_0"));
//		driver.findElements(By.id("RESULT_CheckBox-13_0"));
//
//		clickOnRadioButton(membtype, "Standard");
//		clickOnRadioButton(prefcont, "Phone");
//		clickOnRadioButton(terms, "Standard");
		
		driver.findElement(By.xpath("//div/input[@id=\"FSsubmit\"]")).click();
		
		//driver.get("https://www.formsite.com/");
		
		
		//driver.switchTo().defaultContent();


				
				System.out.println(firstname);
				printSelectDropDownValues(state);
				System.out.println(email);
				System.out.println(address);
				
				
//				driver.switchTo().parentFrame();
//				
		// System.setProperty("webdriver.chrome.driver",
		// "/Users/naveenautomationlabs/Downloads/chromedriver");
		// WebDriverManager.chromedriver().setup();
		// WebDriver driver = new ChromeDriver();

		// driver.get("http://www.londonfreelance.org/courses/frames/index.html");

		// driver.switchTo().frame(2);
		// driver.switchTo().frame("main");

//			driver.switchTo().frame(driver.findElement(By.name("main")));
//			
//			String text = driver.findElement(By.xpath("/html/body/h2")).getText();
//			System.out.println("=============="+text+"============");

		// driver.switchTo().defaultContent();//come back to the main page

//			driver.switchTo().parentFrame();//sel 4.x
//			driver.switchTo().defaultContent();////come back to the main page

		// div[@id = "imageTemplateContainer"]
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void clickOnElementFromSection(By locator, String value1) {
		List<WebElement> eleList = driver.findElements(locator);
	}

	public static void clickOnRadioButton(By locator, String value1) {
		Select select = new Select(getElement(locator));
		List<WebElement> RadioButton = driver.findElements(locator);
		for (WebElement e1 : RadioButton) {
			String text1 = e1.getText();
			if (text1.equalsIgnoreCase(value1)) {
				e1.click();
			}
		}
	}
	public static void printSelectDropDownValues(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		System.out.println(optionsList.size());

		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println("================" + text + "==============");

		}
	}

	public static void selectValueFromSelectDropDown(By locator, String value) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();

		for (WebElement e : optionsList) {
			String text = e.getText();
			if (text.contains(value)) {
				e.click();
				break;
			}

		}

	}

}