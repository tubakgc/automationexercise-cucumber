package stepDefinitions;

import io.cucumber.java.en.And;
import pages.T16PlaceOrderLoginBeforeCheckoutPage;

public class T16PlaceOrderLoginBeforeCheckoutStepDef {
    T16PlaceOrderLoginBeforeCheckoutPage pOLBC= new T16PlaceOrderLoginBeforeCheckoutPage();

    @And("I fill email, password and click Login button")
    public void ıFillEmailPasswordAndClickLoginButton() {
        pOLBC.emailText.sendKeys(Hooks.email);
        pOLBC.passwordText.sendKeys(Hooks.password);
        pOLBC.loginButton.click();
    }
}
