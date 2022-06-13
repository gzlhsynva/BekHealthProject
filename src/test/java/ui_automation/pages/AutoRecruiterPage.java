package ui_automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_automation.utilities.Driver;

public class AutoRecruiterPage {
    WebDriver driver;

    public AutoRecruiterPage() {
        driver = Driver.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//button[@class='el-button manage-btn el-button--primary is-plain is-round']")
    public WebElement trialManagementBtn;

    @FindBy(xpath = "//span[contains(text(),'Add new trial')]")
    public WebElement addNewTrialBtn;

    @FindBy(xpath = "(//input[@class='el-input__inner'])[4]")
    public WebElement trialName;

    @FindBy(xpath = "(//input[@class='el-input__inner'])[5]")
    public WebElement fullName;

    @FindBy(xpath = "(//input[@class='el-input__inner'])[6]")
    public WebElement trialPhase;

    @FindBy(xpath = "//*[text()='2']")
    public WebElement trialPhaseNum2;

    @FindBy(xpath = "(//input[@class='el-input__inner'])[8]")
    public WebElement description;

    @FindBy(xpath = "(//input[@class='el-input__inner'])[9]")
    public WebElement disease;

    @FindBy(xpath = "(//input[@class='el-input__inner'])[10]")
    public WebElement diagnosis;

    @FindBy(xpath = "(//input[@class='el-input__inner'])[11]")
    public WebElement clinicalTrials;

    @FindBy(xpath = "(//input[@class='el-input__inner'])[12]")
    public WebElement lineOfTherapy;

    @FindBy(xpath = "(//input[@class='el-input__inner'])[14]")
    public WebElement RBSStatusBtn;

    @FindBy(xpath = "//span[text()='IRB Status Approved']")
    public WebElement RBSStatusBtnSelect;

    @FindBy(xpath = "//i[@class='el-icon-circle-plus']")
    public WebElement criteriaBtn;

    @FindBy(xpath = "(//input[@class='el-input__inner'])[15]")
    public WebElement criteriaLabel;

    @FindBy(xpath = "(//i[@class='el-icon-circle-plus'])[2]")
    public WebElement inclusionOptionBtn;

    @FindBy(xpath = "(//i[@class='el-icon-circle-plus'])[3]")
    public WebElement exclusionOptionBtn;

    @FindBy(xpath = "(//input[@class='el-input__inner'])[16]")
    public WebElement inclusionOptionText;

    @FindBy(xpath = "(//input[@class='el-input__inner'])[17]")
    public WebElement exclusionOptionText;

    @FindBy(xpath = "(//input[@class='el-input__inner'])[18]")
    public WebElement pstQueryBtn;

    @FindBy(xpath = "(//input[@class='el-input__inner'])[19]")
    public WebElement nullPSTQueryBtn;

    @FindBy(xpath = "(//input[@placeholder='Select'][@class='el-input__inner'])[3]")
    public WebElement trialType;

    @FindBy(xpath = "//span[text()='Industry']")
    public WebElement industyInTrialType;

    @FindBy(xpath = "//span[text()='Submit']")
    public WebElement submitBtn;

    @FindBy(xpath = "(//button[@class='el-button el-button--danger el-button--mini']//span[text()='Delete'])[7]")
    public WebElement deleteBtn;

    @FindBy(xpath = "//span[contains(text(),'OK')]")
    public WebElement okDeleteBtn;

    @FindBy(xpath = "//span[@class='link__text'][text()='Auto Recruiter']")
    public WebElement autoRecruiterFromNavigationbar;

        @FindBy(xpath = "//div[@class='el-card__body']")
    public WebElement autoRecruiterTable;

        @FindBy(xpath = "//div[text()='Name']")
    public WebElement nameCategory;

    @FindBy(xpath = "//div[text()='Provider']")
    public WebElement providerCategory;

    @FindBy(xpath = "//div[text()='Trial']")
    public WebElement trialCategory;

    @FindBy(xpath = "//span[text()='Inactive patient list']")
    public WebElement inactivePatientListBtn;

    @FindBy(xpath = "//h1[text()='Inactive Patients']")
    public WebElement inactivePatientsText;

    @FindBy(xpath = "//div[@class='el-card__body']//tr[5]//td[2]")
    public WebElement patientFromTable;

    @FindBy(xpath = "//div[@class='title']")
    public WebElement pageTitleVerification;

    @FindBy(xpath = "//div[@class='el-card__body']//tr[5]//td[3]/*/*")
    public WebElement patientFromTableProvider;

    @FindBy(xpath = "(//div[@class='cell'])[20]")
    public WebElement patientProviderFromDetails;

    @FindBy(xpath = "//*[@class='el-switch__core']")
    public WebElement patientStatusChangeBtn;

    @FindBy(xpath = "//*[text()='Active']")
    public WebElement activeText;

    @FindBy(xpath = "//*[contains(text(),'OK')]")
    public WebElement confirmSwitch;

    @FindBy(xpath = "//*[text()='Inactive']")
    public WebElement inactiveText;

    @FindBy(xpath = "(//input[@class='el-input__inner'][@type='text'])[13]")
    public WebElement calendar;

    @FindBy(xpath = "//span[contains(text(),'15')]")
    public WebElement calendarDaySelect;

    @FindBy(xpath = " (//*[text()=' BEK Testing Library '])[2]")
    public WebElement pstQueryOptionSelect1;

    @FindBy(xpath = "//span[text()= ' Active in past 4 years ']")
    public WebElement pstQueryOptionSelect2;

    @FindBy(xpath = "//li[@class='el-select-dropdown__item hover']")
    public WebElement nullPstQueryOptionSelect2;

    @FindBy(xpath = "(//b[text()= ' BEKHealth - Internal Training '])[2]")
    public WebElement nullPstQueryOptionSelect1;

    @FindBy(xpath = "//div[@class='el-message el-message--error']")
    public WebElement errorMessage;






}
