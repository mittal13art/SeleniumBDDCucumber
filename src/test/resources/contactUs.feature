@contactUs @regression
Feature: contact us feature
  As a customer
  I want to use contact us feature

  Scenario: validate contact us page
    Given I am on the home page
    When I click on the contact us button on home page
    Then I should see "Contact Us" text on the contact us page
    And I should see text "/contactus" in url
