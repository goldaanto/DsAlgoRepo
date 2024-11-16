Feature: Test the Graph page

  Scenario: Test Graph page Graph link
    Given User is on Graph Page
    When User clicks on Graph link
    Then User navigated to Graph page

  Scenario: Test Graph page Graph Represent link
    Given User is on Graph Page
    When User clicks on Graph Represent link
    Then User navigated to Graph page

  Scenario: Test Sub Graph page Graph link
    Given User is on Sub Graph Page
    When User clicks on Graph link
    Then User navigated to Graph page

  Scenario: Test Sub Graph page Graph Represent link
    Given User is on Sub Graph Page
    When User clicks on Graph Represent link
    Then User navigated to Graph Represent page

  Scenario: Test Sub Graph Page Practise Test Link
    Given User is on Sub Graph Page
    When User clicks on Graph Practise Test link
    Then User navigated to Practise Test page

  Scenario: Test Sub Graph  Page Try here Link
    Given User is on Sub Graph Page
    When User clicks on Graph Try Here link
    Then User navigated to Try Here page

  Scenario: Test Sub Graph Represent Page Practise Test Link
    Given User is on Sub Graph Represent page
    When User clicks on Graph Practise Test link
    Then User navigated to Practise Test page

  Scenario: Test Sub Graph Represent Page Try here Link
    Given User is on Sub Graph Represent page
    When User clicks on Graph Try Here link
    Then User navigated to Try Here page
