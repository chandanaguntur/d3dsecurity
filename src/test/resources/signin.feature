@signin
Feature:Sign-in to MyAccount

  @login
  Scenario: Verify Login button
    Given I entered "http://d3dsecurity.co.uk"
    When I click Login button
  #Then i should see Login page
  # there wont be any id /name etc for above. u can otherwise write command as go to url.
    Given i entered username as "test1@yahoo.com"
    And i entered password as "Testing1"
    When I click Login button on login page
   # Then I should see "D3D Security Systems" header
#    cant get text out of header image in automation.
   And I should see My Account button on the top right hand side
   And I should see Logout button on the top right corner of page

# As we created ' Hooks' file and created methods for opening and closing browser for each scenario irrespective of test passed/failed, it opens and closes browser.

 #click 'alt enter' on each line to create step definition in java web automation.
#  click cntrl B on any feature file 'step' to go to releavant web automation 'step defintion'.
#  once you create step definition for steps in feature file u can reuse it in another feature file as the web element is same. so make sure if u can reuse feature file steps. Also make sure your steps are copied same as its 'case sensitive'.
  # use 'cntrl /' to comment in feature files or java
#  'Runcukes test' executes feature file and it doesnt take into a/c 'Given,When,Then' and headings, but the other part of lines only. So if u change any part of it, it changes colour and again element has to be created even though the element remains same.

