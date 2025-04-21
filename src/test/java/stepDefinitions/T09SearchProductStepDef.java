package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.T09SearchProductPage;

public class T09SearchProductStepDef {
    T09SearchProductPage sPP = new T09SearchProductPage();
    String searchItem;

    @When("I enter {string} in search input and click search button")
    public void ıEnterInSearchInputAndClickSearchButton(String search) {
        sPP.searchTextBox.sendKeys(search);
        sPP.searchButton.click();
        searchItem = search;

    }

    @Then("I verify SEARCHED PRODUCTS is visible")
    public void ıVerifySEARCHEDPRODUCTSIsVisible() {
        Assert.assertTrue(sPP.searchProductsVerifyText.isDisplayed());

    }

    @And("I verify all the products related to search are visible")
    public void ıVerifyAllTheProductsRelatedToSearchAreVisible() {
        for (WebElement element : sPP.searchProducts) {
            Assert.assertTrue(element.getText().contains(searchItem));
        }
    }
}
