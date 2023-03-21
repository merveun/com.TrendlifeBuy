Feature: As an administrator, I want the product lists page to be able to access the product lists on the site.



  Scenario: TC_001--->(US_035) Verify that the Product List page is accessible from the Products menu

    Given go to admin panel "urlAdmin"
    Then login as a admin
    Then click on product button
    Then click on product list button
    And verify that the visibility of product list
    And close browser


  Scenario: TC_002--->(US_035) Product List, Alert List, Out Of Stock List, Disabled Product List, Product By SKU List links
  appear on the Product List page and it is verified that they go to the relevant page.

    Given go to admin panel "urlAdmin"
    Then login as a admin
    Then click on product button
    Then click on product list button
    And verify that all prdouct list buttons are displayed
    And verify that all prdouct list buttons go to the relevant page
    And close browser


  Scenario: TC_003--->(US_035) All product List links appear on the Product List page and it is verified that they go to the relevant page.

    Given go to admin panel "urlAdmin"
    Then login as a admin
    Then click on product button
    Then click on product list button
    And verify that all product feature headings
    And close browser

  Scenario: TC_004--->(US_035) Verify that it is possible to search in the Product List with the Quick Search TextBox

    Given go to admin panel "urlAdmin"
    Then login as a admin
    Then click on product button
    Then click on product list button
    Then wait for searchbox is visible
    Then write on seearchbox keyword
    And tests that search from the search bar
    And close browser

  Scenario: TC_005--->(US_035) It should be verified that the product status can be changed
  from the Status column in the Product List.

    Given go to admin panel "urlAdmin"
    Then login as a admin
    Then click on product button
    Then click on product list button
    Then switch toggle and verify status chanching
    And close browser

  Scenario: TC_006--->(US_035) It should be verified that the View link is visible and displays the product
  when the select tab is clicked in the Action column in the Product List.

    Given go to admin panel "urlAdmin"
    Then login as a admin
    Then click on product button
    Then click on product list button
    Then click on plus button
    Then click on select button
    And verify that view button is displayed
    Then click on view button
    And verify that product details is displayed
    And close browser

  Scenario: TC_007--->(US_035) It should be verified that the Edit link is visible on the select tab in the Action
  column in the Product List and it redirects to the Edit Product page when clicked.

    Given go to admin panel "urlAdmin"
    Then login as a admin
    Then click on product button
    Then click on product list button
    Then click on plus button
    Then click on select button
    And verify that edit button is displayed
    Then click on edit button
    And verify that edit button go to relevant page
    And close browser

  Scenario: TC_008--->(US_035) It should be verified that the current information of the product is available
  on the Edit Product page.

    Given go to admin panel "urlAdmin"
    Then login as a admin
    Then click on product button
    Then click on product list button
    Then click on plus button
    Then click on select button
    Then click on edit button
    And verify that single price value is visible
    And verify that stock amount is visible
    And close browser


  Scenario: TC_009--->(US_035) Verify that the Type option cannot be changed in the Product Information section
  and that the related message is visible.

    Given go to admin panel "urlAdmin"
    Then login as a admin
    Then click on product button
    Then click on product list button
    Then click on plus button
    Then click on select button
    Then click on edit button
    And tests that product type is not changed
    And close browser


  Scenario: TC_010--->(US_035) After editing the information on the General Information, Related Product, Up Sale,
  Cross Sale pages, verify that the edited information is saved by clicking the Update button.

    Given go to admin panel "urlAdmin"
    Then login as a admin
    Then click on product button
    Then click on product list button
    Then click on plus button
    Then click on select button
    Then click on edit button
    Then enter stock amount
    Then click on plus button
    Then click on select button
    Then click on edit button
    And verify that stock amount is updated
    And close browser




















