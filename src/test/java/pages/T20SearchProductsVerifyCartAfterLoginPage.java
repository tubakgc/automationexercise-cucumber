package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class T20SearchProductsVerifyCartAfterLoginPage extends BasePage {

    @FindBy(xpath = "//div[3]//div[1]//div[1]//div[2]//div[1]//a[1]")
    public WebElement blueProductsAddCart;

    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    public WebElement viewCart;

    @FindBy(xpath = "//li[@class='active']")
    public WebElement shoppingCart;

    @FindBy(xpath = "//a[@href=\"/view_cart\"]")
    public WebElement againCart;
}
