
Feature:Bir yönetici olarak site kullanicilari icin gift cardlar hazirlamak,
  editlemek veya silmek icin bu fonksiyonlari gerceklestirebilecek bir sayfanin olmasini istiyorum.
  Background:
    Given Login on the "adminUrl" page.
    Then Click on Gift Card drapdown
    Then clicks the gift card list button

  Scenario:US_036 --> TC_001 It should be verified that the Gift Card List page is accessible from the
  Gift Card tab in the Promotional menu on the Dashboard Side Bar.
    Then tests that the gift card page is opened

  Scenario:US_036 --> TC_002 Verify that the Gift Card List is visible on the Gift Card List page.
    Then Tests that the gift card list is visible from the gift card page.

  Scenario:US_036 --> TC_003 In the Gift Card List, it should be verified that the gift cards are listed according to
  Name, SKU, Thumbnail Image, Selling Price, Number of Sale and Status information.
    Then Clicks the Name button, tests that it is sorted
    Then Clicks the Sku button, tests that it is sorted
    Then Clicks the Thumnail image button, tests that it is sorted
    Then Clicks the Selling Price button, tests that it is sorted
    Then Clicks on the Number Price button, tests that it is sorted
    Then Clicks on the Number Of Sale button, tests that it is sorted
    And  Clicks on the Status button, tests that it is sorted

  Scenario:US_036 --> TC_004 It should be verified that the gift card selected under the Status Title in the Gift Card List
  can be set as active or passive.
    Then clicks to deactivate the status part of the first gift card
    Then tests that it is passive
    Then clicks to activate the status part of the first gift card
    Then tests that it is active

  Scenario:US_036 --> TC_005 Verify that View , Edit and Delete links are visible in the Select tab under the Actions heading
  in the Gift Card List.
    Then clicks the actions button of the first gift card
    Then clicks the select button in the opened section
    Then tests that the page appears
    Then tests that the page appears
    Then tests that the page appears

  Scenario:US_036 --> TC_006  On the page that opens when the View link is clicked on the Select tab
  under the Actions heading,it should be verified that the name in the Name field
  and the gift card name selected in the Gift Card List are the same.
    Then clicks the actions button of the first gift card
    Then clicks the select button in the opened section
    Then clicks the view buttonn
    Then Verifies that the name part and the name in the gift card list are the same in the opened page

  Scenario:US_036 --> TC_007 When the View link is clicked, it should be verified that its Status
  is the same as the gift card status selected in the Gift Card List.
    Then take a  screenshot status to friends
    Then clicks the actions button of the first gift card
    Then clicks the select button in the opened section
    Then clicks the view buttonn
    And take a  screenshot status to giftcard
    #Then Verifies that the status section and the status in the gift card list are the same in the opened page

  Scenario:US_036 --> TC_008 It should be verified that it redirects the gift card to the print page with the Print button.
    Then clicks the print button and it is verified that it redirects to the page

  Scenario:US_036 --> TC_009 When the Edit link is clicked on the Select tab under the Actions heading,
  it should be verified that it redirects to the Edit Gift Card page.
    Then clicks the actions button of the first gift card
    Then clicks the select button in the opened section
    Then Click on the edit button and verify that it goes to the page

  Scenario:US_036 --> TC_010 On the Edit Gift Card page, it should be verified that the relevant gift card has
  Name, SKU, Thumbnail Image, Selling Price, Shipping Methods,
  Galary Image, Discount, Discount Type, Status, Discount Period and Tag information.

    Then clicks the select button of the first giftcard
    Then clicks the edit button
    Then Tests that the name information appears
    Then Tests that SKU information appears
    Then Tests that Thumbnail Image information appears
    Then Tests that Selling Price information appears
    Then Tests that Shipping Methods information appears
    Then Tests that Galary Image information appears
    Then Tests that Discount information appears
    Then Tests that Discount Type information appears
    Then Tests that the status information appears
    Then Tests that Discount Period information appears
    Then Tests that tag information appears


  Scenario:US_036 --> TC_011 After editing the required information of the gift card on the Edit Gift Card page,
  it should be verified that it can be updated by clicking the Update button.

    Then clicks the actions button of the first gift card
    Then clicks the select button in the popup section
    Then click the edit button
    Then Change name on edit page
    Then click the update button
    Then Go to gift card page
    Then confirmed to have changed

  Scenario:US_036 --> TC_012 It should be verified that the relevant gift card can be deleted from the window
  that opens by clicking the Delete link from the Select tab under the Actions heading.

    Then Clicks the actions button of the gift card named -flower
    Then clicks the select button in the opened section
    Then click the delete button
    Then Click the delete button in the pop-up.
    Then The green pop up is verified.

  Scenario:US_036 --> TC_013 According to the search information entered in the Quick Search Text Box,
  it should be verified that the results are displayed in the Gift Card List.

    Then quick clicks the search button
    Then Writes the name of the gift card named -friends
    Then the result is verified


  Scenario:US_036 --> TC_014 When the Add New button is clicked on the Gift Cart List page,
  it should be verified that it redirects to the Create Gift Card page.

    Then Click the Add New button;
    Then Tests going to the Create Gift Card page

  Scenario:US_036 --> TC_015 Verify that Name, SKU, Thumbnail Image, Selling Price, Shipping Methods,
  Galary Image, Discount, Discount Type, Status, Discount Period and Tag Texts are visible on the Create Gift Card page.

    Then Click the Add New button;
    Then Name,Verify that Tag Texts are visible.
    Then SKU,Verify that Tag Texts are visible.
    Then Thumbnail Image, Verify that Tag Texts are visible.
    Then Selling Price,Verify that Tag Texts are visible.
    Then Shipping Methods,Verify that Tag Texts are visible.
    Then Galary Image,Verify that Tag Texts are visible.
    Then Discount,Verify that Tag Texts are visible.
    Then Discount Type,Verify that Tag Texts are visible.
    Then Status,Verify that Tag Texts are visible.
    Then Discount Period Verify that Tag Texts are visible.
    Then Tag Verify that Tag Texts are visible.

  Scenario:US_036 --> TC_016 After entering the desired information in Name, SKU,Thumbnail Image, Selling Price
  Shipping Methods, Galary Image, Discount, Discount Type, Discount Period, Tag and Description Text Boxes,
  selecting Status, clicking the Save button,it should be verified that a new Gift Card has been created.

    Then Click the Add New button;
    Then Name, SKU, Thumbnail Image, Selling Price, Shipping Methods, Galary Image, Discount,
    Then Discount Type, Discount Period, Tag and Description
    Then When the desired information is entered in the Text Boxes and the Status is selected,and the Save button is clicked;It should be verified that a new Gift Card has been created.


