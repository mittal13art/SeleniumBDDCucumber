package org.example.step_def;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.LoginPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class LoginSteps extends DriverManager {
    LoginPage loginPage = new LoginPage();

    @Then("^I should see \"([^\"]*)\" text on the log in page$")
    public void i_should_see_text_on_the_log_in_page(String expectedWelcomeTextOnLogInPage) throws Throwable {
        String actualWelcomeText = loginPage.getWelcomeTextFromLogInPage();
        System.out.println(actualWelcomeText);
        System.out.println(expectedWelcomeTextOnLogInPage);
        assertThat(actualWelcomeText, is(equalToIgnoringCase(expectedWelcomeTextOnLogInPage)));
    }

    @And("^I should see text \"([^\"]*)\" in url$")
    public void iShouldSeeTextInUrl(String expectedUrlText) throws Throwable {
        String actualURL = getURL();
        System.out.println(actualURL);
        assertThat(actualURL, containsString(expectedUrlText));

    }

    @And("^I enter valid email \"([^\"]*)\"$")
    public void iEnterValidEmail(String email) throws Throwable {
        loginPage.enterEmailID(email);

    }

    @And("^I enter valid password \"([^\"]*)\"$")
    public void iEnterValidPassword(String password) throws Throwable {
        loginPage.enterPassword(password);

    }

    @And("^I click on the log in button on login page$")
    public void iClickOnTheLogInButtonOnLoginPage() {
        loginPage.clickOnLogInButtonOnLogInPage();

    }

    @Then("^I should see logout button displayed$")
    public void iShouldSeeLogoutButtonDisplayed() throws Throwable {
        boolean logoutButtonIsDisplayed = loginPage.logoutButtonDisplayed();
        assertThat(logoutButtonIsDisplayed, is(true));
    }


    @And("^I enter invalid email \"([^\"]*)\"$")
    public void iEnterInvalidEmail(String invalidEmail) throws Throwable {
        loginPage.enterInvalidEmail(invalidEmail);

    }
    @When("^I click on password input field on login page$")
    public void i_click_on_password_input_field_on_login_page() throws Throwable {
        loginPage.clickOnPasswordInputField();

    }

    @Then("^I should see text \"([^\"]*)\" under email input box$")
    public void iShouldSeeTextUnderEmailInputBox(String expectedEmailError) throws Throwable {
        String actualEmailError = loginPage.textUnderEmailInputBox();
        assertThat(actualEmailError, is(equalToIgnoringCase(expectedEmailError)));

    }


}
