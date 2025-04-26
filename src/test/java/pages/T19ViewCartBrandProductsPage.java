package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class T19ViewCartBrandProductsPage extends BasePage {

    @FindBy(xpath = " //h2[normalize-space()='Brands']")
    public WebElement brandsProductsVerify;

    @FindBy(xpath = "  //a[@href='/brand_products/Babyhug']")
    public WebElement babyhugButton;

    @FindBy(xpath = "//li[@class='active']")
    public WebElement babyhugVerifyText;

    @FindBy(xpath = "//a[@href='/brand_products/Mast & Harbour']")
    public WebElement mastHarbourButton;

    @FindBy(xpath = "//*[@class='active']")
    public WebElement activePage;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement mastHarbourProductsVerifyText;

}