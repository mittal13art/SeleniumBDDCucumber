package org.example.pages;

import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends DriverManager {

    @FindBy(xpath = "//img[@alt='Picture of First Prize Pies']")
    WebElement imageOfFirstPrizePies;

    @FindBy(id = "add-to-cart-button-38")
    WebElement addToCartButton;

    @FindBy(xpath = "//span[@class='close']")
    WebElement closeButton;

    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement shoppingCartLink;

    @FindBy(className = "product-name")
    WebElement productNameOnShoppingCartPage;

    @FindBy(id = "termsofservice")
    WebElement tickBoxTermsOfService;

    @FindBy(id = "checkout")
    WebElement checkOutButton;


    public void clickOnImageOfFirstPrizePies() {
        imageOfFirstPrizePies.click();

    }

    public void clickOnAddToCartButton() {
        addToCartButton.click();
    }

    public void clickOnCloseButton() {
        closeButton.click();
    }

    public void clickOnShoppingCartLink() {

        shoppingCartLink.click();
    }

    public String textProductNameOnShoppingCartPage() {
        return productNameOnShoppingCartPage.getText();

    }

    public void clickOnTermsOfService() {
        tickBoxTermsOfService.click();

    }

    public void clickOnCheckOutButton() {
        checkOutButton.click();

    }
}
