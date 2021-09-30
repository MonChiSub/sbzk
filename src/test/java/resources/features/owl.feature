Feature: Owl flies when energy is high enough
  The owl wants to fly

  Scenario: Owl has enough energy, so it flies.
    Given owl can fly is "true"
    When owl wants to fly
    Then owl will "fly"

  Scenario: Owl has no energy, so it cannot fly.
    Given owl can fly is "false"
    When owl wants to fly
    Then owl will "not fly"