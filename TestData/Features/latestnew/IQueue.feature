Feature: Test Queue page

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
