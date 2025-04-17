package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;



public class T02LoginUserPage {

   public T02LoginUserPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/h2[1]")
    public WebElement verifyAccountVisible;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement emailRegister;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordRegister;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    public WebElement loginClickRegister;


}
