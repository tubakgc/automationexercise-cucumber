package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class T04LogoutUserPage {

    public T04LogoutUserPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    public WebElement logoutButton;

    @FindBy(xpath = "div[class='login-form'] h2")
    public WebElement loginPage;
}
