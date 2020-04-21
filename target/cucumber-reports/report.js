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
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
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
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: //input[@id\u003d\u0027email\u0027]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027ABHISHEK\u0027, ip: \u0027192.168.137.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 72.0.2, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20200117190643, moz:geckodriverVersion: 0.26.0, moz:headless: true, moz:processID: 976, moz:profile: C:\\Users\\a\\AppData\\Local\\Te..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: eager, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 1ef32e11-3cde-403c-8286-224809a4c286\n*** Element info: {Using\u003dxpath, value\u003d//input[@id\u003d\u0027email\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.clear(Unknown Source)\r\n\tat stepDefinitions.LoginPage.user_enter_valid_email(LoginPage.java:22)\r\n\tat ✽.user enter valid email \"abhishek.jain@worldpay.com\"(src/test/Features/LoginPage.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user enter valid password \"Abhi@2153\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.user_enter_valid_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.user_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.user_should_login_successfully()"
});
formatter.result({
  "status": "skipped"
});
});