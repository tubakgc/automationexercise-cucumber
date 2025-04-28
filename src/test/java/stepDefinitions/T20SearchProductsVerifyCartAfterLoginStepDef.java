package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.T20SearchProductsVerifyCartAfterLoginPage;
import utilities.ReusableMethods;

public class T20SearchProductsVerifyCartAfterLoginStepDef {
    T20SearchProductsVerifyCartAfterLoginPage sPVCAL =new T20SearchProductsVerifyCartAfterLoginPage();

    @When("I add those products to cart")
    public void ıAddThoseProductsToCart() {
        ReusableMethods.clickWithJS(sPVCAL.blueProductsAddCart);
        ReusableMethods.clickWithJS(sPVCAL.viewCart);
    }

    @Then("I verify that products are visible in cart")
    public void ıVerifyThatProductsAreVisibleInCart() {
        Assert.assertTrue(sPVCAL.shoppingCart.isDisplayed());

    }


    @And("I go to Cart page again")
    public void ıGoToCartPageAgain() {
        sPVCAL.againCart.click();
    }

    @Then("I verify that those products are visible in cart after login as well")
    public void ıVerifyThatThoseProductsAreVisibleInCartAfterLoginAsWell() {
        Assert.assertTrue(sPVCAL.shoppingCart.isDisplayed());

    }
}
