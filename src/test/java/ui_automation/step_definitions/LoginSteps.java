package ui_automation.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import ui_automation.pages.LoginPage;
import ui_automation.utilities.ConfigurationReader;
import ui_automation.utilities.Driver;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();


    @When("user is in  BekHealth page")
    public void user_is_in_BekHealth_page() throws InterruptedException {
        Driver.getInstance().getDriver().get(ConfigurationReader.getProperty("ui-config.properties","BekHealth.url"));
        Thread.sleep(2000);
        loginPage.acceptBtn.click();
    }

    @Then("user enters {string} and {string}")
    public void user_enters_and(String username, String password) throws Exception {
        switch (username) {
            case "invalid":
                loginPage.usernameTextBox.sendKeys("invalidUsername");
                break;
            case "valid":
                loginPage.usernameTextBox.sendKeys(ConfigurationReader.getProperty("ui-config.properties","BekHealth.username"));
                break;
            case "empty":
                loginPage.usernameTextBox.sendKeys("");
                break;
            default:
                throw new Exception(username + " Username type is undefined!");
        }
        loginPage.continueBox.click();
        switch (password) {
            case "invalid":
                loginPage.passwordTextBox.sendKeys("invalidPassword");
                break;
            case "valid":
                loginPage.passwordTextBox.sendKeys(ConfigurationReader.getProperty("ui-config.properties","BekHealth.password"));
                break;
            case "empty":
                loginPage.passwordTextBox.sendKeys("");
                break;
            default:
                throw new Exception(password + "Password type is undefined!");
        }
        loginPage.continueBox.click();
        Thread.sleep(1000);
    }

    @Then("user validates the {string} after pressing sign in")
    public void user_validates_the_after_pressing_sign_in(String errorMessage) throws InterruptedException {
        String accessDenied ="Access denied: Wrong email or password.";
        String emailAd = "Please input email address";
        String passwordAd = "Please input password";

        if(errorMessage.equals(accessDenied)){
            Assert.assertTrue(loginPage.accessDeniedError.getText().contains(accessDenied));
            Thread.sleep(1000);
        }else if (errorMessage.equals(emailAd)){
            Assert.assertTrue(loginPage.inputEmailAddress.getText().contains(emailAd));
            Thread.sleep(1000);
        }

        Thread.sleep(1000);


    }

    @When("user enter valid credentials and clicks on login button")
    public void user_enter_valid_credentials_and_clicks_on_login_button() throws InterruptedException {
        loginPage.login();
    }

    @When("user enter valid user credentials and clicks on login button")
    public void user_enter_valid_user_credentials_and_clicks_on_login_button() {
        loginPage.userLogin();
    }



}
