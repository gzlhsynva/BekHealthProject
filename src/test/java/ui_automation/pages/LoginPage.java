package ui_automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_automation.utilities.ConfigurationReader;
import ui_automation.utilities.Driver;

public class LoginPage {
    WebDriver driver;

    public LoginPage() {
        driver = Driver.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@type='text']")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//*[text()='Continue']")
    public WebElement continueBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//*[@class='el-message__content']")
    public WebElement accessDeniedError;

    @FindBy(xpath = "//*[@class='el-form-item__error']")
    public WebElement inputEmailAddress;

//    @FindBy(xpath = "//*[@class='el-button login-button el-button--primary']")
//    public WebElement signInBtn;

    @FindBy(xpath = "//button[text()='Accept']")
    public WebElement acceptBtn;

//    @FindBy(xpath = "//input[@id='captcha']")
//    public WebElement captcha;



    public void login() throws InterruptedException {

        usernameTextBox.sendKeys(ConfigurationReader.getProperty("ui-config.properties","BekHealth.username"));
        Thread.sleep(9000);
        continueBox.click();
        passwordTextBox.sendKeys(ConfigurationReader.getProperty("ui-config.properties","BekHealth.password"));
        continueBox.click();
    }

    public void userLogin(){
        usernameTextBox.sendKeys(ConfigurationReader.getProperty("ui-config.properties","BekHealthDev.username"));
        passwordTextBox.sendKeys(ConfigurationReader.getProperty("ui-config.properties","BekHealthDev.password"));
        continueBox.click();
    }

}
