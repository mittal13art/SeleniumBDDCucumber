package org.example.step_def;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.driver.DriverManager;
import org.example.pages.ContactUsPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ContactUsSteps extends DriverManager {

    ContactUsPage contactUsPage = new ContactUsPage();
    DriverManager driverManager = new DriverManager();

    @Then("^I should see \"([^\"]*)\" text on the contact us page$")
    public void i_should_see_text_on_the_contact_us_page(String expectedTextOnContactUsPage) throws Throwable {

        String actualTextOnContactusPage = contactUsPage.getTextFromContactUsPage();
        System.out.println(actualTextOnContactusPage);
        System.out.println(expectedTextOnContactUsPage);
        assertThat(actualTextOnContactusPage, is(equalToIgnoringCase(expectedTextOnContactUsPage)));
    }

}
