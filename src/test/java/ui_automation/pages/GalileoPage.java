package ui_automation.pages;

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

        @FindBy(xpath = "//*[@class='h-7 w-7 cursor-pointer text-[#91b6c5] fa-icon el-popover__reference']/*")
    public WebElement menuBtn;

        @FindBy(xpath = "//div[text()='Galileo']")
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

        @FindBy(xpath = "//*[text()='Custom Facet']")
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

        @FindBy(xpath = "(//input[@class='el-input__inner'])[16]")
    public WebElement parentFolderBtn;

        @FindBy(xpath = "(//span[@class='el-tree-node__expand-icon el-icon-caret-right'])[2]/..")
    public WebElement folderClick;

    @FindBy(xpath = "//span[text()='Morgan Smith sandbox']/..")
    public WebElement folderClick2;

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

          @FindBy(xpath = "(//i[@class='el-icon-arrow-right'])[43]")
    public WebElement bekTestingLibraryDropdown;

      @FindBy(xpath = "(//i[@class='el-icon-arrow-right'])[39]")
    public WebElement sandbox;

          @FindBy(xpath = "(//span[text()=' Delete '])[911]")
    public WebElement deleteBtn;

    @FindBy(xpath = "//div[@class='el-message-box__message']")
    public WebElement deleteTextConfirm;

      @FindBy(xpath = "//*[contains(text(),'Confirm')]")
    public WebElement deleteConfirm;

    @FindBy(xpath = "//input[@placeholder='Type to search trials and criteria']")
    public WebElement searchBtn;

    @FindBy(xpath = "//a[text()=' some cohort ']")
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

    @FindBy(xpath = "//span[text()='some folder']")
    public WebElement somefolderBtn;


    @FindBy(xpath = " (//i[@class='el-icon-arrow-right'])[33]")
    public WebElement folderDropdown;

    @FindBy(xpath = " (//i[@class='el-icon-arrow-right'])[34]")
    public WebElement folderDropdown2;

    @FindBy(xpath = " //span[text()='BEK Testing Library']")
    public WebElement BEKtestingBtn;

}
