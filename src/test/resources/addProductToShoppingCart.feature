@addProductToShoppingCart
  Feature: Add product to shopping cart

    @MyTest
    Scenario: Add product to the basket
      Given I am on the home page
      When I click on Books category on home page
      And I click on chosen product from books list page
      And I click on add to cart button
      And I click on close button
      And I click on shopping cart link
      Then I should see product name on shopping cart page
#      And I should see "Shopping cart" text on the shopping cart page



