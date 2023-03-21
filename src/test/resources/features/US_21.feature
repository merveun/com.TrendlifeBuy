Feature: US_021 As a user, I should be able to access the Return & Dispute page and use its functions for the orders I wish to return
  Scenario: TC_001 Verify that the Refund & Dispute page is accessible
    Given go to the browser "url"
    Then  close popup windows
    Then  the login button is click
    Then  enter a valid "SuserName" and "SuserPassword"
    And   the Signed in button is click
    Then  click the DashBoard button
    Then  click Refund & Dispute and verified that it redirects to Refund & Dispute page
    And   terminate the test

  Scenario: TC_002 It is verified that the products whose return process is initiated are displayed in the Return List
    Given go to the browser "url"
    Then  close popup windows
    Then  the login button is click
    Then  enter a valid "SuserName" and "SuserPassword"
    And   the Signed in button is click
    Then  click the DashBoard button
    Then  click Refund & Dispute and verified that it redirects to Refund & Dispute page
    Then  verified that it whose return process is initiated are displayed in the Return List
    And   terminate the test

  Scenario: TC_003 Order ID, Order Date, Status, Request Submission Date and Order Amount information appear in the Refund List
    Given go to the browser "url"
    Then  close popup windows
    Then  the login button is click
    Then  enter a valid "SuserName" and "SuserPassword"
    And   the Signed in button is click
    Then  click the DashBoard button
    Then  click Refund & Dispute and verified that it redirects to Refund & Dispute page
    Then  verify Order ID information is visible
    Then  verify Order Date information is visible
    Then  verify Status information is visible
    Then  verify Request Sent Date information is visible
    Then  verify Order Amount information is visible
    And   terminate the test


  Scenario: TC_004 Verify On the details page opened with the View Details button, the current status of the order for which a return request has been opened
    Given go to the browser "url"
    Then  close popup windows
    Then  the login button is click
    Then  enter a valid "SuserName" and "SuserPassword"
    And   the Signed in button is click
    Then  click the DashBoard button
    Then  click Refund & Dispute and verified that it redirects to Refund & Dispute page
    Then  click View Details
    Then  verify current status of the order information is visible
    And   terminate the test


  Scenario: TC_005 It appears that at least one operator is active from Start, Processing, and Completed states
    Given go to the browser "url"
    Then  close popup windows
    Then  the login button is click
    Then  enter a valid "SuserName" and "SuserPassword"
    And   the Signed in button is click
    Then  click the DashBoard button
    Then  click Refund & Dispute and verified that it redirects to Refund & Dispute page
    Then  click View Details
    Then  verify operator is active from Start visible
    Then  verify operator is active from Processing visible
    Then  verify operator is active from Completed visible
    And   terminate the test

  Scenario: TC_006 Appears with Texts with explanations of Start, Processing, and Completed states
    Given go to the browser "url"
    Then  close popup windows
    Then  the login button is click
    Then  enter a valid "SuserName" and "SuserPassword"
    And   the Signed in button is click
    Then  click the DashBoard button
    Then  click Refund & Dispute and verified that it redirects to Refund & Dispute page
    Then  click View Details
    Then  verify Start operator and explanation visible
    Then  verify Processing operator and explanation visible
    Then  verify Completed operator and explanation visible
    And   terminate the test

  Scenario: TC_007 Verify that the Pick Up Info information is displayed on the details
    Given go to the browser "url"
    Then  close popup windows
    Then  the login button is click
    Then  enter a valid "SuserName" and "SuserPassword"
    And   the Signed in button is click
    Then  click the DashBoard button
    Then  click Refund & Dispute and verified that it redirects to Refund & Dispute page
    Then  click View Details
    Then  verify Pick Up Info information is visible
    And   terminate the test
















