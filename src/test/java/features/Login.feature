Feature: As a registered user, I want to log in to the page so that I can order.

  Scenario: Log in as a user.
    Given I am in the register page
    And I click on start session button
    And I fill the email field in login page
    And I fill the password field in login page
    When I press the login button
    Then I land into the platform dashboard



