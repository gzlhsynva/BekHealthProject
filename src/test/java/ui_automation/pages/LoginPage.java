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

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//*[@class='el-message__content']")
    public WebElement accessDeniedError;

    @FindBy(xpath = "//*[@class='el-form-item__error']")
    public WebElement inputEmailAddress;

    @FindBy(xpath = "//*[@class='el-button login-button el-button--primary']")
    public WebElement signInBtn;



    public void login(){
        usernameTextBox.sendKeys(ConfigurationReader.getProperty("ui-config.properties","BekHealth.username"));
        passwordTextBox.sendKeys(ConfigurationReader.getProperty("ui-config.properties","BekHealth.password"));
        signInBtn.click();
    }

    public void userLogin(){
        usernameTextBox.sendKeys(ConfigurationReader.getProperty("ui-config.properties","BekHealthDev.username"));
        passwordTextBox.sendKeys(ConfigurationReader.getProperty("ui-config.properties","BekHealthDev.password"));
        signInBtn.click();
    }

}
