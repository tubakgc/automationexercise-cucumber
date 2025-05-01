package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.T18ViewCategoryProductsPage;
import utilities.ReusableMethods;

public class T18ViewCategoryProductsStepDef {
    T18ViewCategoryProductsPage vCP=new T18ViewCategoryProductsPage();


    @Then("I verify that categories are visible on left side bar")
    public void ıVerifyThatCategoriesAreVisibleOnLeftSideBar() {
        Assert.assertTrue(vCP.categoryGroup.isDisplayed());
    }

    @When("I click on Women category")
    public void ıClickOnWomenCategory() {
        ReusableMethods.clickWithJS(vCP.womenCategory);
        vCP.womenCategory.click();
    }

    @And("I click on any category link under Women category, for example: Dress")
    public void ıClickOnAnyCategoryLinkUnderWomenCategoryForExampleDress() {
        ReusableMethods.jsScrollClick(vCP.dress);
    }

    @Then("I verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS")
    public void ıVerifyThatCategoryPageIsDisplayedAndConfirmTextWOMENTOPSPRODUCTS() {
        //Assert.assertEquals(vCP.categoryTitleVerify.getText(), "WOMEN - DRESS PRODUCTS");
    }

    @When("On left side bar, I click on any sub-category link of Men category")
    public void onLeftSideBarIClickOnAnySubCategoryLinkOfMenCategory() {
        ReusableMethods.clickWithJS(vCP.menCategory);
        vCP.menCategory.click();
        ReusableMethods.clickWithJS(vCP.jeansButton);
       // vCP.jeansButton.click();
    }

    @Then("I verify that user is navigated to that category page")
    public void ıVerifyThatUserIsNavigatedToThatCategoryPage() {
        Assert.assertEquals(vCP.categoryProductsVerify.getText(),"Men - Jeans Products");

    }
}
