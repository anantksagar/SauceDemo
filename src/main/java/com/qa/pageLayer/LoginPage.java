package com.qa.pageLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.testBase.TestBase;
import com.qa.testData.TestData;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//input[@id = 'user-name']")
	private WebElement userName;

	@FindBy(xpath = "//input[@id = 'password']")
	private WebElement passWord;

	@FindBy(xpath = "//input[@id = 'login-button']")
	private WebElement loginButton;

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}
	//"performance_glitch_user"
	public void clickOnUserName() {
		userName.sendKeys("performance_glitch_user");
	}
	//"secret_sauce"
	public void clickOnPassWord() {
		passWord.sendKeys("secret_sauce");
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}
}
