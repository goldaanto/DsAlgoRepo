Feature: feature to test LinkedList page

Background:
Given User is in the home page 
    When user clicks the Linked Get Started button
    Then User navigated to LinkedList page 
   

Scenario: Test the Introduction Link

Given User is on LinkedList Page
When user clicks on Introduction link
Then user is navigated to Introduction page



Scenario: Test the Create Link

Given User is on LinkedList Page
When user clicks on Create LinkedList link
Then user is navigated to Create LinkedList page


Scenario: Test the TypesOf Link

Given User is on LinkedList Page
When user clicks on Types LinkedList link
Then user is navigated to Types LinkedList page



Scenario: Test the Implement Link

Given User is on LinkedList Page
When user clicks on Implement LinkedList link
Then user is navigated to Implement page

Scenario: Test the Traversal Link

Given User is on LinkedList Page
When user clicks on Traversal LinkedList link
Then user is navigated to Traversal page

Scenario: Test the Insert Link

Given User is on LinkedList Page
When user clicks on Insert LinkedList link
Then user is navigated to Insert page

Scenario: Test the Delete Link

Given User is on LinkedList Page
When user clicks on Delete LinkedList link
Then user is navigated to Delete page


Scenario: Test Introduction Page Introduction Link
Given User is on LinkedList Page
And  user clicks on Introduction link
And User is on LinkedList Introduction page
When user clicks on sub Introduction link
Then user is navigated to Introduction page

Scenario: Test Introduction Page Creating LinkedList Link
Given User is on LinkedList Page
And  user clicks on Introduction link
And User is on LinkedList Introduction page
When User clicks on sub creating LinkedList link
Then user is navigated to Create LinkedList page

Scenario: Test Introduction Page TyesOf LinkedList Link
Given User is on LinkedList Page
And  user clicks on Introduction link
And User is on LinkedList Introduction page
When User clicks on sub TypesOf LinkedList link
Then user is navigated to Types LinkedList page

Scenario: Test Introduction Page Implement Link
Given User is on LinkedList Page
And  user clicks on Introduction link
And User is on LinkedList Introduction page
When User clicks on sub Implement link
Then user is navigated to Implement page


Scenario: Test Introduction Page Traverse LinkedList Link
Given User is on LinkedList Page
And  user clicks on Introduction link
And User is on LinkedList Introduction page
When User clicks on Traverse sub LinkedList link
Then user is navigated to Traversal page

Scenario: Test Introduction Page Insert LinkedList Link
Given User is on LinkedList Page
And  user clicks on Introduction link
And User is on LinkedList Introduction page
When User clicks on sub Insert LinkedList link
Then user is navigated to Insert page

Scenario: Test Introduction Page Delete LinkedList Link
Given User is on LinkedList Page
And  user clicks on Introduction link
And User is on LinkedList Introduction page
When User clicks on sub Delete LinkedList link
Then user is navigated to Delete page

Scenario: Test Introduction Practise Question Link
Given User is on LinkedList Page
And  user clicks on Introduction link
And User is on LinkedList Introduction page
When User clicks on sub Linked Practise Question link
Then User navigated to Linked Practise Question page

Scenario Outline:
Given User is on LinkedList Page
And  user clicks on Introduction link
And User is on LinkedList Sub page
When  User clicks on sub Linked Try Here link 
And User is on the Try Editor Page
And User enters data from "<Sheet>" and <RowNum>
And User clicks on Run button
Then Statement will be executed and Result shown
 
 Examples:
 |Sheet|RowNum|
 |Sheet1|0|
 
 
 Scenario Outline:
Given User is on LinkedList Page
And user clicks on Create LinkedList link
And User is on LinkedList Sub page
When  User clicks on sub Linked Try Here link 
And User is on the Try Editor Page
And User enters data from "<Sheet>" and <RowNum>
And User clicks on Run button
Then Statement will be executed and Result shown
 
 Examples:
 |Sheet|RowNum|
 |Sheet1|0|

Scenario Outline:
Given User is on LinkedList Page
And user clicks on Types LinkedList link
And User is on LinkedList Sub page
When  User clicks on sub Linked Try Here link 
And User is on the Try Editor Page
And User enters data from "<Sheet>" and <RowNum>
And User clicks on Run button
Then Statement will be executed and Result shown
 
 Examples:
 |Sheet|RowNum|
 |Sheet1|0|

Scenario Outline:
Given User is on LinkedList Page
And user clicks on Implement LinkedList link
And User is on LinkedList Sub page
When  User clicks on sub Linked Try Here link 
And User is on the Try Editor Page
And User enters data from "<Sheet>" and <RowNum>
And User clicks on Run button
Then Statement will be executed and Result shown
 
 Examples:
 |Sheet|RowNum|
 |Sheet1|0|

 
 Scenario Outline:
Given User is on LinkedList Page
And user clicks on Traversal LinkedList link
And User is on LinkedList Sub page
When  User clicks on sub Linked Try Here link 
And User is on the Try Editor Page
And User enters data from "<Sheet>" and <RowNum>
And User clicks on Run button
Then Statement will be executed and Result shown
 
 Examples:
 |Sheet|RowNum|
 |Sheet1|0|
 
 Scenario Outline:
Given User is on LinkedList Page
And user clicks on Insert LinkedList link
And User is on LinkedList Sub page
When  User clicks on sub Linked Try Here link 
And User is on the Try Editor Page
And User enters data from "<Sheet>" and <RowNum>
And User clicks on Run button
Then Statement will be executed and Result shown
 
 Examples:
 |Sheet|RowNum|
 |Sheet1|0|
 
  Scenario Outline:
Given User is on LinkedList Page
And user clicks on Delete LinkedList link
And User is on LinkedList Sub page
When  User clicks on sub Linked Try Here link 
And User is on the Try Editor Page
And User enters data from "<Sheet>" and <RowNum>
And User clicks on Run button
Then Statement will be executed and Result shown
 
 Examples:
 |Sheet|RowNum|
 |Sheet1|0|