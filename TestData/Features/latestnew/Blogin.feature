Feature: feature to test DsAlgo logim page



 Scenario: Check the Sign in Link
    Given User is in the home page
    When user clicks on SignIn Link
    Then user navigated to the login Page
  
  Scenario: Check login is successful with invalid credentials.
    Given I go to the login page
    When user enters the Incorrect username and password
    And Clicks on login button
    Then user remains on login page
    And Invalid username error message is displayed
  
    
 
 		