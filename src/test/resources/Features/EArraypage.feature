Feature: Feature to test the array page

  Background: 
    Given User is in the home page
    When user clicks the Array Get Started button

  Scenario: Check the Array page
    Given User is on Array page
    When user clicks on Scroll down button of array page
    Then user is scroll down to the end of the array page

  Scenario: Check the Array in python page
    Given User is on Array page
    When User clicks on Arrays in Python Link
    Then User navigated to Arrays in Python Page

  Scenario: Check the Array using list page
    Given User is on Array page
    When User clicks on Arrays Using List Link
    Then User navigated to Arrays Using List Page

  Scenario: Check the Basic Operations in Lists page
    Given User is on Array page
    When User clicks on Basic Operations in Lists Link
    Then User navigated to Basic Operations in Lists Page

  Scenario: Check the Applications of Array page
    Given User is on Array page
    When User clicks on Applications of Array Link
    Then User navigated to Applications of Array Page

  Scenario: Test Sub Array Page Arrays in Python Link
    Given User is on Array page
    And User clicks on Arrays in Python Link
    And User is on Sub Array page
    When User clicks on Sub Arrays in Python Link
    Then User navigated to Arrays in Python Page

  Scenario Outline: 
    Given User is on Array page
    And User clicks on Arrays in Python Link
    And User is on Sub Array page
    When User clicks on Sub Arrays in Python Link
    When User clicks on Arrays Phython Try Here link
    And User is on the Try Editor Page
    And User enters data from "<Sheet>" and <RowNum>
    And User clicks on Run button
    Then Statement will be executed and Result shown

    Examples: 
      | Sheet  | RowNum |
      | Sheet1 |      0 |
      
   

  Scenario: Test Implement Queue Page Implement DeQue Link
    Given User is on Array page
    And User clicks on Arrays in Python Link
    And User is on Sub Array page
    When User clicks on Sub Arrays Using List Link
    Then User navigated to Arrays Using List Page
    
    
     Scenario Outline: 
    Given User is on Array page
    And User clicks on Arrays in Python Link
    And User is on Sub Array page
    And User clicks on Sub Arrays Using List Link
    When User clicks on Arrays Using Try Here link
    And User is on the Try Editor Page
    And User enters data from "<Sheet>" and <RowNum>
    And User clicks on Run button
    Then Statement will be executed and Result shown

    Examples: 
      | Sheet  | RowNum |
      | Sheet1 |      0 |

  Scenario: Test Implement Queue Page Implement Array Link
    Given User is on Array page
    And User clicks on Arrays in Python Link
    And User is on Sub Array page
    When User clicks on Sub Basic Operations in Lists Link
    Then User navigated to Basic Operations in Lists Page
    
     Scenario Outline: 
    Given User is on Array page
    And User clicks on Arrays in Python Link
    And User is on Sub Array page
    And User clicks on Sub Basic Operations in Lists Link
    When User clicks on Basic Operations Try Here link
    And User is on the Try Editor Page
    And User enters data from "<Sheet>" and <RowNum>
    And User clicks on Run button
    Then Statement will be executed and Result shown

    Examples: 
      | Sheet  | RowNum |
      | Sheet1 |      0 |
    

  Scenario: Test Implement  Page Implement Queue Opt Link
    Given User is on Array page
    And User clicks on Arrays in Python Link
    And User is on Sub Array page
    When User clicks on Sub Applications of Array Link
    Then User navigated to Applications of Array Page
    
     Scenario Outline: 
    Given User is on Array page
    And User clicks on Arrays in Python Link
    And User is on Sub Array page
    When User clicks on Sub Applications of Array Link
    When User clicks on Application Array Try Here link
    And User is on the Try Editor Page
    And User enters data from "<Sheet>" and <RowNum>
    And User clicks on Run button
    Then Statement will be executed and Result shown

    Examples: 
      | Sheet  | RowNum |
      | Sheet1 |      0 |
