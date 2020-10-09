Feature: As a user, I want to register myself in the platform so that I can order.

  Scenario: Register a user.
    Given I am in the register page
    And I fill the email
    And I fill the password
    And I fill amount of order sent field
    And I fill products sold through field
    And I fill main shop field
    And I fill telephone number field
    And I accept the terms
    And I authorize packlink to sent me info
    When I click on the register button
    Then I land into the platform dashboard