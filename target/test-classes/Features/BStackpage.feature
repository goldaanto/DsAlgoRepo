Feature: Feature to test the Stack page

  Background: 
    Given User is in the home page
    When user clicks the Stack Get Started button

  Scenario: Check the Stack page
    Given User is on Stack page
    When user clicks on Scroll down button of Stack page
    Then user is scroll down to the end of the Stack page

  Scenario: Check the Operations in Stack page
    Given User is on Stack page
    When User clicks on Operations in Stack Link
    Then User navigated to Operations in Stack Page

  Scenario: Check the Implementation page
    Given User is on Stack page
    When User clicks on Implementation Link
    Then User navigated to Implementation Page

  Scenario: Check the Applications page
    Given User is on Stack page
    When User clicks on Applications Link
    Then User navigated to Applications Page

    
  Scenario: Check the Operations in Stack page
    Given User is on Stack page
    And User clicks on Operations in Stack Link
    And User is on Operation Stack Page
    When User clicks on Sub Operations in Stack Link
    Then User navigated to Operations in Stack Page   
    

  Scenario: Check the Operations Implementation page
    Given User is on Stack page
    And User clicks on Implementation Link
    And User is on Operation Stack Page
    When User clicks on Sub Implementation Link
    Then User navigated to Implementation Page

  Scenario: Check the Operations in Applications page
    Given User is on Stack page
    And User clicks on Applications Link
    And User is on Operation Stack Page
    When User clicks on Sub Applications Link
    Then User navigated to Applications Page
    
    Scenario: Check the Operations in Applications page
    Given User is on Stack page
    And User clicks on Applications Link
    And User is on Operation Stack Page
    When User clicks on Sub Practice Link
    Then User navigated to Practice Page
    
    
    Scenario: Check the Operations in Stack page
    Given User is on Stack page
    And User clicks on Operations in Stack Link
    And User is on Operation Stack Page
    When User clicks on Sub Operations in Stack Link
    When User clicks on Sub Try Here link
    And User is on the Try Editor Page
    And User enters data from "<Sheet>" and <RowNum>
    And User clicks on Run button
    Then Statement will be executed and Result shown
    Examples: 
      | Sheet  | RowNum |
      | Sheet1 |      0 |
      
    

  Scenario: Check the Operations Implementation page
    Given User is on Stack page
    And User clicks on Implementation Link
    And User is on Operation Stack Page
    When User clicks on Sub Implementation Link
    When User clicks on Sub Try Here link
    And User is on the Try Editor Page
    And User enters data from "<Sheet>" and <RowNum>
    And User clicks on Run button
    Then Statement will be executed and Result shown
    Examples: 
      | Sheet  | RowNum |
      | Sheet1 |      0 |
    

  Scenario: Check the Operations in Applications page
    Given User is on Stack page
    And User clicks on Applications Link
    And User is on Operation Stack Page
    When User clicks on Sub Applications Link
    When User clicks on Sub Try Here link
    And User is on the Try Editor Page
    And User enters data from "<Sheet>" and <RowNum>
    And User clicks on Run button
    Then Statement will be executed and Result shown
    Examples: 
      | Sheet  | RowNum |
      | Sheet1 |      0 |
    
    