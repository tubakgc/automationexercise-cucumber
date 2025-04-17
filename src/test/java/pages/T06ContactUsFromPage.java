package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class T06ContactUsFromPage {
    public T06ContactUsFromPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(css = ".fa.fa-envelope")
    public WebElement contactUs;

    @FindBy(xpath = "//*[.='Get In Touch']")
    public WebElement getInTouchTitle;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameBoxContact;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailBoxContact;

    @FindBy(xpath = "//input[@name='subject']")
    public WebElement subjectBoxContact;

    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement messageBoxContact;

    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement uploadFile;

    @FindBy(css = ".btn.btn-primary.pull-left.submit_form")
    public WebElement submitContact;

    @FindBy(css = ".status.alert.alert-success")
    public WebElement successMessage;

    @FindBy(css = ".btn.btn-success")
    public WebElement homeButtonContact;

    @FindBy(css = ".fa.fa-list")
    public WebElement testCasesButton;
    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement testCasesTitle;
}
