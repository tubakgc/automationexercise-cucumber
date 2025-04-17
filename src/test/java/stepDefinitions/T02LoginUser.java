package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.T02LoginUserPage;

public class T02LoginUser {

    T02LoginUserPage lUP= new T02LoginUserPage();


    @Then("I verify that Login to your account is visible")
    public void ıVerifyThatLoginToYourAccountIsVisible() {

        Assert.assertEquals(lUP.verifyAccountVisible.getText(),"Login to your account");

    }

    @When("I enter correct email address and password")
    public void ıEnterCorrectEmailAddressAndPassword() {


        lUP.emailRegister.sendKeys(Hooks.email);
        lUP.passwordRegister.sendKeys(Hooks.password);
        
    }

    @And("I click login button")
    public void ıClickLoginButton() {
        lUP.loginClickRegister.click();
    }


}
