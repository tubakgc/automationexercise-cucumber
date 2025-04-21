package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class T08VerifyProductsAllDetailPage extends BasePage {

    @FindBy(xpath = "//a[@href=\"/products\"]")
    public WebElement productsButton;

    @FindBy(css = ".title.text-center")
    public WebElement allProductsPage;

    @FindBy(xpath = "//*[@class='features_items']//*[@class='col-sm-4']/div/div/div/p")
    public List<WebElement> allProduct;

    @FindBy(xpath = "//a[@href=\"/product_details/1\"]")
    public WebElement productTheFirst;

    @FindBy(css = ".product-information")
    public WebElement productTheFirstPage;

    @FindBy(xpath = "//div[@class='product-information']/h2")
    public WebElement productNameText;

    @FindBy(xpath = "(//div[@class='product-information']/p)[1]")
    public WebElement productCategoryText;

    @FindBy(xpath = "//div[@class='product-information']/span/span")
    public WebElement productPriceText;

    @FindBy(xpath = " (//div[@class='product-information']/p)[2]")
    public WebElement productAvailabilityText;

    @FindBy(xpath = " (//div[@class='product-information']/p)[3]")
    public WebElement productConditionText;

    @FindBy(xpath = " (//div[@class='product-information']/p)[4]")
    public WebElement productBrandText;

}
