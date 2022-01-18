package ui_automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_automation.utilities.Driver;

public class DomainPage {
    WebDriver driver;

    public DomainPage() {
        driver = Driver.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[contains(text(),'Patient ID')]")
    public WebElement demographicsTab1;

    @FindBy(xpath = "//*[contains(text(),'Age')]")
    public WebElement demographicsTab2;

    @FindBy(xpath = "//*[contains(text(),'Sex')]")
    public WebElement demographicsTab3;

    @FindBy(xpath = "//*[contains(text(),'Race')]")
    public WebElement demographicsTab4;

    @FindBy(xpath = "//*[contains(text(),'Ethnicity')]")
    public WebElement demographicsTab5;

    @FindBy(xpath = "//*[contains(text(),'Marital Status')]")
    public WebElement demographicsTab6;

    @FindBy(xpath = "//*[contains(text(),'Patient Record Status')]")
    public WebElement demographicsTab7;

    @FindBy(xpath = "//*[contains(text(),'MMSE')]")
    public WebElement customFacetTab1;

    @FindBy(xpath = "//*[contains(text(),'MOCA')]")
    public WebElement customFacetTab2;

    @FindBy(xpath = "//*[contains(text(),'MADRS')]")
    public WebElement customFacetTab3;

    @FindBy(xpath = "(//div[contains(text(),'PATIENT REPORTED OUTCOME MEASURES')])[1]")
    public WebElement observationsVitalTab1;

    @FindBy(xpath = "(//div[contains(text(),'VITAL SIGNS AND OBSERVATIONS')])[1]")
    public WebElement observationsVitalTab2;

    @FindBy(xpath = "//*[text()='Observations & Vital Signs']")
    public WebElement observationsVitalDropdown;

    @FindBy(xpath = "//*[text()='Diagnosis']")
    public WebElement diagnosisDropdown;

    @FindBy(xpath = "//*[text()='Encounters']")
    public WebElement encountersDropdown;

    @FindBy(xpath = "//*[text()='Labs']")
    public WebElement labsDropdown;

    @FindBy(xpath = "//*[text()='Medications']")
    public WebElement medicationsDropdown;

    @FindBy(xpath = "//*[text()='Procedures']")
    public WebElement proceduresDropdown;

    @FindBy(xpath = "(//*[contains(text(),'Infectious and parasitic diseases [ICD10: A00-B99]')])[2]")
    public WebElement diagnosisTab1;

    @FindBy(xpath = "(//*[contains(text(),'Diseases of the respiratory system [ICD10: J00-J99]')])[2]")
    public WebElement diagnosisTab2;

    @FindBy(xpath = "(//input[@class='el-input__inner'])[2]")
    public WebElement diagnosisDropdown2;

    @FindBy(xpath = "//*[text()='CCS']")
    public WebElement diagnosisDropdown2Button;

    @FindBy(xpath = "(//*[contains(text(),'Diseases of the Blood and Blood Forming Organs [CCS: BLD]')])[2]")
    public WebElement diagnosisDropdown2ButtonTab1;

    @FindBy(xpath = "(//*[contains(text(),'Diseases of the Circulatory System [CCS: CIR]')])[2]")
    public WebElement diagnosisDropdown2ButtonTab2;

    @FindBy(xpath = "(//*[contains(text(),'Any Specialty')])[3]")
    public WebElement encountersTab1;

    @FindBy(xpath = "(//*[contains(text(),'Unknown')])[3]")
    public WebElement encountersTab2;

    @FindBy(xpath = "(//*[contains(text(),'ALANINE AMINOTRANSFERASE – ALT (IU/L)')])[4]")
    public WebElement labsTab1;

    @FindBy(xpath = "(//*[contains(text(),'ALBUMIN (G/DL)')])[4]")
    public WebElement labsTab2;



    @FindBy(xpath = "(//*[contains(text(),'ALIMENTARY TRACT AND METABOLISM [ATC: A]')])[5]")
    public WebElement medicationsTab1;

    @FindBy(xpath = "(//*[contains(text(),'BLOOD AND BLOOD FORMING ORGANS [ATC: B]')])[5]")
    public WebElement medicationsTab2;



    @FindBy(xpath = "(//*[contains(text(),'HCPCS Level 1 Codes [HCPC: Level 1]')])[6]")
    public WebElement proceduresTab1;

    @FindBy(xpath = "(//*[contains(text(), 'HCPCS Level 2 Codes [HCPC: Level 2]')])[6]")
    public WebElement proceduresTab2;






}
