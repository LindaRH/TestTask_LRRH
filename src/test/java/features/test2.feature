Feature: Symbol validation

  Scenario: Validate $ symbol
    Given an open browser in home page
    Then verify that every product price has $ symbol before amount
