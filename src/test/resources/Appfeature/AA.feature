Feature: To test AA functionality

  Scenario: Check identify audience dashboards loads properly
    Given Browser is opened
    When user is on RE homepage
    And Clicks on AA component
    Then user redirects to segment section
    And clicks on audience screen
