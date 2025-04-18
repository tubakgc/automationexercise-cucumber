package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class T08VerifyProductsAllDetailPage extends BasePage {

    @FindBy(xpath = "//a[@href=\"/products\"]")
    public WebElement productsButton;

    @FindBy(css = ".title.text-center")
    public WebElement allProductsPage;

    @FindBy(xpath = "//div[@class='productinfo text-center']")
    public List<WebElement> allProductsList;


}
