package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.T19ViewCartBrandProductsPage;
import utilities.ReusableMethods;

public class T19ViewCartBrandProductsStepDef {
    T19ViewCartBrandProductsPage vCBP=new T19ViewCartBrandProductsPage();

    @Then("I verify that Brands are visible on left side bar")
    public void ıVerifyThatBrandsAreVisibleOnLeftSideBar() {
        Assert.assertEquals(vCBP.brandsProductsVerify.getText(),"BRANDS");
    }

    @When("I click on any brand name")
    public void ıClickOnAnyBrandName() {
        ReusableMethods.jsScrollClick(vCBP.babyhugButton);
    }

    @Then("I verify that I am navigated to the brand page")
    public void ıVerifyThatIAmNavigatedToTheBrandPage() {
        Assert.assertTrue(vCBP.babyhugVerifyText.isDisplayed());
    }

    @And("I verify that brand products are displayed")
    public void ıVerifyThatBrandProductsAreDisplayed() {
        Assert.assertTrue(vCBP.activePage.isDisplayed());
    }

    @When("On left side bar, I click on any other brand link")
    public void onLeftSideBarIClickOnAnyOtherBrandLink() {
        ReusableMethods.clickWithJS(vCBP.mastHarbourButton);
    }

    @Then("I verify that I am navigated to that brand page")
    public void ıVerifyThatIAmNavigatedToThatBrandPage() {
        Assert.assertTrue(vCBP.activePage.isDisplayed());
    }

    @And("I verify that I can see products for this brand")
    public void ıVerifyThatICanSeeProductsForThisBrand() {
        Assert.assertTrue(vCBP.mastHarbourProductsVerifyText.isDisplayed());
    }
}
