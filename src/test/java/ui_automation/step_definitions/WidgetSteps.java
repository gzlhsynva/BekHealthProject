package ui_automation.step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import ui_automation.pages.DomainPage;
import ui_automation.pages.GalileoPage;
import ui_automation.pages.WidgetPage;

public class WidgetSteps {
    WidgetPage widgetPage = new WidgetPage();
    DomainPage domainPage = new DomainPage();
    GalileoPage galileoPage = new GalileoPage();


    @Then("user clicks the widget button")
    public void user_clicks_the_widget_button() {
        galileoPage.menuBtn.click();
    }


    @Then("user clicks {string} page and verifies the text in page")
    public void user_clicks_page_and_verifies_the_text_in_page(String widget) {
       String expectedGalileoText ="Galileo";
        String expectedReportingText ="Patient Attrition:";
        String expectedAutoRecruiterText ="Trial Portfolio";
        String expectedAdministrationText ="User Management";

       if(widget.equals("Galileo")) {
           galileoPage.galileoBtn.click();
           String actualGalileoText = widgetPage.galileoText.getText();
           Assert.assertEquals("Galileo text not found!", expectedGalileoText, actualGalileoText);
       }else if(widget.equals("Reporting")){
           widgetPage.reportingWidget.click();
           String actualReportingText = widgetPage.reportingText.getText();
           Assert.assertEquals("Reporting text not found!", expectedReportingText, actualReportingText);
       }else if(widget.equals("Auto Recruiter")){
           widgetPage.autoRecruiterWidget.click();
           String actualAutoRecruiterText = widgetPage.autoRecruiterText.getText();
           Assert.assertEquals("Auto Recruiter text not found!", expectedAutoRecruiterText, actualAutoRecruiterText);
       }else if(widget.equals("Administration")){
        widgetPage.administrationWidget.click();
        String actualAdministrationText = widgetPage.administrationText.getText();
           Assert.assertEquals("Administration text not found!", expectedAdministrationText, actualAdministrationText);
       }
    }






}
