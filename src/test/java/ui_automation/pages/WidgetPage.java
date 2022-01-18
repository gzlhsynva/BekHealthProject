package ui_automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_automation.utilities.Driver;

public class WidgetPage {

    WebDriver driver;

    public WidgetPage() {
        driver = Driver.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[text()='Galileo']")
    public WebElement galileoText;

    @FindBy(xpath = "//*[text()='Reporting']")
    public WebElement reportingWidget;

    @FindBy(xpath = "//div[text()='Auto Recruiter']")
    public WebElement autoRecruiterWidget;

    @FindBy(xpath = "//div[text()='Administration']")
    public WebElement administrationWidget;

    @FindBy(xpath = "//*[contains(text(),'Patient Attrition:')]")
    public WebElement reportingText;

        @FindBy(xpath = "//h1[text()='Trial Portfolio']")
    public WebElement autoRecruiterText;

        @FindBy(xpath = "//span[text()='User Management']")
    public WebElement administrationText;

    //    @FindBy(xpath = "")
//    public WebElement ;

    //    @FindBy(xpath = "")
//    public WebElement ;

    //    @FindBy(xpath = "")
//    public WebElement ;

}
