Feature: Test Queue page

  Background: 
    Given User is in the home page
    When user clicks the Queue Get Started button

  Scenario: Test Queue Page Implement Queue Link
    Given User is on Queue page
    When User clicks on Implement Queue link
    Then User navigated to Implementation Queue page

  Scenario: Test Queue Page Implement DeQue Link
    Given User is on Queue page
    When User clicks on Implement DeQue link
    Then User navigated to Implementation Collection page

  Scenario: Test Queue Page Implement Array Link
    Given User is on Queue page
    When User clicks on Implement Array link
    Then User navigated to Implement Array page

  Scenario: Test Queue Page Implement Queue Link
    Given User is on Queue page
    When User clicks on Queue Operation link
    Then User navigated to  Queue Operation page

  Scenario: Test Implement Queue Page Implement Queue Link
    Given User is on Queue page
    And User clicks on Implement Queue link
    And User is on Implement Queue page
    When User clicks on Implement Queue link
    Then User navigated to Implementation Queue page

  Scenario: Test Implement Queue Page Implement DeQue Link
    Given User is on Queue page
    And User clicks on Implement Queue link
    And User is on Implement Queue page
    When User clicks on Implement DeQue link
    Then User navigated to Implementation Collection page

  Scenario: Test Implement Queue Page Implement Array Link
    Given User is on Queue page
    And User clicks on Implement Queue link
    And User is on Implement Queue page
    When User clicks on Implement Array link
    Then User navigated to Implement Array page

  Scenario: Test Implement  Page Implement Queue Opt Link
    Given User is on Queue page
    And User clicks on Implement Queue link
    And User is on Implement Queue page
    When User clicks on Queue Operation link
    Then User navigated to  Queue Operation page

  Scenario: Test Implement  Page Practise Test Link
    Given User is on Queue page
    And User clicks on Implement Queue link
    And User is on Implement Queue page
    When User clicks on Queue Practise Test link
    Then User navigated to Queue Practise Test page

  Scenario Outline: 
    Given User is on Queue page
    And User clicks on Implement Queue link
    And User is on Queue Sub page
    When User clicks on Queue Try Here link
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

  Scenario Outline: 
    Given User is on Queue page
    And User clicks on Implement DeQue link
    And User is on Queue Sub page
    When User clicks on Queue Try Here link
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

  Scenario Outline: 
    Given User is on Queue page
    And User clicks on Implement Array link
    And User is on Queue Sub page
    When User clicks on Queue Try Here link
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

  Scenario Outline: 
    Given User is on Queue page
    And User clicks on Queue Operation link
    And User is on Queue Sub page
    When User clicks on Queue Try Here link
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
