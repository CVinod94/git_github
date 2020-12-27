package com.adactin.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {

	// BROWSER LAUNCH:
	public static WebDriver driver;

	public static WebDriver getBrowser(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\91805\\\\eclipse-workspace\\SeliniumConpects\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\91805\\eclipse-workspace\\SeliniumConpects\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();

			} else {
				System.out.println("Invalid Browser Name");

			}
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

	// GET URL
	public static void getUrl(String URL) {
		try {
			driver.get(URL);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//clear
	public static void clear() {

	}

	// CLOSE
	public static void close() {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// QUIT
	public static void quit() {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// NAVIGATE TO
	public static void navigateTo(String URL) {
		try {
			driver.navigate().to(URL);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// NAVIGATE BACK
	public static void navigateBack() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// NAVIGATE REFRESH
	public static void navigateRefresh() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// NAVIGATE FORWARD
	public static void navigateForward() {
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// IMPLICIT WAIT
	public static void implicitWait() {
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// EXPLICIT WAIT
	public static void explicitWait(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// FLUENT WAIT
	public static void fluentWait() {
		Wait wait = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(Exception.class);
	}

	// SIMPLE ALERT
	public static void SimpleAlert() {
		try {
			Alert salert = driver.switchTo().alert();
			salert.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// CONFIRM ALERT ACCEPT
	public static void confirmAlertAccept() {
		try {
			Alert calert = driver.switchTo().alert();
			calert.dismiss();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// PROMPT ALERT
	public static void promptAlert(String string) {
		try {
			Alert pa = driver.switchTo().alert();
			pa.sendKeys(string);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ACTIONS
	public static void moveToElement(WebElement Element) {
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(Element).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// ROBOT
	public static void robot() throws AWTException {
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	// DROP DOWN
	public static void selectDropDown(WebElement element, String value, String option) {
		if (option.equalsIgnoreCase("value")) {
			Select s = new Select(element);
			s.selectByValue(value);

		} else if (option.equalsIgnoreCase("text")) {
			Select s1 = new Select(element);
			s1.selectByVisibleText(value);
		} else if (option.equalsIgnoreCase("index")) {
			Select s2 = new Select(element);
			s2.selectByIndex(Integer.parseInt(value));
		}
	}

	// SENDKEYS
	public static void inputvaluetoElement(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// CLICK
	public static void click(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// IS ENABLED
	public static void isEnable(WebElement element) {
		try {
			element.isEnabled();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// IS DISPLAYED
	public static void isDisplay(WebElement element) {
		try {
			element.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// IS SELECTED
	public static void isSelect(WebElement element) {
		try {
			element.isSelected();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// GETOPTIONS
	public static void getOptions(WebElement element) {
		try {
			Select s = new Select(element);
			List<WebElement> options = s.getOptions();
			for (WebElement opt : options) {
				System.out.println(opt.getText());

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// GET TITLE
	public static void getTitle(String Title) {
		try {
			driver.getTitle();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Current URl
	public static void getCurrentUrl(String url) {
		try {
			driver.getCurrentUrl();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ALL SELECTED OPTIONS
	public static void allSelectedOption(WebElement element) {
		try {
			Select s = new Select(element);
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement options : allSelectedOptions) {
				System.out.println(options.getText());

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// frame using string
	public static void frameString(String value) {
		driver.switchTo().frame(value);
	}

	// frame using webelement
	public static void framesElement(String element) {
		driver.switchTo().frame(element);
	}

	// frame using index
	public static void frameIndex(String index) {
		driver.switchTo().frame(index);
	}

	// ParentFrame
	public static void parentFrame() {
		driver.switchTo().parentFrame();
	}

	// ScreenShot
	public static void screenShot(String Element) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File desfile = new File("C:\\Users\\91805\\eclipse-workspace\\SeliniumConpects\\screenshot\\baseclass.png");
		FileUtils.copyFile(srcfile, desfile);
	}
	// TakesScreenShot

	public static void TakesScreenShot(String Filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File desfile = new File(System.getProperty("user. dir") + "\\Screenshot\\" + Filename + ".png");
		FileUtils.copyDirectory(srcfile, desfile);

	}

	// windowHandle
	public static void windowHandles(String value) {
		String Parentid = driver.getWindowHandle();
		System.out.println(Parentid);

		Set<String> allid = driver.getWindowHandles();
		for (String id : allid) {
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);
		}

		String actualTitle = value;
		for (String id : allid) {
			if (driver.switchTo().window(id).getTitle().equals(actualTitle)) {
				break;
			}

		}

	}

	// Scrollup and Down
	public static void scrollUpandDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoview();", element);

//			js.executeScript("window.scrollBy(0,-1000)"); // Goes upward
//			js.executeScript("window.scrollBy(0,1000)");// Goes downward
	}

	// DefaultContent
	public static void defaultContent() {
		driver.switchTo().defaultContent();
	}

	// GetText
	public static void text(WebElement element) {
		System.out.println(element.getText());
	}
}
