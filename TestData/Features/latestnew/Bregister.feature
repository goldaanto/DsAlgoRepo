Feature: Testing the Registration File



 
Scenario Outline: Test the Registration Page
  
    Given I go to the Registration page
    When user enter "goldaanto@yahoo.com", "Yahoo@123","Yahoo@123"
    And Clicks on Submit button
    Then user  navigated to the home page


 

    