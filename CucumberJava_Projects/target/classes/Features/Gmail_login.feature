Feature: Login to Gmail 

Scenario:  
		Given Open Chrome Browser
    And I navigate to http://www.gmail.com
    When I enter valid username and password
    And I click on button sign in
    Then I should get logged in
