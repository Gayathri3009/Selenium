Feature:Check order functionality
  @AmazonOrder
  Scenario Outline: To use ascending order in Amazon website
    Given User lauches the amazon website "Amazon"
    Then User searches for the "<product>"
    Then User gets the list of products in ascending order according to their price and chooses the high priced one


    Examples:
    |product|
    |iPhone 14|
    |iPhone 12  |