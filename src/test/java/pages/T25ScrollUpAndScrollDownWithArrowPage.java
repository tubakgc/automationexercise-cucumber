package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class T25ScrollUpAndScrollDownWithArrowPage extends BasePage{
    @FindBy(xpath = "//a[@id=\"scrollUp\"]")
    public WebElement scrollUpButton;

    @FindBy(xpath = "//div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]")
    public WebElement scrollUpAutamationVerfiyText;
}
