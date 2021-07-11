$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("shoppingCart.feature");
formatter.feature({
  "line": 1,
  "name": "Search Add Hammer to Shopping Cart",
  "description": "",
  "id": "search-add-hammer-to-shopping-cart",
  "keyword": "Feature"
});
formatter.before({
  "duration": 100200,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "#@shoppingCart"
    }
  ],
  "line": 3,
  "name": "Search and Add 1 Hammer item to shopping cart",
  "description": "",
  "id": "search-add-hammer-to-shopping-cart;search-and-add-1-hammer-item-to-shopping-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user navigates to bunnings website \"https://bunnings.com.au\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "search for the item \"Hammer\" and click Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Add the first item from the search to the Cart",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Click Review and Checkout in the search results page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Verify whether the same product is added in the Review Cart page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://bunnings.com.au",
      "offset": 36
    }
  ],
  "location": "shoppingCart_StepDefinitions.user_navigates_to_bunnings_website(String)"
});
formatter.result({
  "duration": 7761572500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hammer",
      "offset": 21
    }
  ],
  "location": "shoppingCart_StepDefinitions.search_for_the_item_and_click_Search_button(String)"
});
formatter.result({
  "duration": 512776600,
  "status": "passed"
});
formatter.match({
  "location": "shoppingCart_StepDefinitions.add_the_first_item_from_the_search_to_the_Cart()"
});
formatter.result({
  "duration": 2280672300,
  "status": "passed"
});
formatter.match({
  "location": "shoppingCart_StepDefinitions.click_Review_and_Checkout_in_the_search_results_page()"
});
formatter.result({
  "duration": 780542000,
  "status": "passed"
});
formatter.match({
  "location": "shoppingCart_StepDefinitions.verify_whether_the_same_product_is_added_in_the_Review_Cart_page()"
});
formatter.result({
  "duration": 1031641100,
  "status": "passed"
});
formatter.after({
  "duration": 5108760000,
  "status": "passed"
});
formatter.before({
  "duration": 24500,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Search and Add 2 Hammer items to shopping cart",
  "description": "",
  "id": "search-add-hammer-to-shopping-cart;search-and-add-2-hammer-items-to-shopping-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "user navigates to bunnings website \"https://bunnings.com.au\"",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "search for the item \"Hammer\" and click Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Add 2 quantities of the first item from the search to the Cart",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Click Review and Checkout in the search results page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Verify whether the same product is added in the Review Cart page",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Verify whether the selected quantity is the same",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://bunnings.com.au",
      "offset": 36
    }
  ],
  "location": "shoppingCart_StepDefinitions.user_navigates_to_bunnings_website(String)"
});
formatter.result({
  "duration": 5850589600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hammer",
      "offset": 21
    }
  ],
  "location": "shoppingCart_StepDefinitions.search_for_the_item_and_click_Search_button(String)"
});
formatter.result({
  "duration": 447535800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 4
    }
  ],
  "location": "shoppingCart_StepDefinitions.add_quantities_of_the_first_item_from_the_search_to_the_Cart(String)"
});
formatter.result({
  "duration": 4441213100,
  "status": "passed"
});
formatter.match({
  "location": "shoppingCart_StepDefinitions.click_Review_and_Checkout_in_the_search_results_page()"
});
formatter.result({
  "duration": 128902000,
  "status": "passed"
});
formatter.match({
  "location": "shoppingCart_StepDefinitions.verify_whether_the_same_product_is_added_in_the_Review_Cart_page()"
});
formatter.result({
  "duration": 1359837800,
  "status": "passed"
});
formatter.match({
  "location": "shoppingCart_StepDefinitions.verify_whether_the_selected_quantity_is_the_same()"
});
formatter.result({
  "duration": 2161308500,
  "status": "passed"
});
formatter.after({
  "duration": 984763200,
  "status": "passed"
});
formatter.before({
  "duration": 22600,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Search and Add 2 Hammer items and reduce 1 quantity in Review Cart page",
  "description": "",
  "id": "search-add-hammer-to-shopping-cart;search-and-add-2-hammer-items-and-reduce-1-quantity-in-review-cart-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "user navigates to bunnings website \"https://bunnings.com.au\"",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "search for the item \"Hammer\" and click Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Add 2 quantities of the first item from the search to the Cart",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Click Review and Checkout in the search results page",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Verify whether the same product is added in the Review Cart page",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Verify we can able to reduce the count by 1 in the Review Cart page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://bunnings.com.au",
      "offset": 36
    }
  ],
  "location": "shoppingCart_StepDefinitions.user_navigates_to_bunnings_website(String)"
});
formatter.result({
  "duration": 5240089100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hammer",
      "offset": 21
    }
  ],
  "location": "shoppingCart_StepDefinitions.search_for_the_item_and_click_Search_button(String)"
});
formatter.result({
  "duration": 359485500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 4
    }
  ],
  "location": "shoppingCart_StepDefinitions.add_quantities_of_the_first_item_from_the_search_to_the_Cart(String)"
});
formatter.result({
  "duration": 4593406500,
  "status": "passed"
});
formatter.match({
  "location": "shoppingCart_StepDefinitions.click_Review_and_Checkout_in_the_search_results_page()"
});
formatter.result({
  "duration": 117722200,
  "status": "passed"
});
formatter.match({
  "location": "shoppingCart_StepDefinitions.verify_whether_the_same_product_is_added_in_the_Review_Cart_page()"
});
formatter.result({
  "duration": 1232435900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 42
    }
  ],
  "location": "shoppingCart_StepDefinitions.verify_we_can_able_to_reduce_the_count_by_in_the_Review_Cart_page(int)"
});
formatter.result({
  "duration": 2166981900,
  "status": "passed"
});
formatter.after({
  "duration": 978155200,
  "status": "passed"
});
});