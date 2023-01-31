package org.example.pages;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class HomePage extends DriverManager {
    @FindBy(xpath = "//*[text()='Welcome to our store']")
    WebElement textOnHomePage;

    @FindBy(className = "ico-login")
    WebElement logInButtonOnHomePage;

    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerButtonOnHomePage;

    @FindBy(xpath = "//a[@href='/contactus']")
    WebElement contactUsButton;

    @FindBy(id = "small-searchterms")
    WebElement searchField;

    @FindBy(xpath = "//*[@class='header-menu']/ul[2]/li[1]")
    WebElement computersCategory;

    @FindBy(xpath = "//*[@class='header-menu']/ul[2]/li[2]")
    WebElement electronicsCategory;
    @FindBy(xpath = "//*[@class='header-menu']/ul[1]/li[5]")
    WebElement booksCategory;

    @FindBy(xpath = "//*[@class='header-menu']/ul[2]/li[6]")
    WebElement jewelryCategory;

    @FindBy(xpath = "//*[@class='header-menu']/ul[2]/li[7]")
    WebElement giftCardCategory;




    public String getTextFromHomePage() {

        return textOnHomePage.getText();
    }

    public void clickOnLogInButtonOnHomePage() {

        logInButtonOnHomePage.click();
    }

    public void clickOnRegisterButtonOnHomePage() {

        registerButtonOnHomePage.click();
    }

    public void clickOnContactUsButtonOnHomePage() {
        scrollTo(contactUsButton);
        contactUsButton.click();
    }

    public void takeScreenshotOfSearchField(){

        takeElementScreenshot(searchField,"searchFieldScreenshot");
    }

    public void clickOnComputersCategory(){
        computersCategory.click();
    }

    public void clickOnElectronicsCategory(){
        electronicsCategory.click();
    }

    public void clickOnBooksCategory(){
        booksCategory.click();
    }

    public void clickOnJewelryCategory(){
        jewelryCategory.click();
    }

    public void clickOnGiftCardCategory(){
        giftCardCategory.click();
    }



}
