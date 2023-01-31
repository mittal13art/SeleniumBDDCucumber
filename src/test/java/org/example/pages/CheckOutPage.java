package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends DriverManager {

    @FindBy(id = "Email")
    WebElement emailInput;
    @FindBy(id = "Password")
    WebElement passwordInput;

    @FindBy(xpath = "//button[@class='button-1 login-button']")
    WebElement logInButtonOnCheckoutPage;
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement countrySelection;
    @FindBy(id = "BillingNewAddress_City")
    WebElement cityInputBox;
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement addressInputBox;
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postalCodeInputBox;
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumberInputBox;
    @FindBy(xpath = "//*[@class='button-1 new-address-next-step-button']")
    WebElement continueButtonBillingMethod;
    @FindBy(xpath = "//*[@class='button-1 shipping-method-next-step-button']")
    WebElement continueButtonShippingMethod;
    @FindBy(id = "paymentmethod_1")
    WebElement creditCardRadioBtn;
    @FindBy(xpath = "//*[@class='button-1 payment-method-next-step-button']")
    WebElement continueButtonPaymentMethod;

    @FindBy(xpath = "//*[@class='button-1 payment-info-next-step-button']")
    WebElement continueButtonPaymentInfo;
    @FindBy(xpath = "//*[@class='button-1 confirm-order-next-step-button']")
    WebElement confirmButtonCheckout;
    @FindBy(id = "CreditCardType")
    WebElement creditCardTypeDropDown;
    @FindBy(id = "CardholderName")
    WebElement cardholderNameInputBox;
    @FindBy(id = "CardNumber")
    WebElement cardNumberInputBox;
    @FindBy(id = "CardCode")
    WebElement cardCodeInputBox;
    @FindBy(id = "ExpireMonth")
    WebElement selectMonth;
    @FindBy(id = "ExpireYear")
    WebElement selectYear;

    @FindBy(xpath = "//*[@class='page-title']/h1")
    WebElement thankYouTextAfterCheckoutCompleted;


    public void enterLogInDetails(String email, String password){
        emailInput.clear();
        emailInput.sendKeys(email);
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void clickLogInButtonOnCheckoutPage(){
        logInButtonOnCheckoutPage.click();
    }

//    public void enterFollowingDetailsOnCheckoutPage(String city,String address,String postalCode,String phoneNumber){
//        cityInputBox.sendKeys(city);
//        addressInputBox.clear();
//        addressInputBox.sendKeys(address);
//        postalCodeInputBox.clear();
//        postalCodeInputBox.sendKeys(postalCode);
//        phoneNumberInputBox.clear();
//        phoneNumberInputBox.sendKeys(phoneNumber);
//    }

    public void selectCountry(String country){
        Select select = new Select(countrySelection);
        select.selectByVisibleText(country);
    }

   public void enterCityName(String city){
       cityInputBox.sendKeys(city);
   }

    public void enterAddress(String address){
        addressInputBox.sendKeys(address);
    }

    public void enterPostalCode(String postalCode){
        postalCodeInputBox.sendKeys(postalCode);
    }

    public void enterPhoneNumber(String phoneNumber){
        phoneNumberInputBox.sendKeys(phoneNumber);
    }

    public void clickContinueButtonBillingMethod(){
        continueButtonBillingMethod.click();
    }
    public void clickContinueButtonShippingMethod(){
        continueButtonShippingMethod.click();
    }

    public void clickCreditCardRadioBtn(){
        creditCardRadioBtn.click();
    }

    public void clickContinueButtonPaymentMethod(){
        continueButtonPaymentMethod.click();
    }

    public void clickContinueButtonPaymentInfo(){
        continueButtonPaymentInfo.click();
    }

    public void clickConfirmButtonForCheckout(){
        confirmButtonCheckout.click();
    }

    public void selectCardType(){
       Select select = new Select(creditCardTypeDropDown);
       select.selectByValue("visa");
    }

    public void enterCardHolderName(String cardHolderName){
        cardholderNameInputBox.sendKeys(cardHolderName);
    }

    public void enterCardNumber(String cardNumber){
        cardNumberInputBox.sendKeys(cardNumber);
    }

    public void selectMonthFromDropDown(){
        Select select = new Select(selectMonth);
        select.selectByValue("7");
    }
    public void selectYearFromDropDown(){
       Select select = new Select(selectYear);
       select.selectByValue("2025");
    }

    public void enterCardCode(String cardCode){
        cardCodeInputBox.sendKeys(cardCode);
    }

    }



