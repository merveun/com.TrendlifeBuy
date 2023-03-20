Feature: US_021 As a user, I should be able to access the Return & Dispute page and use its functions for the orders I wish to return
  Scenario: Verify that the Refund & Dispute page is accessible.
    Given The application extension is entered "urlAdmin" into the browser
    Then The Subscribe popup closes
    Then Click on the Login button
    Then Type valid Email and Password
    Then Click the Sign In button
    And Clicks the Customer menu in the Dashboard Side Bar
    And The All Customer button on the Dashboard Side Bar is clicked
    And Verify that the All Customer List is visible on the All Customer page
    And The radio button in the Is Active column of the All Customer List is clicked, it should be verified whether the active state of the customer has changed
    And Clicking the Active Customer button
    And On the page that opens, click the Active Customer button
    And The user verifies the DETAILS button is verisible
    And The user verifies the EDIT button is verisible
    And The user verifies the DELETE button is verisible





    And It should be verified that the Customer Profile page is visible when the Details link under the Select tab is clicked
    And Verify that the texts "Customer Profile, Name, Email, Phone, Registered Date, Active Status, Order Summary, Total Orders, Confirmed Order, Pending Order, Completed Order, Cancelled Order, Wallet Summary, Total Recharge, Pending Balance Approval and Total Balance are visible
    And It should be verified that Orders, Wallet Histories, Adresses information can be listed from the selected Customer Profile
    And The Wallet Histories button is clicked on the DATE, USER , TXT ID, AMOUNT, TYPE, PAYMENT METHOD and APPROVAL headings above the list that appears on the page, it should be verified that the list is ordered according to these headings
    And The Adresses button is clicked on the SL, FULL NAME, ADRESS, REGION, EMAIL, PHONE NUMBER and POSTCODE headings above the list that appears on the page, the list should be sorted accordingly with these headings
    And Verify that it is possible to search by email in the List from the Quick Search Text Box
    And It should be verified that the Update Customer page is visible when the Edit link under the Select tab is clicked
    And On the Update Customer Page, the Basic Info Information can be seen, and when the Update button is clicked, it should be verified that the relevant customer information is updated
    And Clicking the Inactive Customer button on the All Customer page should verify that the Inactive Customer list is visible
    And Verify that Details, Edit, Delete links are visible on the select tab under the Action title in the Inactive Customer List
    And Basic Info Information can be seen on the Update Customer Page and it should be verified that the relevant customer information can be updated when the Update button is clicked
    And The Delete link under the Select tab is clicked, it should be verified that the Delete window is visible and the Delete operation can be performed in the opened window
    And Clicking the Create Customer button on the All Customer page should verify that the Create Customer list is visible
    And Verify that Details, Edit, Delete links are visible in the select tab under the Action title in the Create Customer List
    Then The pages is closed