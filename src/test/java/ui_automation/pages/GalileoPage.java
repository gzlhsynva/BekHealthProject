package ui_automation.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_automation.utilities.Driver;

public class GalileoPage {
    WebDriver driver;

    public GalileoPage() {
        driver = Driver.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }

        @FindBy(xpath = "//*[@class='menu-icon fa-icon el-popover__reference']")
    public WebElement menuBtn;

        @FindBy(xpath = "(//*[@class='menu-item'])[4]")
    public WebElement  galileoBtn;

        @FindBy(xpath = "//input[@placeholder='Select']")
    public WebElement trialCriteriaOptionsBtn;

        @FindBy(xpath = "//*[text()='Demographics']")
    public WebElement demographicsBtn;

        @FindBy(xpath = "(//*[contains(text(),'Add')])[1]")
    public WebElement addPatientID;

        @FindBy(xpath = "(//*[contains(text(),'Add')])[2]")
    public WebElement addAge;

    @FindBy(xpath = "(//*[contains(text(),'Add')])[3]")
    public WebElement addSex;

        @FindBy(xpath = "//*[text()='Custom facet']")
    public WebElement customfacetBtn;

        @FindBy(xpath = "(//*[contains(text(),'Add')])[8]")
    public WebElement addMmse;

        @FindBy(xpath = "(//*[contains(text(),'Add')])[9]")
    public WebElement addMoca;

        @FindBy(xpath = "//*[contains(text(),'Save Trial Criteria')]")
    public WebElement saveBtn;

        @FindBy(xpath = "(//*[@class='el-input__inner'])[14]")
    public WebElement titleBtn;

        @FindBy(xpath = "(//*[@class='el-input__inner'])[15]")
    public WebElement descriptionBtn;

        @FindBy(xpath = "(//*[@class='el-input__inner'])[16]")
    public WebElement parentFolderBtn;

        @FindBy(xpath = "//*[contains(text(),'BEK Testing Library')]")
    public WebElement bekTestingOption;

        @FindBy(xpath = "//*[text()=' Submit ']")
    public WebElement submitBtn;

      @FindBy(xpath = "(//input[@class='el-input__inner'])[4]")
    public WebElement parentIdTextBox;

      @FindBy(xpath = "(//input[@class='el-input__inner'])[6]")
    public WebElement ageTextBox1;

          @FindBy(xpath = "(//input[@class='el-input__inner'])[7]")
    public WebElement ageTextBox2;

      @FindBy(xpath = "(//input[@class='el-input__inner'])[9]")
    public WebElement mmseTextBox1;

          @FindBy(xpath = "(//input[@class='el-input__inner'])[10]")
    public WebElement mmseTextBox2;

      @FindBy(xpath = "(//input[@class='el-input__inner'])[12]")
    public WebElement mocaTextBox1;

          @FindBy(xpath = "(//input[@class='el-input__inner'])[13]")
    public WebElement mocaTextBox2;

      @FindBy(xpath = "(//*[contains(text(),'Saved Trials and Criteria')])[2]")
    public WebElement savedTrialsAndCriteriaBtn;

          @FindBy(xpath = "//*[contains(text(),'BEK Testing Library')]/..//*[@class='el-icon-arrow-right']")
    public WebElement bekTestingLibraryDropdown;

      @FindBy(xpath = "//*[text()='QA testing']")
    public WebElement textValidation;

          @FindBy(xpath = "(//span[text()=' Delete '])[487]")
    public WebElement deleteBtn;

    @FindBy(xpath = "//div[@class='el-message-box__message']")
    public WebElement deleteTextConfirm;

      @FindBy(xpath = "//*[contains(text(),'Confirm')]")
    public WebElement deleteConfirm;

    @FindBy(xpath = "//input[@placeholder='Type to search trials and criteria']")
    public WebElement searchBtn;

    @FindBy(xpath = "//a[text()=' QA test ']")
    public WebElement searchedTextVerification;

    @FindBy(xpath = "(//*[contains(text(),'Add')])[4]")
    public WebElement trialAdd;

    @FindBy(xpath = "//*[contains(text(),'Show Patients in Trial')]")
    public WebElement showPatientsInTrialBtn;

    @FindBy(xpath = "//div[contains(@class,'el-table el-table')]//th[2]")
    public WebElement tableTitle1;

    @FindBy(xpath = "//div[contains(@class,'el-table el-table')]//th[3]")
    public WebElement tableTitle2;

    @FindBy(xpath = "//div[contains(@class,'el-table el-table')]//th[4]")
    public WebElement tableTitle3;

    @FindBy(xpath = "//span[contains(text(),'Back')]")
    public WebElement backBtn;

    @FindBy(xpath = "//span[(text()='Galileo')]")
    public WebElement galileoTitle;
//
//    @FindBy(xpath = "")
//    public WebElement ;

}
