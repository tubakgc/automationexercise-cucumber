package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.T24DownloadInvoiceAfterPurchaseOrderPage;
import utilities.ReusableMethods;

public class T24DownloadInvoiceAfterPurchaseOrderStepDef {
    T24DownloadInvoiceAfterPurchaseOrderPage dIAPO = new T24DownloadInvoiceAfterPurchaseOrderPage();

    @When("I click Download Invoice button")
    public void ıClickDownloadInvoiceButton() {
        dIAPO.downloadInvoiceButton.click();
    }

    @Then("I verify the invoice is downloaded successfully")
    public void ıVerifyTheInvoiceIsDownloadedSuccessfully() {
        Assert.assertTrue(dIAPO.downloadInvoiceButtonVerify.isDisplayed());
        ReusableMethods.waitFor(5);
        ReusableMethods.deleteIndexTxtFiles("invoice", "txt");
    }


}