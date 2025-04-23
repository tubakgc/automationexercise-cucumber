package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.T13VerifyProductQuantityinCartPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class T13VerifyProductQuantityinCartStepDef {
    int viewQuantity=0;
    T13VerifyProductQuantityinCartPage vPQC =new T13VerifyProductQuantityinCartPage();
    @When("I click View Product for any product on home page")
    public void ıClickViewProductForAnyProductOnHomePage() {
        WebElement element= ReusableMethods.randomSelected(vPQC.viewAnyProducts);
        ReusableMethods.jsScrollClick(element);

    }

    @Then("I verify product detail is opened")
    public void ıVerifyProductDetailIsOpened() {
        String actualTitle="Automation Exercise - Product Details";
        String expectedTitle= Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @When("I increase quantity to {int}")
    public void ıIncreaseQuantityTo(int quantity) {
        vPQC.quantityTextBox.clear();
        vPQC.quantityTextBox.sendKeys(String.valueOf(quantity));
        viewQuantity=quantity;
    }

    @And("I click Add to cart button")
    public void ıClickAddToCartButton() {
        vPQC.addCartButton.click();
    }

    @Then("I verify that product is displayed in cart page with exact quantity")
    public void ıVerifyThatProductIsDisplayedInCartPageWithExactQuantity() {
        Assert.assertEquals(String.valueOf(viewQuantity),vPQC.viewCartFirstProductQuantity.getText());
    }
}
