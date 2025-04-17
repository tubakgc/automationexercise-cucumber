package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.T06ContactUsFromPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class T06ContactUsFromUser {
    T06ContactUsFromPage cUFP =new T06ContactUsFromPage();

    @When("I click on Contact Us button")
    public void ıClickOnContactUsButton() {
        cUFP.contactUs.click();
    }

    @Then("I verify GET IN TOUCH is visible")
    public void ıVerifyGETINTOUCHIsVisible() {
        Assert.assertTrue(cUFP.getInTouchTitle.isDisplayed());
    }

    @When("I enter name name, email, subject and message")
    public void ıEnterNameNameEmailSubjectAndMessage() {
        cUFP.nameBoxContact.sendKeys(Faker.instance().name().firstName());
        cUFP.emailBoxContact.sendKeys(Faker.instance().internet().emailAddress());
        cUFP.subjectBoxContact.sendKeys(Faker.instance().toString());
        cUFP.messageBoxContact.sendKeys(Faker.instance().toString());

    }

    @And("I upload a file")
    public void ıUploadAFile() {
        String file =System.getProperty("user.dir") + "/" + ConfigReader.getProperty("file.upload.path");
        cUFP.uploadFile.sendKeys(file);
    }

    @And("I click Submit button")
    public void ıClickSubmitButton() {
        ReusableMethods.jsScrollClick(cUFP.submitContact);
    }

    @And("I click OK button")
    public void ıClickOKButton() {
        ReusableMethods.waitFor(3);
        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("I verify success message Success! Your details have been submitted successfully. is visible")
    public void ıVerifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {
        Assert.assertTrue(cUFP.successMessage.isDisplayed());
    }

    @When("I click Home button")
    public void ıClickHomeButton() {
        ReusableMethods.jsScrollClick(cUFP.homeButtonContact);
    }

    @Then("I verify that I landed to home page successfully")
    public void ıVerifyThatILandedToHomePageSuccessfully() {
        String expectedData = "https://www.automationexercise.com/";
        String actualData = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedData,actualData);
    }
}
