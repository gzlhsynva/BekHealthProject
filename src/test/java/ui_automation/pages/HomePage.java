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

    @FindBy(xpath = "//*[@class='shadow-lg mb-24']")
    public WebElement table;

    @FindBy(xpath = "//*[@class='flex-grow font-bold text-2xl text-blue-dark']")
    public WebElement tableText;

    @FindBy(xpath = "//input[@placeholder='John Doe' or @type='type']")
    public WebElement candidateLookUpBtn;

    @FindBy(xpath = "//input[@placeholder='123456789' or @type='type']")
    public WebElement candidateLookUpBtnByPhone;

    @FindBy(xpath = "//a[@class='text-blue-lighter2 hover:text-blue-lightest']")
    public WebElement candidateNameVerification;

    @FindBy(xpath = "//*[@class='el-input__inner'][@placeholder='Select']")
    public WebElement candidateLookUpChange;

    @FindBy(xpath = "//span[text()='By Phone']")
    public WebElement candidateLookUpChangeToPhoneNum;

    @FindBy(xpath = "(//div[@class='cell'])[10]")
    public WebElement candidatePhoneNumVerification;

    @FindBy(xpath = "//a[text()=' Early Alzheimers Disease ']")
    public WebElement alzheimersTrialNameBtn;

    @FindBy(xpath = "//span[contains(text(),'Candidates List')]")
    public WebElement seeListBtn;

    @FindBy(xpath = "//span[text()='Filters']")
    public WebElement filtersBtn;

    @FindBy(xpath = "//input[@placeholder='Sort by Name']")
    public WebElement sortNameFilter;

    @FindBy(xpath = "//span[text()='First Name A-Z']")
    public WebElement sortFilteroption2;

    @FindBy(xpath = "//input[@placeholder='Filter by Site Name']")
    public WebElement sortSiteFilter;

    @FindBy(xpath = "//input[@placeholder='Filter by Criteria']")
    public WebElement sortCriteriaFilter;

    @FindBy(xpath = "//span[text()='All Tiers']")
    public WebElement sortFilteroption1;

    @FindBy(xpath = "//li[@class='el-select-dropdown__item aqa-select-primary-provider-option']/span[text()='All']")
    public WebElement sortFilteroption4;

    @FindBy(xpath = "(//input[@class='el-select__input is-mini'])[1]")
    public WebElement sortPrimaryProviderFilter;

    @FindBy(xpath = "//div[text()='Name']")
    public WebElement tableName1;


    @FindBy(xpath = "//span[@class='el-table__empty-text']")
    public WebElement emptyTable;

    @FindBy(xpath = "(//input[@class='el-select__input is-mini'])[2]")
    public WebElement filterByProvider;

    @FindBy(xpath = "//li[@class='el-select-dropdown__item aqa-select-provider-option']/span[text()='All']")
    public WebElement sortFilteroption3;

    @FindBy(xpath = "//h4[text()='Search by Name']")
    public WebElement clickOff;

    @FindBy(xpath = "//button[@class='fixed left-0 top-[269px] !py-3 !px-4 text-sm text-center py-2.5 px-5 bg-blue-darker text-white border-azure-light rounded-tr-md rounded-br-md']")
    public WebElement filtersBtnHomepage;

    @FindBy(xpath = "//input[@id=\"disease area-alzheimer's disease\"]")
    public WebElement alzheimerCheckBox;

    @FindBy(xpath = "//input[@id=\"disease area-paroxysmal nocturnal hemoglobinuria\"]")
    public WebElement paroxysmalCheckBox;

    @FindBy(xpath = "//input[@id='disease area-mdd']")
    public WebElement mddCheckBox;

    @FindBy(xpath = "//input[@id='disease area-atrial fibrillation']")
    public WebElement atrialCheckBox;

    @FindBy(xpath = "//input[@id='disease area-breast cancer']")
    public WebElement breastcanserCheckBox;

    @FindBy(xpath = "//input[@id='disease area-nash']")
    public WebElement nashCheckBox;

    @FindBy(xpath = "//label[@class='flex-grow cursor-pointer'][text()=' NSCLC '][@for='diagnosis-nsclc']")
    public WebElement nsclscheckBox;

    @FindBy(xpath = "//a[@href='/trial-portfolio/trial/VHJpYWw6NjA4OTkzZTlmMjZkYjk5MzA3NWIxYTIz']")
    public WebElement alzaimersDiseaseText;

    @FindBy(xpath = "//button[@class='w-32 text-sm text-center py-1 px-1 border bg-white text-gray-dark border-gray-lighter font-semibold rounded-md']")
    public WebElement resetBTN;

    @FindBy(xpath = "//button[@class='h-7 w-7 text-gray-darker text-2xl flex justify-center items-center']")
    public WebElement exitBTN;


}


