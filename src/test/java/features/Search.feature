Feature: As a user, I want to look for a product so that I can order it.

  Scenario: Search different services.
    Given I am in the register page
    And I click on start session button
    And I fill the email field in login page
    And I fill the password field in login page
    And I press the login button
    And I land into the platform dashboard
    When I click in new deliver button
    And I set the origin city
    And I set the destination city
    And I set the weight
    And I set the length of the parcel
    And I set the width of the parcel
    And I set the height of the parcel
    And I click on get results button
    Then I select the first option

