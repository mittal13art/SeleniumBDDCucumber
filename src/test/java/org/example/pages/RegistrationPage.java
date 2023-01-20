package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends DriverManager {

    @FindBy(id = "gender-female")
    WebElement genderFemale;

    @FindBy(xpath = "//input[@data-val-required='First name is required.']")
    WebElement firstNameInputBox;

    @FindBy(id = "LastName")
    WebElement lastNameInputBox;

    @FindBy(xpath = "//input[@data-val-required='Email is required.']")
    WebElement emailInputBoxOnRegistrationPage;

    @FindBy(xpath = "//input[@data-val-required='Password is required.']")
    WebElement passwordInputBoxOnRegistrationPage;

    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordInputBox;

    @FindBy(id = "register-button")
    WebElement registerButtonOnRegistrationPage;

    @FindBy(xpath = "//div[@class='result']")
    WebElement resultAfterRegistration;

    @FindBy(xpath = "//a[@class='ico-logout']")
    WebElement logoutButtonOnRGPage;

    @FindBy(xpath = "//a[@class='ico-account']")
    WebElement myAccountButtonDisplayed;

    @FindBy(xpath = "//a[@href='/books']")
    WebElement booksCategory;


    public void enterRegistrationDetails(String firstName,String lastName, String emailOnRGPage, String passwordOnRGPage, String confirmPassword) {

        firstNameInputBox.clear();
        firstNameInputBox.sendKeys(firstName);
        lastNameInputBox.clear();
        lastNameInputBox.sendKeys(lastName);
        emailInputBoxOnRegistrationPage.clear();
        int myRandomNumber = generateRandomNumber();
        emailInputBoxOnRegistrationPage.sendKeys(myRandomNumber+emailOnRGPage);
        passwordInputBoxOnRegistrationPage.clear();
        passwordInputBoxOnRegistrationPage.sendKeys(passwordOnRGPage);
        confirmPasswordInputBox.clear();
        confirmPasswordInputBox.sendKeys(confirmPassword);
    }

//    public void enterLastName(String lastName) {
//
//        lastNameInputBox.sendKeys(lastName);
//    }
//
//    public void enterEmailOnRGPage(String emailOnRGPage) {
//
//        emailInputBoxOnRegistrationPage.sendKeys(emailOnRGPage);
//    }
//
//    public void enterPasswordOnRGPage(String passwordOnRGPage) {
//        passwordInputBoxOnRegistrationPage.sendKeys(passwordOnRGPage);
//    }
//
//    public void enterConfirmPassword(String confirmPassword) {
//
//        confirmPasswordInputBox.sendKeys(confirmPassword);
//    }

    public void clickOnRegisterButtonOnRegistrationPage() {

        registerButtonOnRegistrationPage.click();
    }


    public boolean iShouldSeeResultAfterRegistrationCompleted() {
        return resultAfterRegistration.isDisplayed();

    }

    public boolean iShouldSeeMyAccountButtonDisplayed() {

        return myAccountButtonDisplayed.isDisplayed();
    }

    public void clickOnGenderOnRegistrationPage() {

        genderFemale.click();
    }

    public void clickOnBooksCategory() {
        booksCategory.click();
    }


}