Feature: Monkey eats when hungry
  The monkeys want to eat

  Scenario: Monkey is hungry, so monkey eats
    Given monkey hungry is "true"
    When monkey thinks he is hungry
    Then monkey "is hungry and eats a banana"

  Scenario: Monkey is not hungry, so monkey does not eat
    Given monkey hungry is "false"
    When monkey thinks he is hungry
    Then monkey "is not hungry to eat"
