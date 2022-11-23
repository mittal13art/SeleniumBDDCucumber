package org.example.step_def;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.RegistrationPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class RegistrationSteps extends DriverManager {

    RegistrationPage registrationPage = new RegistrationPage();


    @When("^I enter first name \"([^\"]*)\"$")
    public void i_enter_first_name(String firstName) throws Throwable {
        registrationPage.enterFirstName(firstName);

    }

    @And("^I enter lastname \"([^\"]*)\"$")
    public void i_enter_lastname(String lastName) throws Throwable {
        registrationPage.enterLastName(lastName);
    }

    @And("^I enter valid email on register page \"([^\"]*)\"$")
    public void i_enter_valid_email_on_register_page(String emailOnRGPage) throws Throwable {
        registrationPage.enterEmailOnRGPage(emailOnRGPage);

    }

    @And("^I enter valid password on register page \"([^\"]*)\"$")
    public void i_enter_valid_password_on_register_page(String passwordOnRGPage) throws Throwable {
        registrationPage.enterPasswordOnRGPage(passwordOnRGPage);

    }

    @And("^I enter confirm password on register page \"([^\"]*)\"$")
    public void i_enter_confirm_password_on_register_page(String confirmPassword) throws Throwable {
        registrationPage.enterConfirmPassword(confirmPassword);

    }

    @And("^I click on REGISTER button on register page$")
    public void i_click_on_REGISTER_button_on_register_page() throws Throwable {
        registrationPage.clickOnRegisterButtonOnRegistrationPage();

    }


    @Then("^I should see text Your registration completed$")
    public void iShouldSeeTextYourRegistrationCompleted() throws Throwable {
        boolean actualTextAfterRegistrationCompleted = registrationPage.iShouldSeeResultAfterRegistrationCompleted();
        assertThat(actualTextAfterRegistrationCompleted,is(true));
    }

    @And("^I should see \"([^\"]*)\" in URL$")
    public void iShouldSeeInURL(String expectedTextInURLAfterRegCompleted) throws Throwable {
       String actualTextInURLAfterRegistration = getURL();
       assertThat(actualTextInURLAfterRegistration,containsString(expectedTextInURLAfterRegCompleted));

    }

    @And("^I should see My account button displayed$")
    public void iShouldSeeMyAccountButtonDisplayed() {
        boolean myAccountButtonIsDisplayed = registrationPage.iShouldSeeMyAccountButtonDisplayed();
        assertThat(myAccountButtonIsDisplayed,is(true));
    }
}
