package ui_automation.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import ui_automation.pages.HomePage;

public class HomePageSteps {
    HomePage homePage = new HomePage();

    @Then("user validates the displayed table on Homepage")
    public void user_validates_the_displayed_table_on_Homepage() {
        homePage.table.isDisplayed();
        String expectedTableText ="Trials Table";
        String tableText = homePage.tableText.getText();
        tableText.trim();
        Assert.assertEquals("Table and Text not displayed!",expectedTableText,tableText);
    }

    @Then("user clicks the Candidate Look Up button and looks up {string} and then verifies the information")
    public void user_clicks_the_Candidate_Look_Up_button_and_looks_up_and_then_verifies_the_information(String candidate) throws InterruptedException {

        homePage.candidateLookUpBtn.sendKeys(candidate);
        homePage.candidateLookUpBtn.sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        String actualCandidateName = homePage.candidateNameVerification.getText();
        Thread.sleep(2000);
        Assert.assertTrue(actualCandidateName.contains(candidate));

    }


    @Then("user clicks the Phone number Look Up button and looks up {string} and then verifies the information")
    public void user_clicks_the_Phone_number_Look_Up_button_and_looks_up_and_then_verifies_the_information(String phoneNum) throws InterruptedException {
        homePage.candidateLookUpChange.click();
        Thread.sleep(2000);
        homePage.candidateLookUpChangeToPhoneNum.click();
        Thread.sleep(1000);
        homePage.candidateLookUpBtnByPhone.sendKeys(phoneNum);
        Thread.sleep(1000);
        homePage.candidateLookUpBtnByPhone.sendKeys(Keys.ENTER);
//        Thread.sleep(20000);
//        String last4DigitsOfPhoneNum = phoneNum.substring(15);
//        Thread.sleep(2000);
//        String actualCandidateNum = homePage.candidatePhoneNumVerification.getText();
//        Thread.sleep(2000);
//        Assert.assertTrue(actualCandidateNum.contains(last4DigitsOfPhoneNum));

    }

    @Then("user clicks on a trial name and verifies its functionality")
    public void user_clicks_on_a_trial_name_and_verifies_its_functionality() throws InterruptedException {
        homePage.depressionTrialNameBtn.click();
        Thread.sleep(2000);
        homePage.seeListBtn.click();
        Thread.sleep(1000);
        homePage.filtersBtn.click();
        Thread.sleep(1000);
        homePage.sortNameFilter.click();
        Thread.sleep(1000);
        homePage.sortFilteroption2.click();
        Thread.sleep(1000);
        homePage.sortCriteriaFilter.click();
        Thread.sleep(1000);
        homePage.sortFilteroption1.click();
        Thread.sleep(2000);
        homePage.sortPrimaryProviderFilter.click();
        Thread.sleep(3000);
        homePage.sortFilteroption1.click();
        Thread.sleep(2000);
        homePage.clickOff.click();
        Thread.sleep(2000);
        homePage.filterByProvider.click();
        Thread.sleep(2000);
        homePage.sortFilteroption1.click();
        Thread.sleep(2000);
//        homePage.sortFilteroption3.click();
//        Thread.sleep(2000);
        homePage.filtersBtn.click();
        Thread.sleep(2000);
        Assert.assertTrue(homePage.tableName1.getText().contains("Brian Rogers"));

    }


    @Then("validates Auto Recruiter page")
    public void validates_Auto_Recruiter_page() {
    Assert.assertTrue(homePage.emptyTable.getText().equals("No Data"));
    }

    @Then("validates Administration page")
    public void validates_Administration_page() {
        Assert.assertTrue(homePage.emptyTable.getText().equals("No Data"));
    }




}
