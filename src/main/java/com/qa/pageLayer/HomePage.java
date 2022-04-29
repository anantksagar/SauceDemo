package com.qa.pageLayer;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath ="//button[@class='btn btn_primary btn_small btn_inventory']")
	private List <WebElement> productList; 

	@FindBy(xpath = "//div[text()='Sauce Labs Bolt T-Shirt']")
	private WebElement sauce_Labs_Bolt_T_Shirt;

	@FindBy(xpath = "//div[text()='Sauce Labs Bike Light']")
	private WebElement sauce_Labs_Bike_Light;

	@FindBy(xpath = "//div[text()='Sauce Labs Onesie']")
	private WebElement sauce_Labs_Onesie;

	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	private WebElement burgerMenu;

	@FindBy(xpath = "//a[@id='logout_sidebar_link']")
	private WebElement logoutButton;

	public HomePage() {
		PageFactory.initElements(driver, this);

	}

	public void clickOnAnyProduct() {
		for(WebElement list1 : productList) {
			list1.click();
			
		}
	}
	public void clickOnSauceLabsBoltTShirt() {
		sauce_Labs_Bolt_T_Shirt.click();

	}

	public void clickOnSauceLabsBikeLight() {
		sauce_Labs_Bike_Light.click();
	}

	public void clickonSauceLabsOnesie() {
		sauce_Labs_Onesie.click();
	}

	public void clickOnBurgerMenu() {
		burgerMenu.click();
	}

	public void clickOnLogoutButton() {
		logoutButton.click();
	}
}
