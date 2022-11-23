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

    @FindBy(xpath = "//a[@class='ico-register']" )
    WebElement registerButtonOnHomePage;

    public String getTextFromHomePage(){

        return textOnHomePage.getText();
    }

    public void clickOnLogInButtonOnHomePage(){

        logInButtonOnHomePage.click();
    }
    public void clickOnRegisterButtonOnHomePage() {

        registerButtonOnHomePage.click();
    }

}
