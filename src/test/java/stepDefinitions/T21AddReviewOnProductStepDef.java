package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.T13VerifyProductQuantityinCartPage;
import pages.T21AddReviewonProductPage;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.getFaker;

public class T21AddReviewOnProductStepDef {
    T13VerifyProductQuantityinCartPage tc13_verifyProductQuantityinCartPage=new T13VerifyProductQuantityinCartPage();
    T21AddReviewonProductPage tc21_addReviewOnProductPage=new T21AddReviewonProductPage();


    @When("I click on View Product button")
    public void ıClickOnViewProductButton() {
        WebElement element= ReusableMethods.randomSelected(tc13_verifyProductQuantityinCartPage.viewAnyProducts);
        ReusableMethods.clickWithJS(element);
        element.click();

    }



    @When("I enter name, email and review")
    public void ıEnterNameEmailAndReview() {
        String email = getFaker().internet().emailAddress();
        String name = getFaker().name().name();
        String review=getFaker().lorem().paragraph(3);
        tc21_addReviewOnProductPage.nameTextBox.sendKeys(name);
        tc21_addReviewOnProductPage.emailTextBox.sendKeys(email);
        tc21_addReviewOnProductPage.reviewTextBox.sendKeys(review);
    }

    @Then("I verify success message Thank you for your review.")
    public void ıVerifySuccessMessageThankYouForYourReview() {
        Assert.assertTrue(tc21_addReviewOnProductPage.verifyReviewMessage.isDisplayed());
    }

    @Then("I verify Write Your Review is visible")
    public void ıVerifyWriteYourReviewIsVisible() {
        Assert.assertTrue(tc21_addReviewOnProductPage.viewProductVerify.isDisplayed());
    }

    @And("I click Submite button")
    public void ıClickSubmiteButton() {
        tc21_addReviewOnProductPage.submitReview.click();

    }


}
