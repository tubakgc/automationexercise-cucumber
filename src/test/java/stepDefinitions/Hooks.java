package stepDefinitions;

import org.junit.Assert;
import pages.T01RegisterUserPage;
import utilities.ConfigReader;
import utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.*;

public class Hooks {

    T01RegisterUserPage rUP=new T01RegisterUserPage();
    static String email;
    static String password;
    static String name;
    static String company;
    static String phoneNumber;
    static String firstname;
    static String lastname;
    static String address1;
    static String address2;
    static String state;
    static String city;
    static String zipcode;

    ""

    @Before(order = 1, value = "@RegisterUser")
    public void registerUser() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        //jsScrollClick(rUP.signUpLoginButton);
        ReusableMethods.jsScroll(rUP.signUpLoginButton);
        rUP.signUpLoginButton.click();
        System.out.println("before çalıştı");

        email = getFaker().internet().emailAddress();
        password =getFaker().internet().password();
        name=getFaker().name().firstName();

        rUP.nameText.sendKeys(name);
        rUP.emailText.sendKeys(email);
        rUP.signUpButton.click();
        Assert.assertEquals(rUP.signUpVerifyText.getText(),"ENTER ACCOUNT INFORMATION");
        ReusableMethods.titleSelected(rUP.titleRadioButton).click();
        rUP.accountPasswordText.sendKeys(password);
        ReusableMethods.selectBirthDate(rUP.selectDaysDrop,rUP.selectMonthsDrop,rUP.selectYearsDrop);
        ReusableMethods.jsScroll(rUP.companyNameText);
        rUP.checkBox1.click();
        rUP.checkBox2.click();
        firstname=getFaker().name().firstName();
        rUP.firstNameText.sendKeys(firstname);
        lastname=getFaker().name().lastName();
        rUP.lastNameText.sendKeys(lastname);
        company=getFaker().company().name();
        rUP.companyNameText.sendKeys(company);
        address1=getFaker().address().streetAddress();
        rUP.addressText.sendKeys(address1);
        address2=getFaker().address().streetAddress();
        rUP.address2Text.sendKeys(address2);
        ReusableMethods.selectCountry(rUP.countryDrop);
        city=getFaker().address().city();
        rUP.cityText.sendKeys(city);
        state=getFaker().address().state();
        rUP.stateText.sendKeys(state);
        zipcode=getFaker().address().zipCode();
        rUP.zipcodeText.sendKeys(zipcode);
        phoneNumber=getFaker().phoneNumber().phoneNumber();
        rUP.mobileNumberText.sendKeys(phoneNumber);
        ReusableMethods.jsScroll(rUP.createAccountButton);
        rUP.createAccountButton.click();
        Assert.assertEquals(rUP.createAccoutVerifyText.getText(),"ACCOUNT CREATED!");
        rUP.continueButton.click();
        rUP.userNameVerifyText.isDisplayed();

        Driver.closeDriver();

    }

    @After
    public void tearDown(Scenario scenario){

        System.out.println("After çalıştı");
        final byte[] failedScreenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(failedScreenshot, "image/png", "failed_screenshot"+scenario.getName());

        }

        Driver.closeDriver();
    }
}