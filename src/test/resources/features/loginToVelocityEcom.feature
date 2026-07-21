Feature: Velocity Ecommerce Login

  Background:
    Given user is on ecom login page

  @regression
  Scenario: User Login as Admin
    When user click on admin button
    And user enter username as "9923478751"
    And user enter password as "Velocity@123"
    And user click on access dashboard
    Then user navigates on dashboard page

  @smoke
  Scenario: user login as customer
    When user click on customer login button
    And user enter username as "5555555555"
    And user enter password as "Velocity@2323"
    And user click on login
    Then user navigates on product page