Feature: As an administrator, I want the product lists page to be able to access the product lists on the site.



  Scenario: TC_001--->(US_035) Verify that the Product List page is accessible from the Products menu

    Given go to admin panel "urlAdmin"
    Then login as a admin
    Then click on product button
    Then click on product list button
    And verify that the visibility of product list


  Scenario: TC_002--->(US_035) All product List links appear on the Product List page and it is verified that they go to the relevant page.

    Given go to admin panel "urlAdmin"
    Then login as a admin


  Scenario: TC_003--->(US_035) Verifies that the products are listed under Actions in the Product List

    Given go to admin panel "urlAdmin"
    Then login as a admin

