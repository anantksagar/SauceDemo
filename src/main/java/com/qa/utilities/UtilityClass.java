package com.qa.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class UtilityClass extends TestBase {

	@FindBy(xpath = "//button[text()='Add to cart']")
	private WebElement add_to_cart;

	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement shoppng_cart_link;

	@FindBy(xpath = "//button[@id='back-to-products']")
	private WebElement back_to_products;

	public UtilityClass() {
		PageFactory.initElements(driver, this);

	}

	public void clickOnAddToCart() {
		add_to_cart.click();
	}

	public void clickOnShoppingCartLink() {
		shoppng_cart_link.click();
	}

	public void clickOnBackToProducts() {
		back_to_products.click();
	}

	public static void screenShot() {
		try {
			String path = "B:\\Velocitytraining\\Setup\\Eclipse_IDE_2021_12\\Eclipse_Workspace_2021_12\\SauceDemo\\screenShotFailedTest";

			TakesScreenshot ts = (TakesScreenshot) driver;
			
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			File f = new File(path + System.currentTimeMillis() + ".png");

			FileHandler.copy(src, f);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
