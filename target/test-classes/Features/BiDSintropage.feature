Feature: feature to test the DSintro page

Background: 
		Given User is in the home page 
    When user clicks the DataStruct Get Started button
 
Scenario: Test the Scroll down 
Given User is on dsintro Page
When user clicks on Scroll down button
Then user is scroll down to the end of the  page

Scenario: Test the Time Complexity Link
Given User is on dsintro Page
When user clicks on TimeComplexity link
Then user is navigated to Time Complexity page


Scenario: Test the Practice link
Given User is on dsintro Page
And user clicks on TimeComplexity link

And  User is on Time Complexity page 
When user clicks on Create Practice Questions link
Then user is navigated to Practice Questions page


Scenario: Test the Try Editor link
Given User is on dsintro Page
And user clicks on TimeComplexity link

And  User is on Time Complexity page 
When user clicks on TryHere link
And User is on the Try Editor Page
    And User enters data from "<Sheet>" and <RowNum>
    And User clicks on Run button
    Then Statement will be executed and Result shown

    Examples: 
      | Sheet  | RowNum |
      |Sheet1|0|
 |Sheet1|1|
 |Sheet1|2|
 |Sheet1|3|

   