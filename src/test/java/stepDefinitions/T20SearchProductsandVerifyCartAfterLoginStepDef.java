package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import pages.T11VerifySubscriptioninCartPage;
import pages.T20SearchProductsandVerifyCartAfterLoginPage;
import utilities.ReusableMethods;


public class T20SearchProductsandVerifyCartAfterLoginStepDef {
    T20SearchProductsandVerifyCartAfterLoginPage tc20_searchProductsandVerifyCartAfterLoginPage=new T20SearchProductsandVerifyCartAfterLoginPage();
    T11VerifySubscriptioninCartPage tc11_verifySubscriptioninCartPage=new T11VerifySubscriptioninCartPage();
    Hooks hooks=new Hooks();


    @When("I add those products to cart")
    public void ıAddThoseProductsToCart() {
        ReusableMethods.bulveTikla(tc20_searchProductsandVerifyCartAfterLoginPage.searchProductsVerifyText);
        for (int i = 0; i < tc20_searchProductsandVerifyCartAfterLoginPage.searcProductList.size(); i++) {
            ReusableMethods.hover(tc20_searchProductsandVerifyCartAfterLoginPage.searcProductList.get(i));
            tc20_searchProductsandVerifyCartAfterLoginPage.productAddCart.get(i).click();
            tc20_searchProductsandVerifyCartAfterLoginPage.continueShoppingButton.click();
        }
    }


    @Then("I verify that {string} are visible in cart")
    public void ıVerifyThatAreVisibleInCart(String product) {
        verifyProductCartList(product);
    }


    @When("I click Signup-Login button and submit login details")
    public void ıClickSignupLoginButtonAndSubmitLoginDetails() {
        hooks.fillAndCreateAccount();
        tc20_searchProductsandVerifyCartAfterLoginPage.continueButton.click();
    }

    @And("I again go to Cart page")
    public void ıAgainGoToCartPage() {
        tc11_verifySubscriptioninCartPage.cardPageButton.click();
    }

    @Then("I verify that those {string} are visible in cart after login as well")
    public void ıVerifyThatThoseAreVisibleInCartAfterLoginAsWell(String product) {
        verifyProductCartList(product);
    }


    private void verifyProductCartList(String product)
    {
        for (int i = 0; i < tc20_searchProductsandVerifyCartAfterLoginPage.productCartList.size(); i++) {
            Assert.assertTrue(tc20_searchProductsandVerifyCartAfterLoginPage.productCartList.get(i).getText().contains(product));
        }
    }


}
