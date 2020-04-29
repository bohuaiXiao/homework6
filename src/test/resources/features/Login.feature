Feature: Login
  Only authorized users should be able to login to the application.
  Background: open login page
    Given user is on the home page

    @authorized_user
    Scenario: login as authorized user account summary page should be displayed
      Then user click on sign in button
      Then user login as authorized user
      Then account summary page title should be "Zero - Account Summary"
      And account summary page should have follow types:
      |Cash Accounts |
      |Investment Accounts|
      |Credit Accounts|
      |Loan Accounts|
      And Credit Accounts table should have follow columns:
      |Account|
      |Credit Card|
      |Balance|

    @unauthorized_user
    Scenario: wrong username or password can not login successfully
        When  user login with "wrong" username or password
        Then error message "Login and/or password are wrong." should be displayed