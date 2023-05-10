Feature: Product Subscription Configurator

  I as a user,
  Want to configure product subscription
  So that I can have details of a product

  Scenario: Product Subscription Configurator
    Given I access the product subscription configurator page
    When I configure a "Premium", "Full" with "6" months support product
    And I calculate the price
    Then confirm the product subscription details