@LoginFeature
Feature: Techfios Other billing login page functionality validation

  Background: 
    Given User is on the techfios login page

  Scenario Outline: User should be able to login with valid credentials
    and open a new account

    When User enters the "<username>" in the "username" field
    When User enters the "<password>" in the "password" field
    And User clicks on "login"
    Then User should land on Dashboard page


    Examples: 
      | username          | password | 
      | demo@techfios.com | abc123   | 
