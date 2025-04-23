package stepDefinitions;

import io.cucumber.java.en.When;
import pages.T11VerifySubscriptioninCartPage;

public class T11VerifySubscriptioninCartStepDef {
    T11VerifySubscriptioninCartPage vSC= new T11VerifySubscriptioninCartPage();

    @When("I click Cart button")
    public void ıClickCartButton() {
        vSC.cardPageButton.click();
    }
}
