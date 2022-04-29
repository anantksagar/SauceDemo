package com.qa.testBase;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.qa.pageLayer.HomePage;
import com.qa.pageLayer.LoginPage;
import com.qa.testData.TestData;
import com.qa.utilities.UtilityClass;
import com.qa.utilities.WebDriverListener;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	String url = "https://www.saucedemo.com/";
	public static WebDriverListener driverListener;
	public static EventFiringWebDriver eventDriver;
	public LoginPage l;
	public HomePage h;
	public UtilityClass util;
	public TestData t;
	public String sheetName;
//	public static String username;
//	public static String password;
	public static Properties prop;

	

//	@Parameters("browser")
//	String browser
	@BeforeClass
	public void openBrowser() {

		 String browser = "chrome";
		if (browser.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else {
			System.out.println("Browser not found");
		}

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driverListener = new WebDriverListener();
		eventDriver = new EventFiringWebDriver(driver);
		eventDriver.register(driverListener);
		driver = eventDriver;

		l = new LoginPage();

		h = new HomePage();

		util = new UtilityClass();

		t = new TestData();
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

//	@DataProvider
//	public Object[][] getSauceDemoData() {
//		Object data[][] = TestData.getTestData(sheetName);
//		return data;
//	}

	@BeforeMethod
	public void verifyLogin() {
		l.clickOnUserName();
		l.clickOnPassWord();
		l.clickOnLoginButton();

	}

	@AfterMethod
	public void verifyLogOut() {
		h.clickOnBurgerMenu();
		h.clickOnLogoutButton();
	}
}
