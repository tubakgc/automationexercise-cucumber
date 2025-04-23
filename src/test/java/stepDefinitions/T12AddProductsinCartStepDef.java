package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.T12AddProductsinCartPage;
import utilities.ReusableMethods;

public class T12AddProductsinCartStepDef {
    T12AddProductsinCartPage aPC =new T12AddProductsinCartPage();

    @And("I hover over first product and click Add to cart")
    public void ıHoverOverFirstProductAndClickAddToCart() {
        ReusableMethods.jsScrollClick(aPC.firstProduct);
        ReusableMethods.hover(aPC.firstProduct);
        aPC.firstProductAddCart.click();
    }

    @And("I click Continue Shopping button")
    public void ıClickContinueShoppingButton() {
        aPC.continueShoppingButton.click();
    }

    @And("I hover over second product and click Add to cart")
    public void ıHoverOverSecondProductAndClickAddToCart() {
        ReusableMethods.jsScrollClick(aPC.secondProduct);
        aPC.secondProductAddCart.click();
    }

    @And("I click View Cart button")
    public void ıClickViewCartButton() {

        ReusableMethods.jsScrollClick(aPC.viewCartButton);
    }

    @Then("I verify both products are added to Cart")
    public void ıVerifyBothProductsAreAddedToCart() {
        Assert.assertEquals(2, aPC.viewCartProducts.size());
    }

    @And("I verify their prices, quantity and total price")
    public void ıVerifyTheirPricesQuantityAndTotalPrice() {
        Assert.assertTrue(aPC.viewCartFirstProductPrice.isDisplayed()
                && aPC.viewCartSecondProductPrice.isDisplayed()
                && aPC.viewCartFirstProductQuantity.isDisplayed()
                && aPC.viewCartSecondProductQuantity.isDisplayed()
                && aPC.viewCartFirstProductTotal.isDisplayed()
                && aPC.viewCartSecondProductTotal.isDisplayed());
    }
}
