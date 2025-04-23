package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class T12AddProductsinCartPage extends  BasePage{
    @FindBy(xpath = "//img[@src='/get_product_picture/1']")
    public WebElement firstProduct;

    @FindBy(xpath = " (//div[@class='overlay-content']/a)[1]")
    public WebElement firstProductAddCart;

    @FindBy(xpath = " //button[@class='btn btn-success close-modal btn-block']")
    public WebElement continueShoppingButton;

    @FindBy(xpath = "//img[@src='/get_product_picture/2']")
    public WebElement secondProduct;

    @FindBy(xpath = " (//div[@class='overlay-content']/a)[2]")
    public WebElement secondProductAddCart;

    @FindBy(xpath = " //p/a[@href='/view_cart']")
    public WebElement viewCartButton;

    @FindBy(xpath = " //tr[contains(@id, 'product')]")
    public List<WebElement> viewCartProducts;

    @FindBy(xpath = " (//td[@class='cart_price'])[1]")
    public WebElement viewCartFirstProductPrice;

    @FindBy(xpath = " (//td[@class='cart_quantity'])[1]")
    public WebElement viewCartFirstProductQuantity;

    @FindBy(xpath = " (//td[@class='cart_total'])[1]")
    public WebElement viewCartFirstProductTotal;

    @FindBy(xpath = " (//td[@class='cart_price'])[2]")
    public WebElement viewCartSecondProductPrice;

    @FindBy(xpath = " (//td[@class='cart_quantity'])[2]")
    public WebElement viewCartSecondProductQuantity;

    @FindBy(xpath = " (//td[@class='cart_total'])[2]")
    public WebElement viewCartSecondProductTotal;
}
