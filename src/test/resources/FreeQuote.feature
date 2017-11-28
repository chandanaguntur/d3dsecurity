@Free_Quote
Feature: Verify Free Quote Template

  Background:
    Given I entered "http://www.d3dsecurity.co.uk"
    When I click Online Demo Button on home page
#    Then I should see header " Get a Free Quote" on the left hand side
# we cant check the element of txt in 'header image' in automation.
@FQ_valid1
  Scenario: Verify free quote with valid data-1
    Given I enter "Chandana" in security alarm page
    And I enter last name as "Guntur"
    And I enter email as "chandu.guntur@gmail.com"
    And I enter phone number as "07887360277"
    And I enter subject "Hi there"
    And I enter message "Quote for wifi video door bell"
    When I click send message button
    Then I should see url "https://www.d3dsecurity.co.uk/thank-you/"

@FQ_valid2
  Scenario Outline: Verify Free Quote with valid data-2
    Given I enter "<First_Name>" in security alarm page
    And I enter last name as "<last_name>"
    And I enter email as "<Your_Email>"
    And I enter phone number as "<Your_Phone_number>"
    And I enter subject "<subject>"
    And I enter message "<message>"
    When I click send message button
    Then I should see url "https://www.d3dsecurity.co.uk/thank-you/"

    Examples:
      | First_Name | last_name | Your_Email               | Your_Phone_number | subject        | message             |
      | Chakradhar | Rao       | chakra_guntur@yahoo.com  | 07516057372       | Hi there       | Free Quote required |
      | Rohan      | Sreshta   | Rohan.G@yahoo.com        | 07882715721       | Hello          | Quote for CCTV      |
      | Moksha     | Guntur    | Mokshaguntur@hotmail.com | 09877282994       | Need Quotation | Security alarm      |

@FQ_invalid
  Scenario Outline: Verify Free Quote with invalid data
    Given I enter "<First_Name>" in security alarm page
    And I enter last name as "<last_name>"
    And I enter email as "<Your_Email>"
    And I enter phone number as "<Your_Phone_number>"
    And I enter subject "<subject>"
    And I enter message "<message>"
    When I click send message button
    Then I should see error message "<Error_message>"
    Examples:
      | First_Name | last_name | Your_Email              | Your_Phone_number | subject   | message                   | Error_message                     |
      |            | Guntur    | chandu_guntur@yahoo.com | 07885643916       | Hi        | Quote for Security alarm  | Please fill in the required field |
      | Chakra     | Rao       | chakra.guntur@gmail.com |                   | Hey there | Quote for Monitored Alarm | Please fill in the required field |



