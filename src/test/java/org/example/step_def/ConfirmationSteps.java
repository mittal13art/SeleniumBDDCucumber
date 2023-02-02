package org.example.step_def;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.driver.DriverManager;
import org.example.pages.ConfirmationPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;

public class ConfirmationSteps extends DriverManager {
    ConfirmationPage confirmationPage = new ConfirmationPage();

    @Then("^I should see \"([^\"]*)\" text on confirmation page$")
    public void iShouldSeeTextOnConfirmationPage(String expText) throws Throwable {
        if (expText.equals("Thank you")){
            confirmationPage.getThankYouText();
            String thankYouText = confirmationPage.getThankYouText();
            System.out.println(thankYouText);
            assertThat(thankYouText, is(equalToIgnoringCase(expText)));
        } else if (expText.equals("Your order has been successfully processed!")){
            confirmationPage.getConfirmationText();
            String confirmationText = confirmationPage.getConfirmationText();
            System.out.println(confirmationText);
            assertThat(confirmationText, is(equalToIgnoringCase(expText)));
        } else throw new IllegalAccessException("Unexpected text");

    }


}
