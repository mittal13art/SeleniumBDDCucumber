@login @regression
Feature: login feature
  As a customer
  I want to login to the login functionality so I can check my log in details.

  Background:
    Given I am on the home page
    When I click on the log in button

  Scenario: validate login page
    Then I should see "Welcome, Please Sign In!" text on the log in page
    And I should see text "/login" in url

  Scenario Outline:  login with valid credential
#    Scenario Outline can be use when having different data, so you don't need to create another scenario to test
    And I enter valid email "<email>"
    And I enter valid password "<password>"
    And I click on the log in button on login page
#    Then I should see logout button displayed
    Examples:
      | email            | password |
      | test1@gmail.com   | 123456   |
      | mittal@gmail.com | 123456   |
      | hiren@gmail.com | 123456   |

  Scenario: login with invalid credential
    And I enter invalid email "abc"
    And I click on password input field on login page
    Then I should see text "Wrong email" under email input box
