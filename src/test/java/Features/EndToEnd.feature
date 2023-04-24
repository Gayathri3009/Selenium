Feature:Check EndToEnd functionality

  @EndToEnd
  Scenario: To use EndToEnd functionality in tutorials point website
    Given User launches the URL of tutorialspoint "Tutorialpoint"
    When  User gives consent for login
    Then User clicks on first name and writes their name
    Then User clicks on last name and writes their name
    Then User picks up the gender
    Then User picks up their years of experience
    Then User mentions the correct date
    Then user selects their profession
    Then User uploads a copy of their profile picture
    Then user picks up their choice in selenium
    Then user correctly selects the continent from the drop down
    Then User takes up the selenium commands from the dropdown
    And User clicks on the submit button