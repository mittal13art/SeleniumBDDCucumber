package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DriverManager {
    @FindBy(xpath = "//*[text()='Welcome, Please Sign In!']")
    WebElement welcomeTextOnLogInPage;

    @FindBy(id = "Email")
    WebElement emailInputField;

    @FindBy(id = "Password")
    WebElement passwordInputField;

    @FindBy(className = "login-button")
    WebElement logInButtonOnLogInPage;

    @FindBy(xpath = "//a[@href='/logout']")
    WebElement logOutButton;

    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailErrorText;


    public String getWelcomeTextFromLogInPage() {

        return welcomeTextOnLogInPage.getText();
    }

    public void enterEmailID(String email) {

        emailInputField.sendKeys(email);
    }

    public void enterPassword(String password) {

        passwordInputField.sendKeys(password);
    }

    public void clickOnLogInButtonOnLogInPage() {

        logInButtonOnLogInPage.click();
    }

    public boolean logoutButtonDisplayed() {
        return logOutButton.isDisplayed();
    }

    public void enterInvalidEmail(String invalidEmail) {

        emailInputField.sendKeys(invalidEmail);
    }

    public void clickOnPasswordInputField() {
        passwordInputField.click();
    }


    public String textUnderEmailInputBox() {
        return emailErrorText.getText();
    }


}