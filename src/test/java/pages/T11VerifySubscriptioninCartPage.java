package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class T11VerifySubscriptioninCartPage extends BasePage{
    @FindBy(xpath = "//li/a[@href='/view_cart']")
    public WebElement cardPageButton;

}
