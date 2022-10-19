package ui_automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_automation.utilities.Driver;

public class SelectYourReportPage {
    WebDriver driver;

    public SelectYourReportPage() {
        driver = Driver.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Operational Performance Report']")
    public WebElement operationalPerformanceDropdown;

    @FindBy(xpath = "//h1[contains(text(),'Operational Performance Report')]")
    public WebElement selectOperationalPerformanceReportText;

    @FindBy(xpath = "//span[text()='User Performance Report']")
    public WebElement userPerformanceReportDropdown;

    @FindBy(xpath = "//h1[contains(text(),'User Performance Report')]")
    public WebElement selectUserPerformanceReportText;

        @FindBy(xpath = "//h3[@class='chart__header']")
    public WebElement operationalChartHeader;

    @FindBy(xpath = "//h3[@class='ignore-reason-card__header']")
    public WebElement operationalChartHeader2;

        @FindBy(xpath = "//h3[@class='chart__header'][text()='Conversion Success (Percent Enrolled/Matched)']")
    public WebElement operationalPerformanceChartHeader;

    @FindBy(xpath = "//h3[@class='chart__header'][text()='Reasons for Candidates Ignored']")
    public WebElement operationalPerformanceChartHeader2;

    @FindBy(xpath = "//h4[@class='exhaustion-time-kpi__header'][text()=' Exhaustion Time of 5 Top and Bottom Trials ']")
    public WebElement userPerformanceBoxHeader;

    @FindBy(xpath = "//p[@class='statistics-report__header text-base'][text()='Average days in pending review']")
    public WebElement userPerformanceBoxHeader2;

    @FindBy(xpath = "//div[@class='expand-icon']/*")
    public WebElement expandBtn;

    @FindBy(xpath = "//i[@class='el-dialog__close el-icon el-icon-close']")
    public WebElement closeGraphBtn;

    @FindBy(xpath = "(//div[@class='el-select'])[1]")
    public WebElement dropdownSelectTrial;

    @FindBy(xpath = "(//span[text()='NASH'])[2]")
    public WebElement dropdownSelect;

    @FindBy(xpath = "(//h3[@class='chart__header'])")
    public WebElement chartHeader;

    @FindBy(xpath = "(//h3[@class='chart__header'])[2]")
    public WebElement chartHeader2;

    @FindBy(xpath = "(//h3[@class='chart__header'])[3]")
    public WebElement chartHeader3;

    @FindBy(xpath = "(//p[@class='statistics-report__header text-base'])[1]")
    public WebElement statisticHeader;

    @FindBy(xpath = "(//p[@class='statistics-report__header text-base'])[2]")
    public WebElement statisticHeader2;

    @FindBy(xpath = "(//p[@class='statistics-report__header text-base'])[3]")
    public WebElement statisticHeader3;

    @FindBy(xpath = "(//button[@class='el-button trial-dropdown__button el-button--primary el-dropdown-selfdefine     '])")
    public WebElement dropdown2;

    @FindBy(xpath = "(//*[text()=' Breast Cancer '])")
    public WebElement dropdownOption;

    @FindBy(xpath = "(//*[text()=' INCEPTION '])")
    public WebElement dropdownOption2;

    @FindBy(xpath = "(//button[@class='el-button trial-dropdown__button el-button--primary el-dropdown-selfdefine'])")
    public WebElement dropdown3;

//    @FindBy(xpath = "")
//    public WebElement ;
//
//    @FindBy(xpath = "")
//    public WebElement ;

}
