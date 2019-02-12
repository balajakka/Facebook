Feature: Santander Retail Banking

  Scenario: Access to Santander retail platform
    Given I am chrome user
    When I access santander retail url
    Then I see santander retail page
