package com.qa.testLayer;
import org.testng.annotations.Test;
import com.qa.testBase.TestBase;

public class HomePageTest extends TestBase {

	@Test
	public void verifySauceLabsBoltTShirt() {

		h.clickOnSauceLabsBoltTShirt();
		util.clickOnAddToCart();
		util.clickOnShoppingCartLink();
	}

	@Test
	public void verifySauceLabsBikeLight() {
		h.clickOnSauceLabsBikeLight();
		util.clickOnAddToCart();
		util.clickOnShoppingCartLink();
	}

	@Test
	public void verifySauceLabsOnesie() {
		h.clickonSauceLabsOnesie();
		util.clickOnAddToCart();
		util.clickOnShoppingCartLink();
	}

}
