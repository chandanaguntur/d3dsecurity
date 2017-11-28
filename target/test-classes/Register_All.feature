@Register
Feature: Verify Register New User with Valid and Invalid data.

  Background:
    Given I entered "http:d3dsecurity.co.uk"
    When I click register button
@valid_reg
  Scenario: Register New user with valid data
    Given i entered username as "chandu2017@yahoo.com" in register page
    And i entered password as "chandana7102" in register page
    And I entered confirm password as "chandana7102"
#    once the above steps are executed system registers that ID as its a valid id. so give new ID when executing again and again.
    When I click register button on register page
    Then I should see url "https://www.d3dsecurity.co.uk/my-account/" on register page

  @Reg-Datatable
Scenario: inserting data table
  Given I entered details:
    | E-mail          | NewPassword | ConfirmPassword |
    | Chakra.guntur@hotmail.com | chak12      | chak12          |
  When I click register button on register page
  Then I should see url "https://www.d3dsecurity.co.uk/my-account/" on register page


  @invalid_reg
  Scenario Outline: Invalid data
    Given i entered username as "<E_Mail>" in register page
    And i entered password as "<New_Password>" in register page
    And I entered confirm password as "<Confirm_Password>"
    When I click register button on register page
    Then I should see "<error_message>"


    Examples:
      | E_Mail                  | New_Password | Confirm_Password | error_message                          |
      |                         |              |                  | Username is not valid                  |
      | chandu.guntur@gmail.com | chandana     | chakra           | Username is not valid |
      | chakra_guntur@yahoo.com | chakra1      |                  | Passwords must be identical and filled |
      | rohan.g@yahoo.com       |              | rohan12          | Passwords must be identical and filled |
      |                         | moksha12     | moksha12         | Username is not valid     |

#  use cntrl+b to go to stepdefinition on your scenario.
# if once u write step definition in entire framework u no need to create it another time, u can reuse it. But take care your feature file step or line should be exactly same as its case sensitive.






