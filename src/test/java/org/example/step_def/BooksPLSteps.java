package org.example.step_def;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.example.driver.DriverManager;
import org.example.pages.BooksPLPage;

public class BooksPLSteps extends DriverManager {

    BooksPLPage booksPLPage = new BooksPLPage();
    @Given("^I click on the add to cart button for Fahrenheit by Ray Bradbury$")
    public void i_click_on_the_add_to_cart_button_for_Fahrenheit_by_Ray_Bradbury() throws Throwable {
        booksPLPage.clickOnAddToCartButtonFahrenheit();
    }

    @And("^I click on shopping cart$")
    public void iClickOnShoppingCart() {
        booksPLPage.clickOnShoppingCartLink();
    }
}
