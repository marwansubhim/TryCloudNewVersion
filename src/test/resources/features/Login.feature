@login
Feature: Login feature

  Agile story: as a user when i navigate to the tryCloud url in the browser, i should be able to see the login page
  and the title should be TryCloud

  Scenario: Navigating to the tryCloud URL
    Given I am on the login page
    Then The title should be "Trycloud"


  Scenario: To be able to login successfully

    Given I am on the login page
    When I enter correct username in username input box
    And I enter correct password in input box
    And I click the login button
    Then I should be able to login successfully and land on the dashboard page and title should contain "Dashboard - Trycloud"
