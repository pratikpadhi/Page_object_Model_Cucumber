Feature: Test  the login functionality of mercury tour demo

Background:
  Given welcome you

  Scenario: Login the application with correct username and password
    Given user is in login page
    When user enters correct username and password
    Then user gets confirmation page

  Scenario Outline: the user should be able to log in
    Given user is in login page
    When user enters correct loginusername <username>
    And user enters correct Password <password>
    Then user gets confirmation page

    Examples: 
      | username | password |
      | dhinka   | chika    |
      | sachi    | muchi    |
      | sui      | dhaga    |

  @web
  Scenario: the user should be able to log
    Given user is in the login "page"
    Then user gets confirmation page

  Scenario Outline: the user should be able log in
    When user enters correct as loginusername <username>

    Examples: 
      | username |
      | dhinka   |
      | sachi    |
      | sui      |

  Scenario: the user should be able to log in
    Given I will use data table
      | username | password |
      | dhinka   | chika    |
      | sachi    | muchi    |
      | sui      | dhaga    |
