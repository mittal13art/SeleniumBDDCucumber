package org.example.step_def;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.HomePage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HomeSteps extends DriverManager {

    DriverManager driverManager = new DriverManager();
    HomePage homePage = new HomePage();

    @Given("^I am on the home page$")
    public void i_am_on_the_home_page() throws Throwable {
        String actualURL = getURL();
        System.out.println(actualURL);
        assertThat(actualURL, is(endsWith("nopcommerce.com/")));

        //validation through title
        String actualTitle = driverManager.getTitle();
        System.out.println(actualTitle);
        assertThat(actualTitle, is(equalToIgnoringCase("nopCommerce demo store")));

        //validation through text from home page
        String actualTextOnHomePage = homePage.getTextFromHomePage();
        System.out.println(actualTextOnHomePage);
        assertThat(actualTextOnHomePage, is(equalToIgnoringCase("Welcome to our store")));

    }

    @When("^I click on the log in button$")
    public void i_click_on_the_log_in_button() throws Throwable {
        homePage.clickOnLogInButtonOnHomePage();
    }

    @And("^I click on register button$")
    public void i_click_on_register_button() throws Throwable {
        homePage.clickOnRegisterButtonOnHomePage();

    }

    @When("^I click on the contact us button on home page$")
    public void iClickOnTheContactUsButtonOnHomePage() {

        homePage.clickOnContactUsButtonOnHomePage();
    }

    @When("^I take screenshot of search field$")
    public void iTakeScreenshotOfSearchField() {
        homePage.takeScreenshotOfSearchField();

    }

//    @When("^I click on Books category on home page$")
//    public void iClickOnBooksCategoryOnHomePage() {
//        homePage.clickOnBooksCategory();
//    }

    @And("^I click on the \"([^\"]*)\"$")
    public void iClickOnThe(String categoryName) throws Throwable {
        switch (categoryName) {
            case "Computers":
                homePage.clickOnComputersCategory();
                break;
            case "Electronics":
                homePage.clickOnElectronicsCategory();
                break;
            case "Books":
                homePage.clickOnBooksCategory();
                break;
            case "Jewelry":
                homePage.clickOnJewelryCategory();
                break;
            case "Gift Cards":
                homePage.clickOnGiftCardCategory();
                break;
            default:
                throw new IllegalAccessException("Unexpected header button");
        }
    }
}

