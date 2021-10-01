Feature: Penguin does a loud squawk
  The penguin wants to squawk as loud as it can

  Scenario: The penguin is over the age of 3, so he can squawk loudly.
    Given penguin is aged 3
    When the penguin wants to squawk
    Then penguin will "SQUAWK!!!"

  Scenario: The penguin is under the age of 3, and cannot squawk loudly.
    Given penguin is aged 2
    When the penguin wants to squawk
    Then penguin will "squawk..."
