Feature: User logs in with valid username and password

  @regression
  Scenario Outline: Log in with valid information
    Given The user is on login page
    When The user fills up valid "<username>" and "<password>"
    Then user should be able to navigate to homepage
    Examples:
      | username              | password     |
      | davidme1988@gmail.com | Duoteck@2023 |
#      | kate@gmail.com         | duoteck@2023 |

  @invalid_login
  Scenario: Unsuccesfull login with invalid credentials
    When The user enters invalid username and password
    Then Error massage should appear




