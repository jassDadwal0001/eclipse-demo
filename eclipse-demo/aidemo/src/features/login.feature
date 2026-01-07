Feature: Login
  Verify login functionality using the LoginPage page object.

  Scenario: Successful login with valid credentials
    Given the login page is open
    When I login with username "user" and password "pass"
    Then I should be logged in

  Scenario: Login fails with invalid password
    Given the login page is open
    When I login with username "user" and password "wrongpass"
    Then I should see an authentication error
