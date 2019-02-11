Feature: santander retail
  Scenario: access to santander retail platform
    Given I am chrome user
    When I access santander retail url
    Then I see santander retail page
