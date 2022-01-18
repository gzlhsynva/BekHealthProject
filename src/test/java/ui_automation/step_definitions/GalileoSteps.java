package ui_automation.step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import ui_automation.pages.GalileoPage;
import ui_automation.utilities.Driver;

public class GalileoSteps {
    WebDriver driver;

    public GalileoSteps() {
        driver = Driver.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }
    GalileoPage galileoPage = new GalileoPage();

    @When("user navigates to Galileo Page")
    public void user_navigates_to_Galileo_Page() {
    galileoPage.menuBtn.click();
    galileoPage.galileoBtn.click();
    }

    @Then("user adds options to the box")
    public void user_adds_options_to_the_box() throws InterruptedException {
        String text = "testing";
        String num = "5";
        String num2 = "10";


        galileoPage.trialCriteriaOptionsBtn.click();
        galileoPage.demographicsBtn.click();
        galileoPage.addPatientID.click();
        galileoPage.addAge.click();
        galileoPage.trialCriteriaOptionsBtn.click();
        Thread.sleep(1000);
        galileoPage.customfacetBtn.click();
        Thread.sleep(1000);
        galileoPage.addMmse.click();
        Thread.sleep(1000);
        galileoPage.addMoca.click();
        galileoPage.parentIdTextBox.sendKeys(text);
        galileoPage.ageTextBox1.sendKeys(num);
        galileoPage.ageTextBox2.sendKeys(num2);
        galileoPage.mmseTextBox1.sendKeys(num);
        galileoPage.mmseTextBox2.sendKeys(num2);
        galileoPage.mocaTextBox1.sendKeys(num);
        galileoPage.mocaTextBox2.sendKeys(num2);
    }

    @Then("user clicks on save and validates the trial criteria")
    public void user_clicks_on_save_and_validates_the_trial_criteria() throws InterruptedException {
        String text = "QA testing";
        galileoPage.saveBtn.click();
        galileoPage.titleBtn.sendKeys(text);
        galileoPage.descriptionBtn.sendKeys(text);
        galileoPage.parentFolderBtn.click();
        galileoPage.bekTestingOption.click();
        galileoPage.submitBtn.click();
        Thread.sleep(1000);
        galileoPage.savedTrialsAndCriteriaBtn.click();
        Thread.sleep(3000);
        galileoPage.bekTestingLibraryDropdown.click();
        Thread.sleep(3000);
        String actualText = galileoPage.textValidation.getText();
        Assert.assertTrue(actualText.contains(text));
        Thread.sleep(2000);
        galileoPage.deleteBtn.click();
        Thread.sleep(2000);
        String deleteTextMessage = galileoPage.deleteTextConfirm.getText();
        Assert.assertTrue(deleteTextMessage.contains(text));
        Thread.sleep(2000);
        galileoPage.deleteConfirm.click();
        Thread.sleep(3000);
    }



    @Then("user clicks Saved Trials and Criteria tab")
    public void user_clicks_Saved_Trials_and_Criteria_tab() throws InterruptedException {
        galileoPage.savedTrialsAndCriteriaBtn.click();
        Thread.sleep(1000);
    }

    @Then("user uses the search button and verifies the result")
    public void user_uses_the_search_button_and_verifies_the_result() throws InterruptedException {
        String text = "QA test";
        WebElement search = galileoPage.searchBtn;
        search.sendKeys(text);
        search.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        String actualText =galileoPage.searchedTextVerification.getText();
        Assert.assertEquals(text,actualText);
        Thread.sleep(1000);
    }

    @Then("user adds a new trial")
    public void user_adds_a_new_trial() {
    galileoPage.trialAdd.click();
    }

    @Then("user clicks the show patients in trial button")
    public void user_clicks_the_show_patients_in_trial_button() {
        galileoPage.showPatientsInTrialBtn.click();
    }

    @Then("user verifies the trial functionalities and returns back")
    public void user_verifies_the_trial_functionalities_and_returns_back() throws InterruptedException {

        galileoPage.trialCriteriaOptionsBtn.click();
        galileoPage.demographicsBtn.click();
        Thread.sleep(2000);
        galileoPage.addAge.click();
        Thread.sleep(2000);
        galileoPage.addSex.click();
        Thread.sleep(4000);
        Assert.assertTrue(galileoPage.tableTitle1.getText().contains("Patient ID"));
        Assert.assertTrue(galileoPage.tableTitle2.getText().contains("Age"));
        Assert.assertTrue(galileoPage.tableTitle3.getText().contains("Sex"));
        galileoPage.backBtn.click();
        Thread.sleep(2000);
        Assert.assertTrue(galileoPage.galileoTitle.getText().contains("Galileo"));
    }






}
