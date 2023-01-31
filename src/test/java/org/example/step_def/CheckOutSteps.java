package org.example.step_def;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.CheckOutPage;

import java.util.List;
import java.util.Map;

public class CheckOutSteps extends DriverManager {

    DriverManager driverManager = new DriverManager();
    CheckOutPage checkOutPage = new CheckOutPage();
    List<Map<String, String>> data;

    @And("^I enter following details on checkout page$")
    public void iEnterFollowingDetailsOnCheckoutPage(DataTable dataTable) throws Throwable{
        data = dataTable.asMaps(String.class, String.class);
                checkOutPage.selectCountry(data.get(0).get("country"));
                checkOutPage.enterCityName(data.get(0).get("city"));
                checkOutPage.enterAddress(data.get(0).get("addressLine1"));
                checkOutPage.enterPostalCode(data.get(0).get("postalCode"));
                checkOutPage.enterPhoneNumber(data.get(0).get("phoneNumber"));
   }

    @And("^I enter following log in details$")
    public void iEnterFollowingLogInDetails(DataTable dataTable) throws Throwable{
        data = dataTable.asMaps(String.class, String.class);
        checkOutPage.enterLogInDetails(
                data.get(0).get("email"),
                data.get(0).get("password")
        );
    }

    @And("^I click on continue button on billing page$")
    public void iClickOnContinueButtonOnBillingPage() {
        checkOutPage.clickContinueButtonBillingMethod();
    }

    @And("^I click on continue button on shipping method$")
    public void iClickOnContinueButtonOnShippingMethod() {
        checkOutPage.clickContinueButtonShippingMethod();
    }

    @And("^I select credit card$")
    public void iSelectCreditCard() {
        checkOutPage.clickCreditCardRadioBtn();
    }

    @And("^I click on continue button on payment method$")
    public void iClickOnContinueButtonOnPaymentMethod() {
        checkOutPage.clickContinueButtonPaymentMethod();
    }

    @And("^I select credit card Type$")
    public void iSelectCreditCardType() {
        checkOutPage.selectCardType();
    }

    @And("^I enter following details on the payment page$")
    public void iEnterFollowingDetailsOnThePaymentPage(DataTable dataTable) throws Throwable {
        data = dataTable.asMaps(String.class, String.class);
        System.out.println(data);

        checkOutPage.selectCardType();
        checkOutPage.enterCardHolderName("cardHolderName");
        checkOutPage.enterCardNumber("cardNumber");
        checkOutPage.selectMonthFromDropDown();
        checkOutPage.selectYearFromDropDown();
        checkOutPage.enterCardCode("cardCode");

    }


    @And("^I click on the log in button on checkout page$")
    public void iClickOnTheLogInButtonOnCheckoutPage() {
        checkOutPage.clickLogInButtonOnCheckoutPage();
    }


    @And("^I click on continue button on payment information$")
    public void iClickOnContinueButtonOnPaymentInformation() {
        checkOutPage.clickContinueButtonPaymentInfo();
    }

    @When("^I click on confirm button on checkout page$")
    public void iClickOnConfirmButtonOnCheckoutPage() {
        checkOutPage.clickConfirmButtonForCheckout();
    }
}
