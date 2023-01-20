package org.example.step_def;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.ShoppingCartPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;

public class ShoppingCartSteps extends DriverManager {

    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @When("^I click on chosen product from books list page$")
    public void i_click_on_chosen_product_from_books_list_page() throws Throwable {
        shoppingCartPage.clickOnImageOfFirstPrizePies();

    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        shoppingCartPage.clickOnAddToCartButton();
    }

    @And("^I click on close button$")
    public void iClickOnCloseButton() {
        shoppingCartPage.clickOnCloseButton();
    }

    @And("^I click on shopping cart link$")
    public void iClickOnShoppingCartLink() {
        shoppingCartPage.clickOnShoppingCartLink();

    }

    @Then("^I should see product name on shopping cart page$")
    public void iShouldSeeProductNameOnShoppingCartPage(String expectedProductNameOnShoppingCartPage) {
        String actualProductNameOnShoppingCartPage = shoppingCartPage.textProductNameOnShoppingCartPage();
        System.out.println(actualProductNameOnShoppingCartPage);
        assertThat(actualProductNameOnShoppingCartPage, is(equalToIgnoringCase(expectedProductNameOnShoppingCartPage)));
    }
}
