Feature: User should be able to login with valid credentials

  @wip
  Scenario Outline: user login
    Given user is on the cars homepage page and clicks on menu and presses sign in
    And user enters valid "<email>" and "<password>" and clicks sign in button
    Then user should see their "<name>" in top right corner
    Examples:
      | email                        | password   | name          |
      | henrysanchez1993@hotmail.com | Testing123 | henry Sanchez |