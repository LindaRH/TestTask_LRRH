Feature: Cart is not Empty

  Scenario Outline: find a product by searching, add to cart and verify that the product is in the car
    Given open browser in home page
    Then find a product by search <nameP>
    And add to cart
    Then verify product is in cart <nameP>

    Examples:
      | nameP                                                          |
      | Multicolored Dress with Balloon Sleeves [Options & Attributes] |

