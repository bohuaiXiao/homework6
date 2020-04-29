
Feature: account_activity
  verify the account_activity
  @account_activity
  Scenario: verify the account activity
    Given user is on the home page
    Then user click on sign in button
    Then user login as authorized user
    Then user click on the "Account Activity"
    Then  Account Activity page should have the title "Zero –Account activity"
    And   Account drop down default option should be "Savings"
    And   Acc      |Loan|
  ount drop down should have the following options:
      |Savings|
      |Checking|
      |Credit Card|
      |Brokerage  |
    And Transactions table should have column names :
      |Date|
      |Description|
      |Deposit|
      |Withdrawal|




