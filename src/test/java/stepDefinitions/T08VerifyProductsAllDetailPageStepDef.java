package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.T08VerifyProductsAllDetailPage;

public class T08VerifyProductsAllDetailPageStepDef {
    T08VerifyProductsAllDetailPage vPAD =new T08VerifyProductsAllDetailPage();

    @And("I click on the Products button")
    public void ıClickOnTheProductsButton() {
        vPAD.productsButton.click();
    }

    @Then("I should be navigated to the ALL PRODUCTS page")
    public void ıShouldBeNavigatedToTheALLPRODUCTSPage() {
        Assert.assertTrue(vPAD.allProductsPage.isDisplayed());
    }

    @And("I should see the products list")
    public void ıShouldSeeTheProductsList() {
    }

    @When("I click View Product for the first product")
    public void ıClickViewProductForTheFirstProduct() {
    }

    @Then("I should be landed on the product detail page")
    public void ıShouldBeLandedOnTheProductDetailPage() {
    }

    @And("I should verify the following product details:")
    public void ıShouldVerifyTheFollowingProductDetails() {
    }
}
