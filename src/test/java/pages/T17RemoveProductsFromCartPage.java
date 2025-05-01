package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class T17RemoveProductsFromCartPage extends BasePage {


    @FindBy(xpath = "//i[@class='fa fa-times']")
    public WebElement xButton;

    @FindBy(xpath = "//font[contains(text(),'Sepetiniz boş!')]")
    public WebElement removedCartVerifyText;

}
