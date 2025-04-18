package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.T01RegisterUserPage;
import pages.T05RegisterUserExistingPage;
import utilities.ReusableMethods;

public class T05RegisterUserExistingStepDef {
    T01RegisterUserPage rUP= new T01RegisterUserPage();
    T05RegisterUserExistingPage rUPE= new T05RegisterUserExistingPage();

    @When("I enter name  and already registered email address")
    public void ıEnterNameAndAlreadyRegisteredEmailAddress() {
        rUP.nameText.sendKeys(Hooks.name);
        rUP.emailText.sendKeys(Hooks.email);
    }



    @Then("I verify error message Email Address already exist! is visible")
    public void ıVerifyErrorMessageEmailAddressAlreadyExistIsVisible() {

        ReusableMethods.waitForVisibility(rUPE.emailExist,5);
        rUPE.emailExist.isDisplayed();

    }
}
