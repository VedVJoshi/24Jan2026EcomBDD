Feature: Velocity Ecommerce login page

  Scenario Outline: user login as customer
    Given user is on ecom login page
    When user click on customer login button
    And user enter username as "<username>"
    And user enter password as "<password>"
    And user click on login
    Then user navigates on product page
    Examples:
      | username    | password  |
      | vedantjoshi | Vedant@12 |
      | vedjoshi    | Vedant@23 |
      | vedantj     | Vedant@34 |
