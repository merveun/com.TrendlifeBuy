Feature: US_033 As an administrator, I want a page on the site where I can see all active and inactive customers together
  @smokeDemo
  Scenario: TC_001 When the All Customer button on the Dashboard Side Bar is clicked,
                   it should be verified that the All customer page can be accessed
    Given go to the browser is "urlAdmin"
    Then  enter a valid the "SAdminName" and "SAdminPassword"
    And   the Signed in the button is click
    Then  clicks in the Customer button
    Then  clicks the All Customer and verified that it All Customer page
    And   terminate the test

  Scenario: TC_002 Verify that the All Customer List is visible on the All Customer page
    Given go to the browser is "urlAdmin"
    Then  enter a valid the "SAdminName" and "SAdminPassword"
    And   the Signed in the button is click
    Then  clicks in the Customer button
    Then  clicks in the All Customer
    Then  verified that the All Customer List is visible
    And   terminate the test

  Scenario: TC_003 When the radio button in the Is Active column of the All Customer List is clicked,
                   it should be verified whether the active state of the customer has changed
    Given go to the browser is "urlAdmin"
    Then  enter a valid the "SAdminName" and "SAdminPassword"
    And   the Signed in the button is click
    Then  clicks in the Customer button
    Then  clicks the All Customer and verified that it All Customer page
    Then  verified that the active state of the customer has changed visible
    And   terminate the test

  Scenario: TC_004 Clicking the Active Customer button on the All Customer page should verify that the Active customer list is visible
    Given go to the browser is "urlAdmin"
    Then  enter a valid the "SAdminName" and "SAdminPassword"
    And   the Signed in the button is click
    Then  clicks in the Customer button
    Then  clicks the All Customer and verified that it All Customer page
    Then  clicks Active Customer
    Then  verified that the Active Customer List is visible
    And   terminate the test

  Scenario: TC_005 Verify that Details, Edit, Delete links are visible on the select tab under the Action title in the Active Customer List
    Given go to the browser is "urlAdmin"
    Then  enter a valid the "SAdminName" and "SAdminPassword"
    And   the Signed in the button is click
    Then  clicks in the Customer button
    Then  clicks the All Customer and verified that it All Customer page
    Then  clicks first customer plus button
    And   clicks SELECT button
    Then  verified that the DETAILS,EDIT,DELETE are visible
    And   terminate the test

  Scenario: TC_006 It should be verified that the Customer Profile page is visible when the Details link under the Select tab is clicked
    Given go to the browser is "urlAdmin"
    Then  enter a valid the "SAdminName" and "SAdminPassword"
    And   the Signed in the button is click
    Then  clicks in the Customer button
    Then  clicks the All Customer and verified that it All Customer page
    Then  clicks first customer plus button
    And   clicks SELECT button
    Then  clicks DETAILS button
    Then  verified that the Customer Profile is visible
    And   terminate the test

  Scenario: TC_007 Verify that the texts "Customer Profile, Name, Email, Phone, Registered Date, Active Status,
                   Order Summary, Total Orders, Confirmed Order, Pending Order, Completed Order, Cancelled Order,
                   Wallet Summary, Total Recharge, Pending Balance Approval and Total Balance are visible
    Given go to the browser is "urlAdmin"
    Then  enter a valid the "SAdminName" and "SAdminPassword"
    And   the Signed in the button is click
    Then  clicks in the Customer button
    Then  clicks the All Customer and verified that it All Customer page
    Then  clicks first customer plus button
    And   clicks SELECT button
    Then  clicks DETAILS button
    And   verified that the Customer Profile and informations is visible
    And   terminate the test

  Scenario: TC_008 It should be verified that Orders, Wallet Histories, Adresses information can be listed from the selected Customer Profile
    Given go to the browser is "urlAdmin"
    Then  enter a valid the "SAdminName" and "SAdminPassword"
    And   the Signed in the button is click
    Then  clicks in the Customer button
    Then  clicks the All Customer and verified that it All Customer page
    Then  clicks first customer plus button
    And   clicks SELECT button
    Then  clicks DETAILS button
    And   verified that the Customer Profile is visible
    Then  verify ORDERS,WALLET HISTORIES,ADDRESSES are visible
    And   terminate the test

  Scenario: TC_009 When the Wallet Histories button is clicked on the DATE, USER , TXN ID, AMOUNT, TYPE, PAYMENT METHOD and
                   APPROVAL headings above the list that appears on the page, verified that the list is ordered according to these headings.
    Given go to the browser is "urlAdmin"
    Then  enter a valid the "SAdminName" and "SAdminPassword"
    And   the Signed in the button is click
    Then  clicks in the Customer button
    Then  clicks the All Customer and verified that it All Customer page
    Then  clicks first customer plus button
    And   clicks SELECT button
    Then  clicks DETAILS button
    And   verified that the Customer Profile is visible
    Then  verify ORDERS,WALLET HISTORIES,ADDRESSES are visible
    Then  click WALLET HISTORIES is visible
    Then  Verify that the requested information is properly sorted on the Wallet Histories page.
    And   terminate the test

  Scenario: TC_010 When the Addresses button is clicked on the SL, FULL NAME, ADDRESS, REGION, EMAIL, PHONE NUMBER and
                   POSTCODE headings above the list that appears on the page, the list should be sorted accordingly with these headings.
    Given go to the browser is "urlAdmin"
    Then  enter a valid the "SAdminName" and "SAdminPassword"
    And   the Signed in the button is click
    Then  clicks in the Customer button
    Then  clicks the All Customer and verified that it All Customer page
    Then  clicks first customer plus button
    And   clicks SELECT button
    Then  clicks DETAILS button
    And   verified that the Customer Profile is visible
    Then  click ADDRESSES is visible
    Then  Verify that the requested information is properly sorted on the ADDRESSES page
    And   terminate the test

  Scenario: TC_011 Verify that it is possible to search by email in the List from the Quick Search Text Box
    Given go to the browser is "urlAdmin"
    Then  enter a valid the "SAdminName" and "SAdminPassword"
    And   the Signed in the button is click
    Then  clicks in the Customer button
    Then  clicks the All Customer and verified that it All Customer page
    Then  click Quick Search Text Box is to search by email
    And   terminate the test

  Scenario: TC_012 It should be verified that the Update Customer page is visible when the Edit link under the Select tab is clicked
    Given go to the browser is "urlAdmin"
    Then  enter a valid the "SAdminName" and "SAdminPassword"
    And   the Signed in the button is click
    Then  clicks in the Customer button
    Then  clicks the All Customer and verified that it All Customer page
    Then  clicks first customer plus button
    And   clicks SELECT button
    Then  click EDIT button
    And   verify that the Update Customer and Basic Info Information is visible
    And   terminate the test

  Scenario: TC_013 On the Update Customer Page, the Basic Info Information can be seen,
                   and when the Update button is clicked, it should be verified that the relevant customer information is updated.
    Given go to the browser is "urlAdmin"
    Then  enter a valid the "SAdminName" and "SAdminPassword"
    And   the Signed in the button is click
    Then  clicks in the Customer button
    Then  clicks the All Customer and verified that it All Customer page
    Then  clicks first customer plus button
    And   clicks SELECT button
    Then  click EDIT button
    And   verify that the Update Customer and Basic Info Information is visible
    Then  click UPDATE button
    And   verify Updated successfully is visible
    And   terminate the test

  Scenario: TC_014 When the Delete link under the Select tab is clicked, it should be verified that
                   the Delete window is visible and the Delete operation can be performed in the opened window
    Given go to the browser is "urlAdmin"
    Then  enter a valid the "SAdminName" and "SAdminPassword"
    And   the Signed in the button is click
    Then  clicks in the Customer button
    Then  clicks the All Customer and verified that it All Customer page
    Then  clicks first customer plus button
    And   clicks SELECT button
    Then  click CUSTOMER DELETE button
    Then  click DELETE box button
    And   verify DELETE Successfully is visible
    And   terminate the test


  Scenario: TC_015 Clicking the Inactive Customer button on the All Customer page should verify that the Inactive Customer list is visible
    Given go to the browser is "urlAdmin"
    Then  enter a valid the "SAdminName" and "SAdminPassword"
    And   the Signed in the button is click
    Then  clicks in the Customer button
    Then  clicks the All Customer and verified that it All Customer page
    Then  clicks InActive Customer and verified that the InActive Customer List is visible
    And   terminate the test

  Scenario: TC_016 Verify that DETAILS, EDIT, DELETE links are visible on the SELECT tab under the Action title in the Inactive Customer List
    Given go to the browser is "urlAdmin"
    Then  enter a valid the "SAdminName" and "SAdminPassword"
    And   the Signed in the button is click
    Then  clicks in the Customer button
    Then  clicks the All Customer and verified that it All Customer page
    Then  clicks InActive Customer and verified that the InActive Customer List is visible
    Then  clicks InActive Customer page first customer plus button
    And   clicks InActive SELECT button
    Then  verify InActive DETAILS,EDIT,DELETE are visible
    And   terminate the test

  Scenario: TC_017 Basic Info Information can be seen on the Create Customer Page and
                   verified that the relevant customer information can be updated when the Update button is click
    Given go to the browser is "urlAdmin"
    Then  enter a valid the "SAdminName" and "SAdminPassword"
    And   the Signed in the button is click
    Then  clicks in the Customer button
    Then  clicks the All Customer and verified that it All Customer page
    Then  clicks Create Customer
    Then  replaced with relevant customer information
    Then  click UPDATE button
    And   verify Updated successfully is visible
    And   terminate the test

  Scenario: TC_018 Clicking the Create Customer button on the All Customer page should verify that the Create Customer list is visible
    Given go to the browser is "urlAdmin"
    Then  enter a valid the "SAdminName" and "SAdminPassword"
    And   the Signed in the button is click
    Then  clicks in the Customer button
    Then  clicks the All Customer and verified that it All Customer page
    Then  clicks Create Customer
    And   verify Create Customer List is visible
    And   terminate the test




