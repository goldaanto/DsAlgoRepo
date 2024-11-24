Feature: Test Tree page

  Background: 
    Given User is in the home page
    When user clicks the Tree Get Started button

  Scenario: Test Tree Overview Trees link
    Given User is on Tree page
    When User clicks on Tree Overview Link
    Then User navigated to Overview Trees Page

  Scenario: Test Tree Terminologies link
    Given User is on Tree page
    When User clicks on Terminologies Link
    Then User navigated to Terminologies Page

  Scenario: Test Tree Types Trees link
    Given User is on Tree page
    When User clicks on Types Trees Link
    Then User navigated to Types Trees Page

  Scenario: Test Tree Traversals link
    Given User is on Tree page
    When User clicks on Traversals Link
    Then User navigated to Traversal Page

  Scenario: Test Tree illustration link
    Given User is on Tree page
    When User clicks on Illustration Link
    Then User navigated to Illustration Page

  Scenario: Test Tree Binary Trees link
    Given User is on Tree page
    When User clicks on Binary tree Link
    Then User navigated to Binary Tree Page

  Scenario: Test Tree Types Binary Trees link
    Given User is on Tree page
    When User clicks on Types Binary Link
    Then User navigated to Types Binary Page

  Scenario: Test Tree Impl Python link
    Given User is on Tree page
    When User clicks on Impl Python Link
    Then User navigated to Impl Python Page

  Scenario: Test Tree Binary Traversals link
    Given User is on Tree page
    When User clicks on Binary Traversals Link
    Then User navigated to Binary Traversal Page

  Scenario: Test Tree Impl Binary Trees link
    Given User is on Tree page
    When User clicks on Impl Binary  TreesLink
    Then User navigated to Impl Binary Page

  Scenario: Test Tree Application Binary Tree link
    Given User is on Tree page
    When User clicks on Appl Binary tree Link
    Then User navigated to Application Binary Page

  Scenario: Test Tree Binary Search link
    Given User is on Tree page
    When User clicks on Binary Search Link
    Then User navigated to Binary Search Page

  Scenario: Test Tree Impl Binary Search link
    Given User is on Tree page
    When User clicks on Impl Binary  Search Link
    Then User navigated to Impl BinarySearch Page
    
    

  Scenario: Test  Overview Overview Trees link
    Given User is on Tree page
    And User clicks on Tree Overview Link
    And User is on Overview Tree page
    When User clicks on Tree Overview Link
    Then User navigated to Overview Trees Page

  Scenario: Test Overview Terminologies link
    Given User is on Tree page
    And User clicks on Tree Overview Link
    And User is on Overview Tree page
    When User clicks on Terminologies Link
    Then User navigated to Terminologies Page

  Scenario: Test Overview Types Trees link
    Given User is on Tree page
    And User clicks on Tree Overview Link
    And User is on Overview Tree page
    When User clicks on Types Trees Link
    Then User navigated to Types Trees Page

  Scenario: Test Overview Traversals link
    Given User is on Tree page
    And User clicks on Tree Overview Link
    And User is on Overview Tree page
    When User clicks on Traversals Link
    Then User navigated to Traversal Page

  Scenario: Test Overview illustration link
    Given User is on Tree page
    And User clicks on Tree Overview Link
    And User is on Overview Tree page
    When User clicks on Illustration Link
    Then User navigated to Illustration Page

  Scenario: Test Overview Binary Trees link
    Given User is on Tree page
    And User clicks on Tree Overview Link
    And User is on Overview Tree page
    When User clicks on Binary tree Link
    Then User navigated to Binary Tree Page

  Scenario: Test Overview Types Binary Trees link
    Given User is on Tree page
    And User clicks on Tree Overview Link
    And User is on Overview Tree page
    When User clicks on Types Binary Link
    Then User navigated to Types Binary Page

  Scenario: Test Overview Impl Python link
    Given User is on Tree page
    And User clicks on Tree Overview Link
    And User is on Overview Tree page
    When User clicks on Impl Python Link
    Then User navigated to Impl Python Page

  Scenario: Test Overview Binary Traversals link
    Given User is on Tree page
    And User clicks on Tree Overview Link
    And User is on Overview Tree page
    When User clicks on Binary Traversals Link
    Then User navigated to Binary Traversal Page

  Scenario: Test Overview Impl Binary Trees link
    Given User is on Tree page
    And User clicks on Tree Overview Link
    And User is on Overview Tree page
    When User clicks on Impl Binary  TreesLink
    Then User navigated to Impl Binary Page

  
  Scenario: Test Overview Application Binary Tree link
    Given User is on Tree page
    And User clicks on Tree Overview Link
    And User is on Overview Tree page
    When User clicks on Appl Binary tree Link
    Then User navigated to Application Binary Page

  Scenario: Test Overview Binary Search link
    Given User is on Tree page
    And User clicks on Tree Overview Link
    And User is on Overview Tree page
    When User clicks on Binary Search Link
    Then User navigated to Binary Search Page

  Scenario: Test Overview Impl Binary Search link
    Given User is on Tree page
    And User clicks on Tree Overview Link
    And User is on Overview Tree page
    When User clicks on Impl Binary  Search Link
    Then User navigated to Impl BinarySearch Page

  Scenario: Test Overview Impl Practice Question link
    Given User is on Tree page
    And User clicks on Tree Overview Link
    And User is on Overview Tree page
    When User clicks on Practice Questions Like
    Then User navigated to Practice  Page

  Scenario Outline: 
    Given User is on Tree page
    And User clicks on Tree Overview Link
    And User is on Overview Sub page
    When User clicks on sub Try Here link
    And User is on the Try Editor Page
    And User enters data from "<Sheet>" and <RowNum>
    And User clicks on Run button
    Then Statement will be executed and Result shown

    Examples: 
      | Sheet  | RowNum |
      | Sheet1 |      0 |

  Scenario Outline: 
    Given User is on Tree page
    And User clicks on Terminologies Link
    And User is on Overview Sub page
    When User clicks on sub Try Here link
    And User is on the Try Editor Page
    And User enters data from "<Sheet>" and <RowNum>
    And User clicks on Run button
    Then Statement will be executed and Result shown

    Examples: 
      | Sheet  | RowNum |
      | Sheet1 |      0 |
      
      Scenario Outline: 
    Given User is on Tree page
    And User clicks on Types Trees Link
    And User is on Overview Sub page
    When User clicks on sub Try Here link
    And User is on the Try Editor Page
    And User enters data from "<Sheet>" and <RowNum>
    And User clicks on Run button
    Then Statement will be executed and Result shown

    Examples: 
      | Sheet  | RowNum |
      | Sheet1 |      0 |
      

         Scenario Outline: 
    Given User is on Tree page
    And User clicks on Illustration Link
    And User is on Overview Sub page
    When User clicks on sub Try Here link
    And User is on the Try Editor Page
    And User enters data from "<Sheet>" and <RowNum>
    And User clicks on Run button
    Then Statement will be executed and Result shown

    Examples: 
      | Sheet  | RowNum |
      | Sheet1 |      0 |
      
            Scenario Outline: 
    Given User is on Tree page
    And User clicks on Binary tree Link
    And User is on Overview Sub page
    When User clicks on sub Try Here link
    And User is on the Try Editor Page
    And User enters data from "<Sheet>" and <RowNum>
    And User clicks on Run button
    Then Statement will be executed and Result shown

    Examples: 
      | Sheet  | RowNum |
      | Sheet1 |      0 |
      
             Scenario Outline: 
    Given User is on Tree page   
    And User clicks on Types Binary Link
    And User is on Overview Sub page
    When User clicks on sub Try Here link    
    And User is on the Try Editor Page
    And User enters data from "<Sheet>" and <RowNum>
    And User clicks on Run button
    Then Statement will be executed and Result shown

    Examples: 
      | Sheet  | RowNum |
      | Sheet1 |      0 |
      
             Scenario Outline: 
    Given User is on Tree page   
    And User clicks on Impl Binary  TreesLink
    And User is on Overview Sub page
    When User clicks on sub Try Here link    
    And User is on the Try Editor Page
    And User enters data from "<Sheet>" and <RowNum>
    And User clicks on Run button
    Then Statement will be executed and Result shown

    Examples: 
      | Sheet  | RowNum |
      | Sheet1 |      0 |
      
      
               Scenario Outline: 
    Given User is on Tree page   
    And User clicks on Impl Python Link
    And User is on Overview Sub page
    When User clicks on sub Try Here link    
    And User is on the Try Editor Page
    And User enters data from "<Sheet>" and <RowNum>
    And User clicks on Run button
    Then Statement will be executed and Result shown

    Examples: 
      | Sheet  | RowNum |
      | Sheet1 |      0 |
      
               Scenario Outline: 
    Given User is on Tree page   
    And User clicks on Appl Binary tree Link
    And User is on Overview Sub page
    When User clicks on sub Try Here link    
    And User is on the Try Editor Page
    And User enters data from "<Sheet>" and <RowNum>
    And User clicks on Run button
    Then Statement will be executed and Result shown

    Examples: 
      | Sheet  | RowNum |
      | Sheet1 |      0 |
      
               Scenario Outline: 
    Given User is on Tree page   
    And User clicks on Binary Search Link
    And User is on Overview Sub page
    When User clicks on sub Try Here link    
    And User is on the Try Editor Page
    And User enters data from "<Sheet>" and <RowNum>
    And User clicks on Run button
    Then Statement will be executed and Result shown

    Examples: 
      | Sheet  | RowNum |
      | Sheet1 |      0 |
      
                   Scenario Outline: 
    Given User is on Tree page   
    And User clicks on Impl Binary  Search Link
    And User is on Overview Sub page
    When User clicks on sub Try Here link    
    And User is on the Try Editor Page
    And User enters data from "<Sheet>" and <RowNum>
    And User clicks on Run button
    Then Statement will be executed and Result shown

    Examples: 
      | Sheet  | RowNum |
      | Sheet1 |      0 |