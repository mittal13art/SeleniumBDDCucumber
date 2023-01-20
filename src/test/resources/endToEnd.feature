@endToEnd

Feature: End to end Functionality

  Scenario: Buy one product
    Given I am on the home page
    And I click on register button
    And I select gender "Female"
    And I enter following data for registration
      | first name | last name | email          | password | confirm password |
      | Mittal     | Thummar   | test@gmail.com | test@123 | test@123         |
    And I click on REGISTER button on register page
    And I click on the "Books"
    And I click on the add to cart button for Fahrenheit by Ray Bradbury
    And I click on shopping cart
    And I click to accept term and condition
    And I click on checkout button
    And I enter following details on checkout page
      | country        | city    | addressLine1     | postcode | phoneNumber |
      | United Kingdom | Swindon | 10 Coronel Close | SN3 4FW  | 07549079954 |
    And I click on continue button
    Then I should see Checkout Text
    And I click on continue button on shipping method
    And I select credit card
    And I click on continue button on payment method
    And I enter following details on the payment page
      | cardName  | cardNumber       | cardCode |
      | M THUMMAR | 4444333322221111 | 111      |
    And I click on continue button on payment information
    When I click on confirm button
    Then I should see "Thank you" text on confirmation page
    And I should see "Your order has been successfully processed!" text on confirmation page
    And the url should contain with "checkout/completed"

