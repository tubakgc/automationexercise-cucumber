package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.T10VerifySubscriptionHomePage;
import pages.T25ScrollUpAndScrollDownWithArrowPage;
import utilities.ReusableMethods;

public class T25ScrollUpAndScrollDownWithArrowStepDef {
    T25ScrollUpAndScrollDownWithArrowPage sASDWA =new T25ScrollUpAndScrollDownWithArrowPage();
    T10VerifySubscriptionHomePage vSH = new T10VerifySubscriptionHomePage();
    @When("I scroll down to the bottom of the page")
    public void ıScrollDownToTheBottomOfThePage() {
        ReusableMethods.jsScroll(vSH.subscriptionText);
    }

    @When("I click the scroll-up arrow button")
    public void ıClickTheScrollUpArrowButton() {
        ReusableMethods.jsScroll(sASDWA.scrollUpButton);
    }

    @Then("I scrolled up and the text Full-Fledged practice website for Automation Engineers' is visible")
    public void ıScrolledUpAndTheTextFullFledgedPracticeWebsiteForAutomationEngineersIsVisible() {
        Assert.assertTrue(sASDWA.scrollUpAutamationVerfiyText.isDisplayed());
    }


}
