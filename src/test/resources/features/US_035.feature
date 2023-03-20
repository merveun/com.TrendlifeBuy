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


  Scenario: TC_011--->(US_035) It should be verified that the Clone link is visible on the select tab in the Action
  column in the Product List and when it is clicked, it redirects to the Clone Product page.

    Given go to admin panel "urlAdmin"
    Then login as a admin
    Then click on product button
    Then click on product list button
    Then click on plus button
    Then click on select button
    And verify that clone button is displayed
    Then click on clone button
    And verify that clone button go to relevant page
    And close browser

  Scenario: TC_012--->(US_035) Verify that Product Information, Price Info And Stock, Weight Height Info, Product Image Info,
  Pdf Specifications, Product Video Info, Others Info information is changeable on Clone Product page

  Scenario: TC_013--->(US_035) On the Save button, it should be verified that the message reminding that the information
  on the Related Product, Up Sale, Cross Sale pages must be filled before registration is visible.

  Scenario: TC_014--->(US_035) After updating the information on the General Information, Related Product, Up Sale,
  Cross Sale pages, verify that the updated information is saved with the Save button.

  Scenario: TC_015--->(US_035) It should be verified that the Delete link is visible on the select tab in the Action
  column in the Product List and that the Delete operation can be performed when clicked.

  Scenario: TC_016--->(US_035) In the Product By SKU List, verify that the products are listed under the headings SL,
  Name, Brand, SKU, Selling Price, Image, Action.

  Scenario: TC_017--->(US_035) It should be verified that filtering can be done on the List through Product By SKU titles.

  Scenario: TC_018--->(US_035) Verify that it is possible to search the Product By SKU List with the Quick Search TextBox

  Scenario: TC_019--->(US_035) It should be verified that when the Edit link is clicked on the select tab in the Action column,
  it redirects to the Edit page and the information is edited and saved.

  Scenario: TC_020--->(US_035) It should be verified that it is possible to switch between pages in the Product By SKU List.












