package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class T18ViewCategoryProductsPage extends BasePage{
    @FindBy(xpath = " //div[@class='panel-group category-products']")
    public WebElement categoryGroup;

    @FindBy(xpath = " //a[@href='#Women']")
    public WebElement womenCategory;

    @FindBy(xpath = "(//div[@class='panel-body']/ul/li/a)[1]")
    public WebElement dress;

    @FindBy(xpath = " //a[@href='#Men']")
    public WebElement menCategory;

    @FindBy(xpath = " //a[normalize-space()='Jeans']")
    public WebElement jeansButton;

    @FindBy(xpath = " //h2[@class='title text-center']")
    public WebElement categoryProductsVerify;

    @FindBy(xpath = " //h2[@class='title text-center']")
    public WebElement categoryTitleVerify;



}
