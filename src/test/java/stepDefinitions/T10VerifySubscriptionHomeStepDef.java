package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.T10VerifySubscriptionHomePage;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.getFaker;

public class T10VerifySubscriptionHomeStepDef {
    T10VerifySubscriptionHomePage vSH = new T10VerifySubscriptionHomePage();
    @When("I scroll down to footer")
    public void ıScrollDownToFooter() {
        ReusableMethods.jsScroll(vSH.subscriptionText);

    }

    @Then("I verify text SUBSCRIPTION")
    public void ıVerifyTextSUBSCRIPTION() {
        Assert.assertTrue(vSH.subscriptionText.isDisplayed());
    }

    @When("I enter email address in input and click arrow button")
    public void ıEnterEmailAddressInInputAndClickArrowButton() {
        String mail=getFaker().internet().emailAddress();
        vSH.susbscribeMailTextBox.sendKeys(mail);
        vSH.susbscribeButton.click();
    }

    @Then("I verify success message You have been successfully subscribed! is visible")
    public void ıVerifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() {
    Assert.assertTrue(vSH.subscriptionSuccess.isDisplayed());
    }
}
