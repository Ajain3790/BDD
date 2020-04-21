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
  "error_message": "org.assertj.core.api.SoftAssertionError: \r\nThe following assertion failed:\r\n1) \r\nExpecting:\r\n \u003c\"Collaboration software | Slack\"\u003e\r\nto be equal to:\r\n \u003c\"Features | Slack1\"\u003e\r\nignoring case considerations\r\nat HomePage.user_should_navigate_to_product_page(HomePage.java:55)\r\n\r\n\tat org.assertj.core.api.SoftAssertions.assertAll(SoftAssertions.java:158)\r\n\tat stepDefinitions.HomePage.user_should_navigate_to_product_page(HomePage.java:56)\r\n\tat ✽.User should navigate to product page(src/test/Features/HomePage.feature:9)\r\n",
  "status": "failed"
});
});