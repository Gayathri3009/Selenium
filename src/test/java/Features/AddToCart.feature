Feature:Check AddToCart functionality
  @AddToCart
  Scenario:To use AddToCart in amazon website
    Given User launches the URL of amazon "Amazon"
    Then User searches the desired product
    Then User clicks on the product from menu
    Then User is navigated to the desired product
    And User adds the product to the cart