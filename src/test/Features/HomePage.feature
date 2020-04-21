Feature: Google Homepage
This feature verifies the functionality on Google Homepage

@Smoke
Scenario: Luanch Home Page
When User enter valid URL "https://worldpayproduct.slack.com/"
Then Homepage should be launched as default page
When user click on Product Link
Then User should navigate to product page

