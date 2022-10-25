package ui_automation.step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import ui_automation.pages.AdministrationPage;
import ui_automation.pages.GalileoPage;

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
        String text = "WQAtesting";
        String email ="Wqatesting@mail.com";
        Faker faker = new Faker();



        if(subtabs.equals("Authentication")){

            Thread.sleep(3000);
            administrationPage.addUserBtn.click();
            Thread.sleep(2000);
            administrationPage.emailInput.sendKeys(email);
            Thread.sleep(2000);
            administrationPage.roleChangeToUser.click();
            administrationPage.PHIaccessChanger.click();
            administrationPage.checkBox1.click();
            administrationPage.checkBox2.click();
            administrationPage.checkBox3.click();
            administrationPage.checkBox4.click();
            administrationPage.checkBox5.click();
            administrationPage.checkBox8.click();
            administrationPage.checkBox11.click();
            administrationPage.checkBox12.click();
            administrationPage.submitBtn.click();
            Thread.sleep(5000);
            administrationPage.deleteUser.click();
            Thread.sleep(2000);
            Assert.assertTrue(administrationPage.deleteTextConfirm.getText().contains("@mail.com"));
            Thread.sleep(2000);
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
            administrationPage.addressLine1.sendKeys("1254 District South Drive");
            administrationPage.city.sendKeys("Boston");
            administrationPage.zipcode.sendKeys("01566");
            administrationPage.state.sendKeys("MA");
            administrationPage.country.sendKeys("USA");
            administrationPage.firstName.sendKeys(text);
            administrationPage.lastName.sendKeys(text);
            administrationPage.email.sendKeys(email);
            administrationPage.phoneNumber.sendKeys(phoneNum);
            administrationPage.extension.sendKeys(num);
            Thread.sleep(3000);
            administrationPage.selectUsers.click();
            Thread.sleep(4000);
            administrationPage.userSelect.click();
            Thread.sleep(2000);
            administrationPage.userSelect32.click();
            Thread.sleep(1000);
            administrationPage.userSelect3.click();
            Thread.sleep(1000);
            administrationPage.userSelect4.click();
            Thread.sleep(3000);
            administrationPage.getOutOfDropdown.click();
            administrationPage.getOutOfDropdown.click();
            Thread.sleep(2000);
            administrationPage.submitBtn2.click();
            Thread.sleep(5000);
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
            Thread.sleep(1000);
            administrationPage.userSelect23.click();
            Thread.sleep(1000);
            administrationPage.userSelect24.click();
            Thread.sleep(4000);
            administrationPage.getOutOfDropdown.click();
            //administrationPage.getOutOfDropdown.click();
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
