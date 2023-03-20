Feature: US_021 As a user, I should be able to access the Return & Dispute page and use its functions for the orders I wish to return
  Scenario: Verify that the Refund & Dispute page is accessible.
    Given The application extension is entered "url" into the browser
    Then The Subscribe popup closes
    Then Click on the Login button
    Then Type valid Email and Password
    Then Click the Sign In button
    Then Click on the Dashboard link on the page that opens
    Then Verify that the Refund & Dispute page is accessible
    Then On the page that opens, it is displayed in the Return List of the products whose return process has been initiated
    Then Verify the addresses of the Order ID, Order Date, Status, Request Submission Date and Order Amount in the Refund List
    And On the details page opened with the View Details button, it should be verified that the current status of the order whose return request is opened can be viewed.
    And On the opened details page, it should be verified that at least one of the Start, Processing and Complete states are active.
    And Verify that Texts with explanations of Start, Processing and Complete states are visible on the opened details page
    And It should be verified that the Pick Up Info information is displayed on the details page that opens
    Then The pages is closed




