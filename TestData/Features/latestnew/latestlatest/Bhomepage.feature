
Feature: feature to test the home page
    
   Scenario: Check the Data Structure Drop down
    Given the user is in the Home page
    When the user clicks on the Data Structure Dropdown icon
    Then User will view six different types of data structures lists
   
  Scenario: Check get started button of Data Structure - intro tab.
    Given User is in the home page 
    When user clicks the Get Started button
    Then user receives a error message
    
    
    Scenario: Check the Sign in Link
    Given User is in the home page
    When user clicks on SignIn Link
    Then user navigated to the login Page
    
    Scenario: Check get started button of Data Structure - intro tab.
    Given User is in the home page 
    When user clicks the DataStruct Get Started button
     Then User navigated to DataStruct page
    
   Scenario: Check get started button of Array tab.
    Given User is in the home page 
    When user clicks the Array Get Started button
    Then User navigated to array page
    
    Scenario: Check get started button of Linked List tab.
    Given User is in the home page 
    When user clicks the Linked Get Started button
    Then User navigated to LinkedList page
    
    Scenario: Check get started button of Stack  tab.
    Given User is in the home page 
    When user clicks the Stack Get Started button
    Then User navigated to Stack page
    
    Scenario: Check get started button of Queue tab.
    Given User is in the home page 
    When user clicks the Queue Get Started button
    Then User navigated to Tree page
    
    Scenario: Check get started button of tree tab.
    Given User is in the home page 
    When user clicks the Tree Get Started button
    Then User navigated to Tree page
    
    Scenario: Check get started button of graph tab.
    Given User is in the home page 
    When user clicks the Graph Get Started button
    Then User navigated to Graph page