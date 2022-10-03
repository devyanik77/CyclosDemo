Feature: Cyclos Application

  Scenario Outline: Test the valid login
    Given user is on login page
    When user enters <username> and <password>
    And click on sign in button
    Then user should be on activity page

    Examples: 
      |username||password|
      |admin||pass|