package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class T21AddReviewonProductPage extends BasePage{
    @FindBy(xpath = "  //*[contains(text(),'Write Your Review')]")
    public WebElement viewProductVerify;

    @FindBy(id = "name")
    public WebElement nameTextBox;

    @FindBy(id = "email")
    public WebElement emailTextBox;

    @FindBy(id = "review")
    public WebElement reviewTextBox;

    @FindBy(xpath = " //div[@class='alert-success alert']//span")
    public WebElement verifyReviewMessage;


    @FindBy(xpath = "//button[@id='button-review']")
    public WebElement submitReview;
}
