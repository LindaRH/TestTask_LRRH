Feature: Cart validation
  Add a product to a cart as a guest, modify the quantity to 3, verify the subtotal after that login as a user and verify that cart still showing the same products and quantity

  Scenario: Add an item to a cart and modify the value to three
    Given An open browser in home page
    Then Add an item add to cart
    When Open the cart
    And Verify the subtotal value is present
    Then Change item quantity to three
    And Verify subtotal value is multiplied by three
    Then Log in as existing user
    And Verify carts of anonymous and logged in user are merged
