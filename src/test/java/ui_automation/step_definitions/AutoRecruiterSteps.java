package ui_automation.step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import ui_automation.pages.AutoRecruiterPage;
import ui_automation.pages.GalileoPage;
import ui_automation.utilities.Driver;

public class AutoRecruiterSteps {

    AutoRecruiterPage autoRecruiterPage = new AutoRecruiterPage();
    GalileoPage galileoPage = new GalileoPage();


    @Then("user adds a new trial and verifies it")
    public void user_adds_a_new_trial_and_verifies_it() throws InterruptedException {
        String text = "QA testing";
        autoRecruiterPage.trialManagementBtn.click();
        autoRecruiterPage.addNewTrialBtn.click();
        autoRecruiterPage.trialName.sendKeys(text);
        Thread.sleep(1000);
        autoRecruiterPage.fullName.sendKeys(text);
        Thread.sleep(1000);
        autoRecruiterPage.trialPhase.click();
        Thread.sleep(1000);
        autoRecruiterPage.trialPhaseNum2.click();
        Thread.sleep(1000);
        autoRecruiterPage.trialType.click();
        Thread.sleep(1000);
        autoRecruiterPage.industyInTrialType.click();
        Thread.sleep(1000);
        autoRecruiterPage.description.sendKeys(text);
        Thread.sleep(1000);
        autoRecruiterPage.disease.sendKeys(text);
        Thread.sleep(1000);
        autoRecruiterPage.diagnosis.sendKeys(text);
        Thread.sleep(1000);
        autoRecruiterPage.clinicalTrials.sendKeys(text);
        Thread.sleep(1000);
        autoRecruiterPage.lineOfTherapy.sendKeys(text);
        Thread.sleep(1000);
        autoRecruiterPage.criteriaBtn.click();
        Thread.sleep(1000);
        autoRecruiterPage.criteriaLabel.sendKeys(text);
        Thread.sleep(1000);
        autoRecruiterPage.inclusionOptionBtn.click();
        Thread.sleep(1000);
        autoRecruiterPage.inclusionOptionText.sendKeys(text);
        Thread.sleep(1000);
        autoRecruiterPage.exclusionOptionBtn.click();
        Thread.sleep(1000);
        autoRecruiterPage.exclusionOptionText.sendKeys(text);
        Thread.sleep(1000);
        autoRecruiterPage.pstQueryBtn.sendKeys(text);
        Thread.sleep(1000);
        autoRecruiterPage.nullPSTQueryBtn.sendKeys(text);
        Thread.sleep(1000);
        autoRecruiterPage.submitBtn.click();

    }

    @Then("user deletes the trial")
    public void user_deletes_the_trial() throws InterruptedException {
        String text = "QA testing";
        Thread.sleep(2000);
        autoRecruiterPage.deleteBtn.click();
        Thread.sleep(1000);
        String deleteTextMessage = galileoPage.deleteTextConfirm.getText();
        Assert.assertTrue(deleteTextMessage.contains(text));
        Thread.sleep(1000);
        autoRecruiterPage.okDeleteBtn.click();
        Thread.sleep(2000);
    }

    @When("user clicks Auto Recruiter page from navigation")
    public void user_clicks_Auto_Recruiter_page_from_navigation() throws InterruptedException {
        Thread.sleep(1000);
        autoRecruiterPage.autoRecruiterFromNavigationbar.click();
    }

    @Then("user validates the table that is present and the list of categories")
    public void user_validates_the_table_that_is_present_and_the_list_of_categories() {
    Assert.assertTrue(autoRecruiterPage.autoRecruiterTable.isDisplayed());
    Assert.assertTrue(autoRecruiterPage.nameCategory.isDisplayed());
        Assert.assertTrue(autoRecruiterPage.trialCategory.isDisplayed());
        Assert.assertTrue(autoRecruiterPage.providerCategory.isDisplayed());
    }


    @Then("user clicks on {string} button and verifies the page")
    public void user_clicks_on_button_and_verifies_the_page(String pageVerificationText) throws InterruptedException {
       autoRecruiterPage.inactivePatientListBtn.click();
       Thread.sleep(2000);
       Assert.assertTrue(autoRecruiterPage.inactivePatientsText.getText().contains(pageVerificationText));
    }

    @Then("user clicks on a patient and verifies their data")
    public void user_clicks_on_a_patient_and_verifies_their_data() throws InterruptedException {
        String patientName = autoRecruiterPage.patientFromTable.getText();
        String patientProvider = autoRecruiterPage.patientFromTableProvider.getText();
        autoRecruiterPage.patientFromTable.click();
        Thread.sleep(2000);
        Assert.assertTrue(autoRecruiterPage.pageTitleVerification.getText().contains(patientName));
        Thread.sleep(1000);
        Assert.assertTrue(autoRecruiterPage.patientProviderFromDetails.getText().contains(patientProvider));

        String actualUrl = Driver.getInstance().getDriver().getCurrentUrl();
        String expectedUrl = "https://development.bekhealth.com/#/auto-recruiter/prescreen/UGF0aWVudDo2MDAwN2RhYzQ3OTkyMzFmYTM5MWIzZWM=/undefined";
        Assert.assertEquals(expectedUrl,actualUrl);

    }

    @Then("user makes the patient active and verifies it")
    public void user_makes_the_patient_active_and_verifies_it() throws InterruptedException {
        autoRecruiterPage.patientStatusChangeBtn.click();
        Assert.assertTrue(autoRecruiterPage.activeText.getCssValue("color").contains("rgba(17, 54, 68, 1)"));
        Thread.sleep(2000);
        autoRecruiterPage.patientStatusChangeBtn.click();
        Thread.sleep(2000);
        autoRecruiterPage.confirmSwitch.click();
        Assert.assertTrue(autoRecruiterPage.inactiveText.getCssValue("color").contains("rgba(17, 54, 68, 1)"));

    }






}
