package com.qa.testLayer;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.qa.testBase.TestBase;

//@Listeners(com.qa.utilities.TestListener.class)
public class LoginPageTest extends TestBase {
	
	@Test
	public void verifyLoginFunctionality() {
		String expTitle ="Swag Labs";
		String actTitle = driver.getTitle();
		Assert.assertEquals(expTitle, actTitle,"Title Not Match");

	}
	
}
