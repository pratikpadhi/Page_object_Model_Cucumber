Feature: Test  the login functionality of mercury tour demo

Background:
  Given welcome you

  Scenario: Login the application with correct username and password
    Given user is in login page
    When user enters correct username and password
    Then user gets confirmation page

  Scenario Outline: the user should be able to log in one
    Given user is in login page
    When user enters correct loginusername <username>
    And user enters correct Password <password>
    Then user gets confirmation page

    Examples: 
      | username | password |
      | usrone   | pasone   |
      | usrscn   | passcn   |
      | usrthr   | pasthr   |

  @web
  Scenario: the user should be able to log in two
    Given user is in the login "page"
    Then user gets confirmation page

  Scenario Outline: the user should be able log in three
    When user enters correct as loginusername <username>

    Examples: 
      | username |
      | 	 one   |
      | 	 scn   | 
      | 	 thr   | 

  Scenario: the user should be able to log in four
    Given I will use data table
  		| Tom    | Jhon     |
      | Grace  | william  |
      | George | Robert   |
      | Sudi   | Parther  |
