Feature: Test the Graph page

Background: 
    Given User is in the home page 
    When user clicks the Graph Get Started button

  Scenario: Test Graph page Graph link
    Given User is on Graph Page
    When User clicks on Graph link
    Then User navigated to Graph page

  Scenario: Test Graph page Graph Represent link
    Given User is on Graph Page
    When User clicks on Graph Represent link
    Then User navigated to Graph Represent page



  Scenario: Test Sub Graph page Graph link
  	Given User is on Graph Page
    And User clicks on Graph link
    When User clicks on Sub Graph link
    Then User navigated to Graph page   

  Scenario: Test Sub Graph page Graph Represent link
   	Given User is on Graph Page
    And User clicks on Graph Represent link
    When User clicks on Sub Graph Represent link
    Then User navigated to Graph Represent page

  Scenario: Test Sub Graph Page Practise Test Link
    Given User is on Graph Page
    And User clicks on Graph link
    When User clicks on Graph Practise Test link
    Then User navigated to Graph Practise Test page

   
    
     Scenario Outline:
Given User is on Graph Page
And User clicks on Graph link
And User is on Sub Graph Page
And User clicks on Sub Graph Represent link
When User clicks on Graph Try Here link

And User enters graph data from "<Sheet>" and <RowNum>
And User clicks on  graph Run button
Then graph Statement will be executed and Result shown
 
 Examples:
 |Sheet|RowNum|
 |Sheet1|0|

  
       Scenario Outline:
Given User is on Graph Page
And User clicks on Graph Represent link
And User is on Sub Graph Page
And User clicks on Sub Graph Represent link
When User clicks on Graph Represent Try Here link
And User enters graph data from "<Sheet>" and <RowNum>
And User clicks on graph Run button
Then graph Statement will be executed and Result shown
 
 Examples:
 |Sheet|RowNum|
 |Sheet1|0|
  
    
    
   