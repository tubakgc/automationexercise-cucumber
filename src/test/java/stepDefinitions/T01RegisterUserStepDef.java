package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.T01RegisterUserPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.getDriver;
import static utilities.ReusableMethods.getFaker;

public class T01RegisterUserStepDef {
    T01RegisterUserPage rUP= new T01RegisterUserPage();
    Faker faker = new Faker();
    Actions actions = new Actions(getDriver());


    @Given("I launch the browser")
    public void ıLaunchTheBrowser() {

    }

    @When("I navigate to url automationexercise.com")
    public void ıNavigateToUrlAutomationexerciseCom() {
       getDriver().get(ConfigReader.getProperty("url"));
    }

    @Then("I verify that home page is visible successfully")
    public void ıVerifyThatHomePageIsVisibleSuccessfully() {
        String expectURL=Driver.getDriver().getCurrentUrl();
        String actualUrl = "https://www.automationexercise.com/";
        Assert.assertEquals(expectURL,actualUrl);
        System.out.println(expectURL);
    }

    @When("I click on Signup and Login button")
    public void ıClickOnSignupLoginButton() {
        rUP.signUpLoginButton.click();
    }

    @Then("I verify that New User Signup! is visible")
    public void ıVerifyThatNewUserSignupIsVisible() {
        rUP.signUpText.isDisplayed();
    }

    @When("I enter name and email address")
    public void ıEnterNameAndEmailAddress() {
        String firstName=getFaker().name().firstName();
        String email=getFaker().internet().emailAddress();

        rUP.nameText.sendKeys(firstName);
        rUP.emailText.sendKeys(email);

    }

    @And("I click Signup button")
    public void ıClickSignupButton() {
        rUP.signUpButton.click();
    }

    @Then("I verify that ENTER ACCOUNT INFORMATION is visible")
    public void ıVerifyThatENTERACCOUNTINFORMATIONIsVisible() {
        Assert.assertEquals(rUP.signUpVerifyText.getText(),"ENTER ACCOUNT INFORMATION");



    }

    @When("I fill details: Title, Name, Email, Password, Date of birth")
    public void ıFillDetailsTitleNameEmailPasswordDateOfBirth() {
        ReusableMethods.titleSelected(rUP.titleRadioButton).click();
        String password = faker.internet().password();
        rUP.accountPasswordText.sendKeys(password);
        ReusableMethods.selectBirthDate(rUP.selectDaysDrop,rUP.selectMonthsDrop,rUP.selectYearsDrop);

    }

    @And("I select checkbox Sign up for our newsletter!")
    public void ıSelectCheckboxSignUpForOurNewsletter() {
        ReusableMethods.jsScroll(rUP.companyNameText);
        rUP.checkBox1.click();
    }

    @And("I select checkbox Receive special offers from our partners!")
    public void ıSelectCheckboxReceiveSpecialOffersFromOurPartners() {

        rUP.checkBox2.click();
    }

    @And("I fill details: First name, Last name, Company, Address, Address{int}, Country, State, City, Zipcode, Mobile Number")
    public void ıFillDetailsFirstNameLastNameCompanyAddressAddressCountryStateCityZipcodeMobileNumber(int arg0) {
        String firstName=getFaker().name().firstName();
        rUP.firstNameText.sendKeys(firstName);
        String lastName=getFaker().name().lastName();
        rUP.lastNameText.sendKeys(lastName);
        String company=getFaker().company().name();
        rUP.companyNameText.sendKeys(company);
        String fakerAddress=getFaker().address().streetAddress();
        rUP.addressText.sendKeys(fakerAddress);
        String fakerAddressTwo=getFaker().address().streetAddress();
        rUP.address2Text.sendKeys(fakerAddressTwo);
        ReusableMethods.selectCountry(rUP.countryDrop);
        String city=getFaker().address().city();
        rUP.cityText.sendKeys(city);
        String state=getFaker().address().state();
        rUP.stateText.sendKeys(state);
        String zip=getFaker().address().zipCode();
        rUP.zipcodeText.sendKeys(zip);
        String phone=getFaker().phoneNumber().phoneNumber();
        rUP.mobileNumberText.sendKeys(phone);
    }

    @And("I click Create Account button")
    public void ıClickCreateAccountButton() {
        ReusableMethods.jsScroll(rUP.createAccountButton);
        rUP.createAccountButton.click();
    }

    @Then("I verify that ACCOUNT CREATED! is visible")
    public void ıVerifyThatACCOUNTCREATEDIsVisible() {
        Assert.assertEquals(rUP.createAccoutVerifyText.getText(),"ACCOUNT CREATED!");
    }

    @When("I click Continue button")
    public void ıClickContinueButton() {
        rUP.continueButton.click();
    }

    @Then("I verify that Logged in as username is visible")
    public void ıVerifyThatLoggedInAsUsernameIsVisible() {
        rUP.userNameVerifyText.isDisplayed();


    }

    @When("I click Delete Account button")
    public void ıClickDeleteAccountButton() {
        rUP.deleteAccountButton.click();
    }

    @Then("I verify that ACCOUNT DELETED! is visible")
    public void ıVerifyThatACCOUNTDELETEDIsVisible() {
        rUP.deleteAccountVerifyText.isDisplayed();
    }


    @And("I click Continue buttone")
    public void ıClickContinueButtone() {
        rUP.deleteContinueButton.click();
    }

}
