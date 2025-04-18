package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.T07VerifyTestCasesPage;


public class T07VerifyTestCasesSatepDef {
    T07VerifyTestCasesPage vTC = new T07VerifyTestCasesPage();

    @When("I click on Test Cases button")
    public void ıClickOnTestCasesButton() {
        vTC.testCasesPage.click();
    }

    @Then("I verify that I am navigated to test cases page successfully")
    public void ıVerifyThatIAmNavigatedToTestCasesPageSuccessfully() {

        Assert.assertTrue(vTC.testCasesTitle.isDisplayed());
    }
}
