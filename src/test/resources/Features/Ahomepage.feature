
Feature: feature to test the home page

@create
Scenario: Check the Register Link
    Given User is in the home page
    When user clicks on Register Link
    Then user navigated to the Register Page
    
    Scenario Outline: Test the Registration Page
  
    Given I go to the Registration page
    When user get data from "<sheetname>", <Rownum>
    And Clicks on Submit button
    Then user  navigated to the home page
    
    Examples:
    |sheetname|Rownum|
    |Sheet1|0|
    |Sheet1|1|
    |Sheet1|2|
      
    
  Scenario: Check the Sign in Link
    Given User is in the home page
    When user clicks on SignIn Link
    Then user navigated to the login Page
    
    
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
     
    
   