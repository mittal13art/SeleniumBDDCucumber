@login
Feature: login feature
  As a customer
  I want to login to the login functionality so I can check my log in details.

  Scenario: login with valid credential
    Given I am on the home page
    When I click on the log in button
    Then I should see "Welcome, Please Sign In!" text on the log in page