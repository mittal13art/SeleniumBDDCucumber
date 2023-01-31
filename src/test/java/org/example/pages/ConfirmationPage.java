package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmationPage extends DriverManager {

    @FindBy(xpath = "//h1[contains(text(), 'Thank you')]")
    WebElement thankYouText;

    @FindBy(xpath = "//strong[contains(text(), 'Your order has been successfully processed!')]")
    WebElement confirmationText;

    @FindBy(xpath = "//button[contains(text(), 'Continue')]")
    WebElement continueButtonOnConfirmationPage;

    public String getConfirmationText(){
        return confirmationText.getText();
    }

    public String getThankYouText(){
        return thankYouText.getText();
    }


}
