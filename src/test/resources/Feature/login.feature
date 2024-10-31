Feature: Login page feature
@smoke
 Scenario: Login page title
   Given user is on login poge
   When  user gets  the tite of the page
   Then user should get the title "Automation Practice Site"
@skip
  Scenario: Click on Myaccount Link
    Given uuser is on login poge
    When user click on Myaccount Link
    Then user should naviagte to Myaccount Page


