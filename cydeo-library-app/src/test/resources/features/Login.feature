Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct
  credentials to different accounts



  @librarian
  Scenario: Login as librarian
    Given user is on the login page
    When user logins as a librarian
    Then user should see the dashboard

