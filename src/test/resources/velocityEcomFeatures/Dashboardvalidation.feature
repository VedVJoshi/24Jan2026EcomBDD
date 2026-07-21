Feature: Validate Velocity Ecom Application Dashboard

  Scenario: Validate Dashboard
    Given user clicks on admin button of VelocityEcom application
    When user enters username as "9923478751" on VelocityEcom application
    And  user enters password as "Velocity@123" on VelocityEcom application
    And  user clicks on access dashboard button on VelocityEcom application
    Then user navigates to dashboard and validate details

  Scenario: Validate Inventory Update
    Given user clicks on admin button of VelocityEcom application
    When user enters username as "9923478751" on VelocityEcom application
    And  user enters password as "Velocity@123" on VelocityEcom application
    And  user clicks on access dashboard button on VelocityEcom application
    And user clicks on inventory update option
    Then user validates total entries, open partial, fully received, unit orders
