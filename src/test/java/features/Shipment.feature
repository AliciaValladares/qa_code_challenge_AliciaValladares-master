Feature: As a user, I want to save a future order as draft so that I can order it in the future.

  Scenario: Save a service as a draft shipment
    Given I am in the register page
    And I click on start session button
    And I fill the email
    And I fill the password
    And I press the login button
    And I land into the platform dashboard
    And I click in new deliver button
    And I set the origin city
    And I set the destination city
    And I set the weight
    And I set the weight
    And I set the length of the parcel
    And I set the width of the parcel
    And I set the height of the parcel
    And I click on get results button
    And I select the first option
    When I click on the save button
    Then The service has been save as a draft