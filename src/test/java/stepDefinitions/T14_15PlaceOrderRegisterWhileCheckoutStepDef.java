package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.T14_15PlaceOrderRegisterWhileCheckoutPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Year;

import static utilities.ReusableMethods.getFaker;

public class T14_15PlaceOrderRegisterWhileCheckoutStepDef {
    T14_15PlaceOrderRegisterWhileCheckoutPage pRWC = new T14_15PlaceOrderRegisterWhileCheckoutPage();
    Hooks hooks = new Hooks();
    String product;

    @When("I add products to cart")
    public void ıAddProductsToCart() {
        WebElement elementProduct = ReusableMethods.randomSelected(pRWC.anyProducts);
        ReusableMethods.clickWithJS(elementProduct);
        ReusableMethods.hover(elementProduct);
        ReusableMethods.jsScrollClick(elementProduct);
        //elementProduct.click();
        product = elementProduct.getText();
    }

    @Then("I verify that cart page is displayed")
    public void ıVerifyThatCartPageIsDisplayed() {
        String actualPage = "https://www.automationexercise.com/view_cart";
        String expectedPage = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualPage, expectedPage);
    }

    @When("I click Proceed To Checkout")
    public void ıClickProceedToCheckout() {
        pRWC.checkOutButton.click();
    }

    @And("I click Register-Login button")
    public void ıClickRegisterLoginButton() {
        pRWC.registerLoginButton.click();
    }

    @And("I fill all details in Signup and create account")
    public void ıFillAllDetailsInSignupAndCreateAccount() {
        hooks.fillAndCreateAccount();
    }

    @Then("I verify ACCOUNT CREATED! and click Continue button")
    public void ıVerifyACCOUNTCREATEDAndClickContinueButton() {
        Assert.assertEquals(pRWC.createAccoutVerifyText.getText(), "ACCOUNT CREATED!");
        pRWC.continueButton.click();
    }

    @And("I verify Logged in as username at top")
    public void ıVerifyLoggedInAsUsernameAtTop() {
        Assert.assertEquals(pRWC.userNameVerifyText.getText(), "Logged in as " + Hooks.name);
    }

    @And("I click Proceed To Checkout button")
    public void ıClickProceedToCheckoutButton() {
        pRWC.checkOutButton.click();
    }

    @Then("I verify Address Details and Review Your Order")
    public void ıVerifyAddressDetailsAndReviewYourOrder() {
        Assert.assertEquals(2, pRWC.checkoutVerifyAddress.size());
        Assert.assertEquals(1, pRWC.checkoutVerifyOrder.size());
    }

    @When("I enter description in comment text area and click Place Order")
    public void ıEnterDescriptionInCommentTextAreaAndClickPlaceOrder() {
        String message = getFaker().lorem().fixedString(100);
        pRWC.descriptionTextBox.sendKeys(message);
        pRWC.placeOrderButton.click();
    }

    @And("I enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void ıEnterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {
        pRWC.nameOnCardTextBox.sendKeys(Hooks.name);
        String cardNumber=getFaker().business().creditCardNumber();
        pRWC.cardNumberTextBox.sendKeys(cardNumber);
        String cvc =getFaker().number().digits(3);
        pRWC.cvcTextBox.sendKeys(cvc);
        Integer expMonth=getFaker().random().nextInt(1,12);
        pRWC.expiryMonthTextBox.sendKeys(String.valueOf(expMonth));
        Integer expYear=getFaker().random().nextInt(Year.now().getValue(),2100);
        pRWC.expiryYearTextBox.sendKeys(String.valueOf(expYear));
    }

    @And("I click Pay and Confirm Order button")
    public void ıClickPayAndConfirmOrderButton() {
        pRWC.payAndConfirmOrderButton.click();
    }

    @Then("I verify success message Your order has been placed successfully!")
    public void ıVerifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {
        Assert.assertEquals("Congratulations! Your order has been confirmed!",
                pRWC.payAndConfirmOrderSuccessText.getText());
    }

    @Then("I verify ACCOUNT DELETED! and click Continue button")
    public void ıVerifyACCOUNTDELETEDAndClickContinueButton() {
        Assert.assertTrue(pRWC.accountDeleteVerifyText.isDisplayed());
        pRWC.accountDeleteContinueButton.click();
    }
}
