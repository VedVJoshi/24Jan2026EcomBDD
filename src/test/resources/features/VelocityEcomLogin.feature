Feature: Velocity Ecommerce Login
#  Scenario: User Login as Admin
#    Given user is on ecom login page
#    When user click on admin button
#    And user enter username as "9923478751"
#    And user enter password as "Velocity@123"
#    And user click on access dashboard
#    Then user navigates on dashboard page
#
#    Scenario: user login as customer
#      Given user is on ecom login page
#      When user click on customer login button
#      And user enter username as "5555555555"
#      And user enter password as "Velocity@2323"
#      And user click on login
#      Then user navigates on product page

#  Scenario Outline: login with multiple admin user
#    Given user is on ecom login page
#    When user click on admin button
#    And user enter username as "<username>"
#    And user enter password as "<password>"
#    And user click on access dashboard
#    Then user navigates on dashboard page
#
#    Examples:
#      | username   | password |
#      | 8787878787 | Test@11  |
#      | 5454545454 | Test@22  |
#      | 2121212121 | Test@33  |
#      | 3232323232 | Test@44  |
#      | 6565656565 | Test@55  |

  @regression
  Scenario: sign up as user
    Given user is on sign up page
    When user enter registration details and clicks sign up button

      | FirstName | LastName | Email                |
      | John      | Doe      | John@gmail.com       |
      | Sam       | Smith    | sam@test.com         |
      | Mahi      | Dhoni    | mahiLegend@gamil.com |

    Then user registration should successful done




