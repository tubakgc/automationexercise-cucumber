package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class T22AddToCartFromRecommendeıtemsPage extends BasePage{


    @FindBy(xpath = " //h2[normalize-space()='recommended items']")
    public WebElement verifyRecommendedItems;

    @FindBy(xpath = " //h2[normalize-space()='recommended items']")
    public WebElement recommendedProduct;

    @FindBy(xpath = "  //div[@class='item active']//a[@class='btn btn-default add-to-cart']")
    public List<WebElement> listRecommendedItems;

    @FindBy(xpath = "  //div[@class='item active']//div[@class='productinfo text-center']/p")
    public List<WebElement> addToCartRecommendedItemsText;
}
