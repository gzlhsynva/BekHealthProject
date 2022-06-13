package ui_automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_automation.utilities.Driver;

public class AdministrationPage {

    WebDriver driver;

    public AdministrationPage() {
        driver = Driver.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }




    @FindBy(xpath = "(//*[@class='menu-item'])[2]")
    public WebElement administrationTabBtn;

    @FindBy(xpath = "//span[text()='User Management']")
    public WebElement administrationPageText;

    @FindBy(xpath = "//span[contains(text(),'ADD USER +')]")
    public WebElement addUserBtn;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailInput;

    @FindBy(xpath = "//span[text()='User']")
    public WebElement roleChangeToUser;

    @FindBy(xpath = "(//span[@class='el-checkbox__inner'])[1]")
    public WebElement checkBox1;

    @FindBy(xpath = "(//span[@class='el-checkbox__inner'])[2]")
    public WebElement checkBox2;

    @FindBy(xpath = "(//span[@class='el-checkbox__inner'])[3]")
    public WebElement checkBox3;

    @FindBy(xpath = "(//span[@class='el-checkbox__inner'])[4]")
    public WebElement checkBox4;

    @FindBy(xpath = "(//span[@class='el-checkbox__inner'])[5]")
    public WebElement checkBox5;

    @FindBy(xpath = "(//span[@class='el-checkbox__inner'])[8]")
    public WebElement checkBox8;

    @FindBy(xpath = "(//span[@class='el-checkbox__inner'])[11]")
    public WebElement checkBox11;

    @FindBy(xpath = "(//span[@class='el-checkbox__inner'])[12]")
    public WebElement checkBox12;

    @FindBy(xpath = "//span[text()='Submit']")
    public WebElement submitBtn;

    @FindBy(xpath = "//span[text()=' Submit ']")
    public WebElement submitBtn2;

    @FindBy(xpath = "(//span[@class='el-radio__inner'])[3]")
    public WebElement PHIaccessChanger;

    @FindBy(xpath = "(//span[text()='Delete'])[66]")
    public WebElement deleteUser;

    @FindBy(xpath = "//span[contains(text(),'Confirm')]")
    public WebElement confirmDelete;

    @FindBy(xpath = "//div[@class='el-message-box__message']")
    public WebElement deleteTextConfirm;

    @FindBy(xpath = "//span[text()='Site Registration']")
    public WebElement siteRegistrationBtn;

    @FindBy(xpath = "//span[contains(text(),'New Site')]")
    public WebElement addNewSite;

    @FindBy(xpath = "(//input[@class='el-input__inner'])[4]")
    public WebElement siteName;

    @FindBy(xpath = "(//input[@class='el-input__inner'])[5]")
    public WebElement siteID;

    @FindBy(xpath = "(//input[@class='el-input__inner'])[6]")
    public WebElement addressLine1;

    @FindBy(xpath = "(//input[@class='el-input__inner'])[7]")
    public WebElement addressLine2;

    @FindBy(xpath = "(//input[@class='el-input__inner'])[8]")
    public WebElement city;

    @FindBy(xpath = "(//input[@class='el-input__inner'])[9]")
    public WebElement zipcode;

    @FindBy(xpath = "(//input[@class='el-input__inner'])[10]")
    public WebElement state;

    @FindBy(xpath = "(//input[@class='el-input__inner'])[11]")
    public WebElement country;

    @FindBy(xpath = "(//input[@class='el-input__inner'])[12]")
    public WebElement firstName;

    @FindBy(xpath = "(//input[@class='el-input__inner'])[13]")
    public WebElement lastName;

    @FindBy(xpath = "(//input[@class='el-input__inner'])[14]")
    public WebElement email;

    @FindBy(xpath = "//input[@placeholder='Phone number *']")
    public WebElement phoneNumber;

    @FindBy(xpath = "(//input[@class='el-input__inner'])[15]")
    public WebElement extension;

    @FindBy(xpath = "(//*[@class='el-select__caret el-input__icon el-icon-arrow-up'])[3]")
    public WebElement selectUsers;

    @FindBy(xpath = "(//li[@class='el-select-dropdown__item'])[26]")
    public WebElement userSelect;

    @FindBy(xpath = "(//li[@class='el-select-dropdown__item'])[27]")
    public WebElement userSelect32;

    @FindBy(xpath = "(//li[@class='el-select-dropdown__item'])[28]")
    public WebElement userSelect3;

    @FindBy(xpath = "(//li[@class='el-select-dropdown__item'])[29]")
    public WebElement userSelect4;

    @FindBy(xpath = "//span[contains(text(),'ghuseynova')]")
    public WebElement userSelect2;

    @FindBy(xpath = "//span[contains(text(),'amordasov')]")
    public WebElement userSelect23;

    @FindBy(xpath = "//span[contains(text(),'bstrahan')]")
    public WebElement userSelect24;

    @FindBy(xpath = "(//input[@class='el-select__input'])[1]")
    public WebElement getOutOfDropdown;


    @FindBy(xpath = "(//span[contains(text(),'Delete')])[5]")
    public WebElement deleteBtn2;

    @FindBy(xpath = "//span[text()='Trial Groups']")
    public WebElement trialGroups;

    @FindBy(xpath = "//span[contains(text(),'Add Group +')]")
    public WebElement addGroup;

    @FindBy(xpath = "(//input[@class='el-input__inner'])[4]")
    public WebElement name2;

    @FindBy(xpath = "(//input[@class='el-input__inner'])[5]")
    public WebElement description;

    @FindBy(xpath = "(//i[@class='el-select__caret el-input__icon el-icon-arrow-up'])[3]")
    public WebElement usersGroups;

    @FindBy(xpath = "(//span[text()='Delete'])[11]")
    public WebElement delete3;

//    @FindBy(xpath = "//span[contains(text(),'Submit')]")
//    public WebElement submitBtn2;
//
//    @FindBy(xpath = "//span[contains(text(),'Submit')]")
//    public WebElement submitBtn2;



}
