package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.T23VerifyAddressDetailsinCheckoutPage;


public class T23VerifyAddressDetailsinCheckoutStepDef {
    T23VerifyAddressDetailsinCheckoutPage vADC = new T23VerifyAddressDetailsinCheckoutPage();

    @Then("I verify that the delivery address matches registration details")
    public void ıVerifyThatTheDeliveryAddressMatchesRegistrationDetails() {
        Assert.assertEquals(vADC.addressDeliveryNames.getText(),Hooks.title+" "+Hooks.firstname+" "+Hooks.lastname);
        Assert.assertEquals(vADC.addressDeliveryCompany.getText(),Hooks.company);
        Assert.assertEquals(vADC.addressDeliveryAddress1.getText(),Hooks.address1);
        Assert.assertEquals(vADC.addressDeliveryAddress2.getText(),Hooks.address2);
        Assert.assertEquals(vADC.addressDeliveryExtras.getText(),Hooks.city+" "+Hooks.state+" "+Hooks.zipcode);
        Assert.assertEquals(vADC.addressDeliveryCountry.getText(),Hooks.country);
        Assert.assertEquals(vADC.addressDeliveryPhone.getText(),Hooks.phoneNumber);

    }

    @And("I verify that the billing address matches registration details")
    public void ıVerifyThatTheBillingAddressMatchesRegistrationDetails() {
        Assert.assertEquals(vADC.addressBillingNames.getText(),Hooks.title+" "+Hooks.firstname+" "+Hooks.lastname);
        Assert.assertEquals(vADC.addressBillingCompany.getText(),Hooks.company);
        Assert.assertEquals(vADC.addressBillingAddress1.getText(),Hooks.address1);
        Assert.assertEquals(vADC.addressBillingAddress2.getText(),Hooks.address2);
        Assert.assertEquals(vADC.addressBillingExtras.getText(),Hooks.city+" "+Hooks.state+" "+Hooks.zipcode);
        Assert.assertEquals(vADC.addressBillingCountry.getText(),Hooks.country);
        Assert.assertEquals(vADC.addressBillingPhone.getText(),Hooks.phoneNumber);
    }
}
