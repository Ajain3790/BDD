$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Features/HomePage.feature");
formatter.feature({
  "name": "Google Homepage",
  "description": "This feature verifies the functionality on Google Homepage",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Luanch Home Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "User enter valid URL \"https://worldpayproduct.slack.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "HomePage.user_enter_valid_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Homepage should be launched as default page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage.homepage_should_be_launched_as_default_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Product Link",
  "keyword": "When "
});
formatter.match({
  "location": "HomePage.user_click_on_Product_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should navigate to product page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage.user_should_navigate_to_product_page()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/Features/LoginPage.feature");
formatter.feature({
  "name": "To check the Login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Valid login",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user lands on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPage.user_lands_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter valid email \"abhishek.jain@worldpay.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPage.user_enter_valid_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter valid password \"Abhi@2153\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.user_enter_valid_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.user_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.user_should_login_successfully()"
});
formatter.result({
  "status": "passed"
});
});