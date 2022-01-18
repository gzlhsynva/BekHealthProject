package ui_automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_automation.utilities.Driver;

public class HomePage {
    WebDriver driver;

    public HomePage() {
        driver = Driver.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='el-card__body']")
    public WebElement table;

    @FindBy(xpath = "//*[@class='card-title']")
    public WebElement tableText;

   @FindBy(xpath = "//input[@placeholder='Patient Number or Name']")
    public WebElement candidateLookUpBtn;

    @FindBy(xpath = "//div[@class='el-card__body']//tr[1]//td[1]")
    public WebElement candidateNameVerification;


    @FindBy(xpath = "//*[@class='el-input__inner'][@placeholder='Select']")
    public WebElement candidateLookUpChange;

    @FindBy(xpath = "//span[text()='By Phone']")
    public WebElement candidateLookUpChangeToPhoneNum;

    @FindBy(xpath = "//div[@class='el-card__body']//tr[1]//td[4]")
    public WebElement candidatePhoneNumVerification;



}
