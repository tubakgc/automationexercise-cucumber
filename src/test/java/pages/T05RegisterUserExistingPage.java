package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class T05RegisterUserExistingPage {

    public T05RegisterUserExistingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//p[normalize-space()='Email Address already exist!']")
    public WebElement emailExist;

}
