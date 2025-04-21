package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.T08VerifyProductsAllDetailPage;
import utilities.ReusableMethods;

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
        int number = 1;
        for (WebElement each:vPAD.allProduct) {
            System.out.println(number + " => " + each.getText());
            Assert.assertTrue(each.isDisplayed());
        }
    }

    @When("I click View Product for the first product")
    public void ıClickViewProductForTheFirstProduct() {
        ReusableMethods.jsScrollClick(vPAD.productTheFirst);
    }

    @Then("I should be landed on the product detail page")
    public void ıShouldBeLandedOnTheProductDetailPage() {
        Assert.assertTrue(vPAD.productTheFirstPage.isDisplayed());
    }

    @And("I should verify the following product details:")
    public void ıShouldVerifyTheFollowingProductDetails() {
        Assert.assertTrue(vPAD.productNameText.isDisplayed()&&
                vPAD.productCategoryText.isDisplayed()&&
                vPAD.productPriceText.isDisplayed()&&
                vPAD.productAvailabilityText.isDisplayed()&&
                vPAD.productConditionText.isDisplayed()&&
                vPAD.productBrandText.isDisplayed());
        
    }
}
