package ui_automation.step_definitions;

import io.cucumber.java.en.*;
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
    public void user_clicks_the_Candidate_Look_Up_button_and_looks_up_and_then_verifies_the_information(String candidate) {

        homePage.candidateLookUpBtn.sendKeys(candidate);
        homePage.candidateLookUpBtn.sendKeys(Keys.ENTER);
        String actualCandidateName = homePage.candidateNameVerification.getText();
        Assert.assertEquals(candidate,actualCandidateName);

    }


    @Then("user clicks the Phone number Look Up button and looks up {string} and then verifies the information")
    public void user_clicks_the_Phone_number_Look_Up_button_and_looks_up_and_then_verifies_the_information(String phoneNum) {
        homePage.candidateLookUpChange.click();
        homePage.candidateLookUpChangeToPhoneNum.click();
        homePage.candidateLookUpBtn.sendKeys(phoneNum);
        homePage.candidateLookUpBtn.sendKeys(Keys.ENTER);
        String last4DigitsOfPhoneNum = phoneNum.substring(6);
        String actualCandidateNum = homePage.candidatePhoneNumVerification.getText();
        Assert.assertTrue(actualCandidateNum.contains(last4DigitsOfPhoneNum));

    }


}
