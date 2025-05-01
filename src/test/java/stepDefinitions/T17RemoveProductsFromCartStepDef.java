package stepDefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.T17RemoveProductsFromCartPage;
import utilities.ReusableMethods;

public class T17RemoveProductsFromCartStepDef {
    T17RemoveProductsFromCartPage rPFC = new T17RemoveProductsFromCartPage();
    @When("I click X button corresponding to a particular product")
    public void ıClickXButtonCorrespondingToAParticularProduct() {
        // ReusableMethods.clickWithJS(rPFC.xButton);
       // ReusableMethods.jsScrollClick(rPFC.xButton);
        Assert.assertTrue(rPFC.xButton.isEnabled());
        rPFC.xButton.click();
    }


    @Then("I verify that the product is removed from the cart")
    public void ıVerifyThatTheProductIsRemovedFromTheCart() {

        Assert.assertEquals(rPFC.removedCartVerifyText.getText(), "Cart is empty! Click here to buy products.");
    }
}
