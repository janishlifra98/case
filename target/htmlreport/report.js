$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/skeleton/cas4.feature");
formatter.feature({
  "name": "Cart functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User verifies whether the product is added to the cart or not",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User opens the TestMeApp",
  "keyword": "Given "
});
formatter.match({
  "location": "Cart.user_opens_the_TestMeApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user gives the uname as \"AlexUser\"  and pasword as \"Alex@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "Cart.the_user_gives_the_uname_as_and_pasword_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user searches for the product",
  "keyword": "And "
});
formatter.match({
  "location": "Cart.the_user_searches_for_the_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "moves to the cart without selecting any product",
  "keyword": "And "
});
formatter.match({
  "location": "Cart.moves_to_the_cart_without_selecting_any_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify whether product is added to the cart or not",
  "keyword": "Then "
});
formatter.match({
  "location": "Cart.verify_whether_product_is_added_to_the_cart_or_not()"
});
formatter.result({
  "status": "passed"
});
});