Feature: feature to test DsAlgo logim page

  @login
  Scenario: Check login is successful with invalid credentials.
    Given I go to the login page
    When user enters the Incorrect username and password
    And Clicks on login button
    Then user remains on login page
    And Invalid username error message is displayed
  
    
 Scenario Outline: Check login  with valid credentials.
    Given I go to the login page
    When user inputs data from "<SheetName>" and <RowNum>
    And Clicks on login button
    Then user is navigated to the home page
 		
 		Examples:
 		|SheetName|RowNum|
 		|Sheet1|0|
 		|Sheet1|1|
 		|Sheet1|2|
 		