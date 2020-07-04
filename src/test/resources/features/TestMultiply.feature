@MultiplyTest
Feature: Test multiplication
   this feature will tests multiply method fo calculator

  Scenario Outline: Multiplication tests
    Given two numbers <firstNumber> and <secondNumber>
    When the numbers are multiplied
    Then the result is <result>

    Examples:
      |firstNumber|secondNumber|result|
      |5          |3           |15    |
      |-2         |3           |-6    |
      |-2         |-3          |6     |