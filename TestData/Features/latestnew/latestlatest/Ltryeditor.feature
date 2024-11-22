Feature: Test the TryEditor Page

Scenario: User enter the statement and Execute
 Given User is on the Try Editor Page
 When User enters data from "<Sheet>" and <RowNum>
 And User clicks on Run button
 Then Statement will be executed and Result shown
 
 Examples:
 |Sheet|RowNum|
 |Sheet1|0|
 |Sheet1|1|
 |Sheet1|2|
 