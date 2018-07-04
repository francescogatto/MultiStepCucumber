Feature: Calculate a result
  Perform an arithmetic operation on two numbers using a mathematical operator
  """The purpose of this feature is to illustrate how existing step-definitions
  can be efficiently reused."""

  Scenario: Enter a digit, an operator and another digit
    Given I have a CalculatorActivity Test
    Then I should see the activity and continue with other test
