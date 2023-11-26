Feature: User signs up as new user

  @Regression
  Scenario: Sign up with valid information
    Given The user clicks on the sign up link
    When The user fills up the fields with valid info
    Then user should be able to navigate to login page
