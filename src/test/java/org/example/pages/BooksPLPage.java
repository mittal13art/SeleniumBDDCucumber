package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksPLPage extends DriverManager {

    @FindBy(xpath = "//*[@class='button-2 product-box-add-to-cart-button']")
    WebElement addToCartButtonFahrenheit;

    @FindBy(xpath = "//a[@href='/cart']")
    WebElement shoppingCartLink;

    public void clickOnAddToCartButtonFahrenheit(){

        addToCartButtonFahrenheit.click();
    }

    public void clickOnShoppingCartLink(){

        shoppingCartLink.click();
    }
}
