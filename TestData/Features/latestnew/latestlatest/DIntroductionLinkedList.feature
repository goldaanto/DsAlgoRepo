Feature: Test Introduction Linked list page

Scenario: Test Introduction Page Introduction Link
Given User is on LinkedList Introduction page
When user clicks on sub Introduction link
Then user is navigated to Introduction page

Scenario: Test Introduction Page Creating LinkedList Link
Given User is on LinkedList Introduction page
When User clicks on sub creating LinkedList link
Then user is navigated to Create LinkedList page

Scenario: Test Introduction Page TyesOf LinkedList Link
Given User is on LinkedList Introduction page
When User clicks on sub TypesOf LinkedList link
Then user is navigated to Types LinkedList page

Scenario: Test Introduction Page Implement Link
Given User is on LinkedList Introduction page
When User clicks on sub Implement link
Then user is navigated to Implement page


Scenario: Test Introduction Page Traverse LinkedList Link
Given User is on LinkedList Introduction page
When User clicks on Traverse sub LinkedList link
Then user is navigated to Traversal page

Scenario: Test Introduction Page Insert LinkedList Link
Given User is on LinkedList Introduction page
When User clicks on sub Insert LinkedList link
Then user is navigated to Insert page

Scenario: Test Introduction Page Delete LinkedList Link
Given User is on LinkedList Introduction page
When User clicks on sub Delete LinkedList link
Then user is navigated to Delete page

Scenario: Test Introduction Practise Question Link
Given User is on LinkedList Introduction page
When User clicks on sub Practise Question link
Then User navigated to Practise Question page

Scenario: Test Introduction Try Here Link

Given User is on LinkedList Introduction page
When User clicks on sub Try Here link
Then User navigated to Try Editor page

Scenario Outline:
Given User is on the Try Editor Page 
And User enters data from "<Sheet>" and <RowNum>
And User clicks on Run button
Then Statement will be executed and Result shown
 
 Examples:
 |Sheet|RowNum|
 |Sheet1|0|
 |Sheet1|1|
 |Sheet1|2|
