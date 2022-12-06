Feature: My Store Login and change address

  Scenario Outline: Login user
    Given an open browser with HomePage
    And click signIn button
    And fill out login with email and password
    Then click Addresses tab
    And fill out <alias> and <address> and <city> and <postalCode> and <phone>
    And get alert
    Examples:
      | alias | address | city | postalCode | phone|
      | Badduke | Jerzykowska | Poznan | 62007 | 656524242 |
