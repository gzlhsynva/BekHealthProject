package ui_automation.step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import ui_automation.pages.DomainPage;
import ui_automation.pages.GalileoPage;


public class DomainSteps {
    DomainPage domainPage = new DomainPage();
    GalileoPage galileoPage = new GalileoPage();


    @Then("user clicks on domain dropdown button and clicks each dropdown {string} and verifies the tabs")
    public void user_clicks_on_domain_dropdown_button_and_clicks_each_dropdown_and_verifies_the_tabs(String dropdowns) throws InterruptedException {


        galileoPage.trialCriteriaOptionsBtn.click();
        if(dropdowns.equals("Demographics")){
        galileoPage.demographicsBtn.click();
            Assert.assertTrue(domainPage.demographicsTab1.isDisplayed());
            Assert.assertTrue(domainPage.demographicsTab2.isDisplayed());
            Assert.assertTrue(domainPage.demographicsTab3.isDisplayed());
            Thread.sleep(1000);
            Assert.assertTrue(domainPage.demographicsTab4.isDisplayed());
            Assert.assertTrue(domainPage.demographicsTab5.isDisplayed());
            Assert.assertTrue(domainPage.demographicsTab6.isDisplayed());
            Assert.assertTrue(domainPage.demographicsTab7.isDisplayed());

        }

        else if(dropdowns.equals("Custom facet")) {
            galileoPage.customfacetBtn.click();
            Assert.assertTrue(domainPage.customFacetTab1.isDisplayed());
            Thread.sleep(1000);
            Assert.assertTrue(domainPage.customFacetTab2.isDisplayed());
            Assert.assertTrue(domainPage.customFacetTab3.isDisplayed());

        }

        else if(dropdowns.equals("Observations & Vital Signs")){
            domainPage.observationsVitalDropdown.click();
//            Assert.assertTrue(domainPage.observationsVitalTab1.isDisplayed());
//            Assert.assertTrue(domainPage.observationsVitalTab2.isDisplayed());
        }

        else if(dropdowns.equals("Diagnosis")){
            domainPage.diagnosisDropdown.click();
//            Assert.assertTrue(domainPage.diagnosisTab1.isDisplayed());
//            Assert.assertTrue(domainPage.diagnosisTab2.isDisplayed());
            domainPage.diagnosisDropdown2.click();
            domainPage.diagnosisDropdown2Button.click();
//            Assert.assertTrue(domainPage.diagnosisDropdown2ButtonTab1.isDisplayed());
//            Assert.assertTrue(domainPage.diagnosisDropdown2ButtonTab2.isDisplayed());

        }

        else if(dropdowns.equals("Encounters")){
            domainPage.encountersDropdown.click();
//            Assert.assertTrue(domainPage.encountersTab1.isDisplayed());
//            Assert.assertTrue(domainPage.encountersTab2.isDisplayed());

        }

        else if(dropdowns.equals("Labs")){
            domainPage.labsDropdown.click();

//            Assert.assertTrue(domainPage.labsTab1.isDisplayed());
//            Assert.assertTrue(domainPage.labsTab2.isDisplayed());


        }

        else if(dropdowns.equals("Medications")){
            Thread.sleep(2000);
            domainPage.medicationsDropdown.click();

//            Assert.assertTrue(domainPage.medicationsTab1.isDisplayed());
//            Assert.assertTrue(domainPage.medicationsTab2.isDisplayed());


        }

        else if(dropdowns.equals("Procedures")){
            Thread.sleep(2000);
            domainPage.proceduresDropdown.click();

//            Assert.assertTrue(domainPage.proceduresTab1.isDisplayed());
//            Assert.assertTrue(domainPage.proceduresTab2.isDisplayed());
        }
    }



}
