Feature: Account page feature

  Scenario: Login to Acoounts page with valid credentials
    Given user is on Accounts page
    When user enters username and passward
    |username|passward|
    |rajat.joshi087@gmail.com|Manthecool2@786|
    And user click on Login button
    Then user should be on Landing page

