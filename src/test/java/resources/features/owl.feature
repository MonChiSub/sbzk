Feature: Owl flies when energy is high enough
  The owl wants to fly

  Scenario: Owl has enough energy, so it flies.
    Given owl can fly is "true"
    When owl energy is 75
    Then owl will "Owl goes for a fly"

  Scenario: Owl has no energy, so it cannot fly.
    Given owl can fly is "false"
    When owl energy is 74
    Then owl will "Owl cannot fly, energy too low."