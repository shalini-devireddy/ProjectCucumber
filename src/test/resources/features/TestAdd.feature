@AddTest
Feature: Test Addition
  Testing the addition method of the calculator

  Scenario Outline: Addition tests
    Given two numbers <firstNumber> and <secondNumber>
    When the numbers are added
    Then the result is <addedNumber>

    Examples:
    |firstNumber|secondNumber|addedNumber|
    |5          |3           |8          |
    |-2         |3           |1          |
    |-2         |-3          |-5         |