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

   @FindBy(xpath = "//input[@placeholder='John Doe' or @type='type']")
    public WebElement candidateLookUpBtn;

    @FindBy(xpath = "//input[@placeholder='123456789' or @type='type']")
    public WebElement candidateLookUpBtnByPhone;

    @FindBy(xpath = "//a[@href='#/auto-recruiter/prescreen/UGF0aWVudDo2MDAwN2RkYzQ3OTkyMzFmYTM5MWM4NTU=']")
    public WebElement candidateNameVerification;

    @FindBy(xpath = "//*[@class='el-input__inner'][@placeholder='Select']")
    public WebElement candidateLookUpChange;

    @FindBy(xpath = "//span[text()='By Phone']")
    public WebElement candidateLookUpChangeToPhoneNum;

    @FindBy(xpath = "(//div[@class='cell'])[10]")
    public WebElement candidatePhoneNumVerification;

    @FindBy(xpath = "//div[@class='el-card__body']//tr[2]/td[1]//*//*")
    public WebElement depressionTrialNameBtn;

    @FindBy(xpath = "//span[contains(text(),'(See list)')]")
    public WebElement seeListBtn;

    @FindBy(xpath = "//span[text()='Filters']")
    public WebElement filtersBtn;

    @FindBy(xpath = "//input[@placeholder='Sort by Name']")
    public WebElement sortNameFilter;

    @FindBy(xpath = "(//ul[@class='el-scrollbar__view el-select-dropdown__list'])[11]//li[2]")
    public WebElement sortFilteroption2;

    @FindBy(xpath = "//input[@placeholder='Filter by Site Name']")
    public WebElement sortSiteFilter;

    @FindBy(xpath = "//input[@placeholder='Filter by Criteria']")
    public WebElement sortCriteriaFilter;

    @FindBy(xpath = "(//ul[@class='el-scrollbar__view el-select-dropdown__list'])[11]//li[1]")
    public WebElement sortFilteroption1;

    @FindBy(xpath = "(//i[@class='el-select__caret el-input__icon el-icon-arrow-up'])[10]")
    public WebElement sortPrimaryProviderFilter;

    @FindBy(xpath = "//div[@class='el-tabs__content']//td[2]/*/*/*/*")
    public WebElement tableName1;


    @FindBy(xpath = "//span[@class='el-table__empty-text']")
    public WebElement emptyTable;

        @FindBy(xpath = "(//i[@class='el-select__caret el-input__icon el-icon-arrow-up'])[11]")
    public WebElement filterByProvider;

        @FindBy(xpath = "(//ul[@class='el-scrollbar__view el-select-dropdown__list'])[11]//li[3]")
    public WebElement sortFilteroption3;

    //    @FindBy(xpath = "")
//    public WebElement ;

}
