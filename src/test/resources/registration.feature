
Feature: Registration feature
  As a customer
  I want to register

  @register

  Scenario: Registration with mandatory valid data
    Given  I am on the home page
    And I click on register button
    When I enter first name "a"
    And I enter lastname "b"
    And I enter valid email on register page "test@gmail.com"
    And I enter valid password on register page "123456"
    And I enter confirm password on register page "123456"
    And I click on REGISTER button on register page
    Then I should see text Your registration completed
    And I should see logout button displayed
    And I should see "/registerresult" in URL
    And I should see My account button displayed

