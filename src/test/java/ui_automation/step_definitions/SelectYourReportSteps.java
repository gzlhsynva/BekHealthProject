package ui_automation.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import ui_automation.pages.SelectYourReportPage;
import ui_automation.pages.WidgetPage;

public class SelectYourReportSteps {
    SelectYourReportPage selectYourReportPage = new SelectYourReportPage();
    WidgetPage widgetPage = new WidgetPage();

    @When("user clicks {string} page and verifies the title")
    public void user_clicks_page_and_verifies_the_title(String reportName) throws InterruptedException {
        String expectedOperationalReportText="Select a Trial";
        String expectedOperationalPerformanceReportText="Operational Performance Report";
        String expectedUserPerformanceReportText="User Performance Report";


    if(reportName.equals("Operational Report")){
        widgetPage.selectYourReportWidget.click();
        Thread.sleep(2000);
        widgetPage.operationalReportDropdown.click();
        Thread.sleep(1000);
        String actualOperationalReportText = widgetPage.selectOperationalReportText.getText();
        Assert.assertEquals("Report text not found!",expectedOperationalReportText , actualOperationalReportText);
    }else if(reportName.equals("Operational Performance Report")){
        widgetPage.selectYourReportWidget.click();
        Thread.sleep(2000);
        selectYourReportPage.operationalPerformanceDropdown.click();
        Thread.sleep(1000);
        String actualOperationalPerformanceReportText = selectYourReportPage.selectOperationalPerformanceReportText.getText();
        Assert.assertEquals("Report text not found!",expectedOperationalPerformanceReportText , actualOperationalPerformanceReportText);
        }else if(reportName.equals("User Performance Report")){
        widgetPage.selectYourReportWidget.click();
        Thread.sleep(2000);
        selectYourReportPage.userPerformanceReportDropdown.click();
        Thread.sleep(1000);
        String actualUserPerformanceReportText = selectYourReportPage.selectUserPerformanceReportText.getText();
        Assert.assertEquals("Report text not found!",expectedUserPerformanceReportText , actualUserPerformanceReportText);
        }


    }

    @Then("user validates {string} pages")
    public void user_validates_pages(String reportName) throws InterruptedException {
        if(reportName.equals("Operational Report")){
            widgetPage.selectYourReportWidget.click();
            Thread.sleep(2000);
            Assert.assertTrue(selectYourReportPage.operationalChartHeader.isDisplayed());
            Assert.assertTrue(selectYourReportPage.operationalChartHeader.getText().contains("Total"));
            Assert.assertTrue(selectYourReportPage.operationalChartHeader2.isDisplayed());
            Assert.assertTrue(selectYourReportPage.operationalChartHeader2.getText().contains("Reasons for Candidate Rejection"));
        }else if(reportName.equals("Operational Performance Report")){
            widgetPage.selectYourReportWidget.click();
            Thread.sleep(2000);
            selectYourReportPage.operationalPerformanceDropdown.click();
            Thread.sleep(1000);
            Assert.assertTrue(selectYourReportPage.operationalPerformanceChartHeader.isDisplayed());
//            Assert.assertTrue(selectYourReportPage.operationalPerformanceChartHeader2.isDisplayed());

        }else if(reportName.equals("User Performance Report")){
            widgetPage.selectYourReportWidget.click();
            Thread.sleep(2000);
            selectYourReportPage.userPerformanceReportDropdown.click();
            Thread.sleep(1000);
            Assert.assertTrue(selectYourReportPage.userPerformanceBoxHeader.isDisplayed());
            Assert.assertTrue(selectYourReportPage.userPerformanceBoxHeader2.isDisplayed());
        }

    }
    @When("user clicks {string} page and validates the functionalities in each page")
    public void user_clicks_page_and_validates_the_functionalities_in_each_page(String reportName) throws InterruptedException {
        if(reportName.equals("Operational Report")){
            widgetPage.selectYourReportWidget.click();
            Thread.sleep(3000);
            widgetPage.operationalReportDropdown.click();
            Thread.sleep(1000);
            selectYourReportPage.expandBtn.click();
            Thread.sleep(1000);
            selectYourReportPage.closeGraphBtn.click();
            selectYourReportPage.dropdownSelectTrial.click();
            Thread.sleep(1000);
            selectYourReportPage.dropdownSelect.click();
            Thread.sleep(1000);
            Assert.assertTrue(selectYourReportPage.chartHeader.getText().contains("Approved"));

        }else if(reportName.equals("Operational Performance Report")){
            widgetPage.selectYourReportWidget.click();
            Thread.sleep(2000);
            selectYourReportPage.operationalPerformanceDropdown.click();
            Thread.sleep(1000);
            Assert.assertTrue(selectYourReportPage.chartHeader2.getText().contains("Disqualification"));
            Assert.assertTrue(selectYourReportPage.chartHeader.getText().contains("Success"));
            Assert.assertTrue(selectYourReportPage.statisticHeader.isDisplayed());
            Assert.assertTrue(selectYourReportPage.statisticHeader2.isDisplayed());
            Assert.assertTrue(selectYourReportPage.statisticHeader3.isDisplayed());
            selectYourReportPage.dropdown3.click();
            Thread.sleep(1000);
            selectYourReportPage.dropdownOption.click();
            Assert.assertTrue(selectYourReportPage.statisticHeader.isDisplayed());
            Assert.assertTrue(selectYourReportPage.statisticHeader2.isDisplayed());
            Assert.assertTrue(selectYourReportPage.statisticHeader3.isDisplayed());


        }else if(reportName.equals("User Performance Report")){
            widgetPage.selectYourReportWidget.click();
            Thread.sleep(2000);
            selectYourReportPage.userPerformanceReportDropdown.click();
            Thread.sleep(1000);
            Assert.assertTrue(selectYourReportPage.userPerformanceBoxHeader.isDisplayed());
            Assert.assertTrue(selectYourReportPage.userPerformanceBoxHeader2.isDisplayed());
            selectYourReportPage.dropdown3.click();
            Thread.sleep(1000);
            selectYourReportPage.dropdownOption.click();
            Assert.assertTrue(selectYourReportPage.userPerformanceBoxHeader.isDisplayed());
            Assert.assertTrue(selectYourReportPage.userPerformanceBoxHeader2.isDisplayed());

        }

    }


}
