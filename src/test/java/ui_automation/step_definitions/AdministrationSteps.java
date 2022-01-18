package ui_automation.step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import ui_automation.pages.AdministrationPage;
import ui_automation.pages.GalileoPage;

import javax.swing.*;

public class AdministrationSteps {

    GalileoPage galileoPage = new GalileoPage();
    AdministrationPage administrationPage = new AdministrationPage();

    @Then("user clicks the menu button and navigates to administration page and validates it")
    public void user_clicks_the_menu_button_and_navigates_to_administration_page_and_validates_it() {
        galileoPage.menuBtn.click();
        administrationPage.administrationTabBtn.click();
        String expectedText = "User Management";
        Assert.assertEquals(expectedText,administrationPage.administrationPageText.getText());
    }

    @Then("user validates the {string}")
    public void user_validates_the(String subtabs) throws InterruptedException {
        String phoneNum ="2134567890";
        String num = "12345";
        String text = "QAtesting";
        String email ="qatesting@mail.com";

        if(subtabs.equals("Authentication")){
            Thread.sleep(1000);
            administrationPage.addUserBtn.click();
            Thread.sleep(1000);
            administrationPage.emailInput.sendKeys(email);
            Thread.sleep(1000);
            administrationPage.roleChangeToUser.click();
            administrationPage.PHIaccessChanger.click();
            administrationPage.checkBox1.click();
            administrationPage.checkBox2.click();
            administrationPage.checkBox3.click();
            administrationPage.checkBox4.click();
            administrationPage.submitBtn.click();
            Thread.sleep(2000);
            administrationPage.deleteUser.click();
            Thread.sleep(2000);
            Assert.assertTrue(administrationPage.deleteTextConfirm.getText().contains(email));
            Thread.sleep(1000);
            administrationPage.confirmDelete.click();
        }
        else if(subtabs.equals("Site Registration")){
            Thread.sleep(1000);
            administrationPage.siteRegistrationBtn.click();
            Thread.sleep(1000);
            administrationPage.addNewSite.click();
            Thread.sleep(1000);
            administrationPage.siteName.sendKeys(text);
            administrationPage.siteID.sendKeys(num);
            administrationPage.addressLine1.sendKeys(text);
            administrationPage.addressLine2.sendKeys(text);
            administrationPage.city.sendKeys(text);
            administrationPage.zipcode.sendKeys(num);
            administrationPage.state.sendKeys(text);
            administrationPage.country.sendKeys(text);
            administrationPage.firstName.sendKeys(text);
            administrationPage.lastName.sendKeys(text);
            administrationPage.email.sendKeys(email);
            administrationPage.phoneNumber.sendKeys(phoneNum);
            administrationPage.extension.sendKeys(num);
            Thread.sleep(3000);
            administrationPage.selectUsers.click();
            Thread.sleep(4000);
            administrationPage.userSelect.click();
            Thread.sleep(3000);
            administrationPage.getOutOfDropdown.click();
            administrationPage.getOutOfDropdown.click();
            Thread.sleep(2000);
            administrationPage.submitBtn2.click();
            Thread.sleep(2000);
            administrationPage.deleteBtn2.click();
            Thread.sleep(2000);
            Assert.assertTrue(administrationPage.deleteTextConfirm.getText().contains(text));
            Thread.sleep(1000);
            administrationPage.confirmDelete.click();

        }
        else if(subtabs.equals("Trial Groups")){
            Thread.sleep(1000);
            administrationPage.trialGroups.click();
            Thread.sleep(1000);
            administrationPage.addGroup.click();
            Thread.sleep(1000);
            administrationPage.name2.sendKeys(text);
            Thread.sleep(2000);
            administrationPage.description.sendKeys(text);
            Thread.sleep(3000);
            administrationPage.usersGroups.click();
            Thread.sleep(4000);
            administrationPage.userSelect2.click();
            Thread.sleep(4000);
            administrationPage.getOutOfDropdown.click();
            administrationPage.getOutOfDropdown.click();
            Thread.sleep(2000);
            administrationPage.submitBtn.click();
            Thread.sleep(4000);
            administrationPage.delete3.click();
            Thread.sleep(3000);
            Assert.assertTrue(administrationPage.deleteTextConfirm.getText().contains(text));
            Thread.sleep(1000);
            administrationPage.confirmDelete.click();
        }

    }


}
