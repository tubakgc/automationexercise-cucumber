package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class T03LoginIncorrectUserPage {
    public T03LoginIncorrectUserPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
    public WebElement verifyIncorrentVisible;


}
