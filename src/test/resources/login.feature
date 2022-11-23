@login
Feature: login feature
  As a customer
  I want to login to the login functionality so I can check my log in details.

  Scenario: validate login page
    Given I am on the home page
    When I click on the log in button
    Then I should see "Welcome, Please Sign In!" text on the log in page
    And I should see text "/login" in url

  Scenario:  login with valid credential
    Given I am on the home page
    When I click on the log in button
    And I enter valid email "test@gmail.com"
    And I enter valid password "123456"
    And I click on the log in button on login page
    Then I should see logout button displayed

  Scenario: login with invalid credential
    Given I am on the home page
    When I click on the log in button
    And I enter invalid email "abc"
    And I click on password input field on login page
    Then I should see text "Wrong email" under email input box
