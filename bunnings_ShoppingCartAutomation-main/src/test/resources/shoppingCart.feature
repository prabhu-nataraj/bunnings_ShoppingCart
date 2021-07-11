Feature: Search Add Hammer to Shopping Cart
#@shoppingCart
Scenario: Search and Add 1 Hammer item to shopping cart
   Given user navigates to bunnings website "https://bunnings.com.au"
   Then search for the item "Hammer" and click Search button
   Then Add the first item from the search to the Cart 
   And Click Review and Checkout in the search results page
   Then Verify whether the same product is added in the Review Cart page


Scenario: Search and Add 2 Hammer items to shopping cart

    Given user navigates to bunnings website "https://bunnings.com.au"
    Then search for the item "Hammer" and click Search button
    Then Add 2 quantities of the first item from the search to the Cart    
    And Click Review and Checkout in the search results page
    Then Verify whether the same product is added in the Review Cart page
    Then Verify whether the selected quantity is the same


Scenario: Search and Add 2 Hammer items and reduce 1 quantity in Review Cart page

    Given user navigates to bunnings website "https://bunnings.com.au"
    Then search for the item "Hammer" and click Search button
    Then Add 2 quantities of the first item from the search to the Cart    
    And Click Review and Checkout in the search results page
    Then Verify whether the same product is added in the Review Cart page
    Then Verify we can able to reduce the count by 1 in the Review Cart page
