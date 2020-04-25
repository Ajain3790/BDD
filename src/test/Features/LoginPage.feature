Feature: To check the Login functionality

#@Smoke
Scenario: Valid login
Given user lands on login page "https://worldpayproduct.slack.com/"
When user enter valid email "abhishek.jain@worldpay.com"
And user enter valid password "Abhi@2153"
And user click on login button
Then user should login successfully
