package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

public class BasePage {

	public static WebDriver driver;

	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	}

	public void validation(String actual, String expected) {
		Assert.assertEquals(actual, expected);

	}

	public void addWaitTime(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	public int randomNumberGenerator(int bound) {
		Random rnd = new Random();
		int RandomGenerator = rnd.nextInt(bound);
		return RandomGenerator;

	}

	public static void takeScreenshot(WebDriver driver) {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String label = formatter.format(date);

		try {
			FileUtils.copyFile(sourceFile, new File(System.getProperty("user.dir") + "/screenshot/" + label + ".png"));
		} catch (IOException e) {
			e.printStackTrace();	}
	}

	public static void teardown() {
		driver.close();
		driver.quit();

	}
}
