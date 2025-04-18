package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.T04LogoutUserPage;
import utilities.Driver;
import utilities.ReusableMethods;


public class T04LogoutUserStepDef {
    T04LogoutUserPage lOUP =new T04LogoutUserPage();


    @When("I click LogOut button")
    public void ıClickLogOutButton() {
        ReusableMethods.jsScroll(lOUP.logoutButton);
        lOUP.logoutButton.click();
    }

    @Then("I should be navigate to the login page")
    public void i_should_be_navigate_to_the_login_page() {

        String expecttURL= Driver.getDriver().getCurrentUrl();
        String actuallUrl = "https://www.automationexercise.com/login";
        Assert.assertEquals(expecttURL,actuallUrl);
       // assert currentUrl.contains("login"); // Beklenen URL pattern'ine göre düzenleyin
    }



}
