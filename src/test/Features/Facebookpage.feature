Feature: Facebook Login Page

  Scenario: Test facebook login page
    Given I am chrome user
    When I access facebook url
    Then I see facebook login page
