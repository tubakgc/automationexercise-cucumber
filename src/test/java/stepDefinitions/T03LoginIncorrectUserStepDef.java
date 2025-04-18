package stepDefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.T03LoginIncorrectUserPage;
import pages.T02LoginUserPage;

import static utilities.ReusableMethods.getFaker;

public class T03LoginIncorrectUserStepDef {

    T03LoginIncorrectUserPage lIUP =new T03LoginIncorrectUserPage();
    T02LoginUserPage lUP= new T02LoginUserPage();

    @When("I enter incorrect email address and password")
    public void ıEnterIncorrectEmailAddressAndPassword() {
        String email=getFaker().internet().emailAddress();
        String password=getFaker().internet().emailAddress();
        lUP.emailRegister.sendKeys(email);
        lUP.passwordRegister.sendKeys(password);
    }

    @Then("I verify error Your email or password is incorrect! is visible")
    public void ıVerifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        Assert.assertEquals(lIUP.verifyIncorrentVisible.getText(),"Your email or password is incorrect!");

    }



}
