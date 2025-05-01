package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.T22AddToCartFromRecommendeıtemsPage;
import utilities.ReusableMethods;

public class T22AddToCartFromRecommendeıtemsStepDef {
    T22AddToCartFromRecommendeıtemsPage aCFR=new T22AddToCartFromRecommendeıtemsPage();
    String text;

    @When("I scroll to the bottom of the page")
    public void ıScrollToTheBottomOfThePage() {
        Assert.assertTrue(aCFR.verifyRecommendedItems.isEnabled());
    }

    @Then("I verify that RECOMMENDED ITEMS are visible")
    public void ıVerifyThatRECOMMENDEDITEMSAreVisible() {
        Assert.assertTrue(aCFR.verifyRecommendedItems.isDisplayed());
    }

    @When("I click on Add To Cart on a recommended product")
    public void ıClickOnAddToCartOnARecommendedProduct() {
        WebElement element= ReusableMethods.randomSelected(aCFR.listRecommendedItems);
        int select=aCFR.listRecommendedItems.indexOf(element);
        text=aCFR.addToCartRecommendedItemsText.get(select).getText();
        element.click();
    }



}
