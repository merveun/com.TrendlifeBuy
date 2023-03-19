Feature: US_023 As a user, I would like to have a page where I can open a support ticket and see the status of the tickets
                I have opened in order to solve the problems I encountered on the site
  Scenario: TC_001 Verify that the Support Ticket page is accessible
    Given go to the browser "url"
    Then  close popup windows
    Then  the login button is click
    Then  enter a valid "SuserName" and "SuserPassword"
    And   the Signed in button is click
    Then  click the DashBoard button
    Then  click Support Ticket and verified that it redirects to Support Ticket page
    And   terminate the test

  Scenario: TC_002 Verify on Support Ticket page of All Submitted Ticket List
    Given go to the browser "url"
    Then  close popup windows
    Then  the login button is click
    Then  enter a valid "SuserName" and "SuserPassword"
    And   the Signed in button is click
    Then  click the DashBoard button
    Then  click Support Ticket and verified that it redirects to Support Ticket page
    Then  verify All Submitted Ticket List is visible
    And   terminate the test

  Scenario: TC_003 In the All Submitted Ticket List, TicketSL, Ticket ID, Subject, Priority, Last Updated, Action information and their lists are verified
    Given go to the browser "url"
    Then  close popup windows
    Then  the login button is click
    Then  enter a valid "SuserName" and "SuserPassword"
    And   the Signed in button is click
    Then  click the DashBoard button
    Then  click Support Ticket and verified that it redirects to Support Ticket page
    Then  Verify that all categories under the All Submitted Ticket menu are seen
    And   terminate the test

  Scenario: TC_004 When the View button is clicked on the Action column in the All Submitted Ticket List,
            it should be verified that the data of the relevant Ticket is displayed on the Show page that opens
    Given go to the browser "url"
    Then  close popup windows
    Then  the login button is click
    Then  enter a valid "SuserName" and "SuserPassword"
    And   the Signed in button is click
    Then  click the DashBoard button
    Then  click Support Ticket and verified that it redirects to Support Ticket page
    Then  click View button
    Then  verify Ticket informations is visible
    And   terminate the test


  Scenario: TC_005 On the show page where the ticket information is displayed, verified that
            the Status, Priority, Category information of the ticket is displayed
    Given go to the browser "url"
    Then  close popup windows
    Then  the login button is click
    Then  enter a valid "SuserName" and "SuserPassword"
    And   the Signed in button is click
    Then  click the DashBoard button
    Then  click Support Ticket and verified that it redirects to Support Ticket page
    Then  click View button
    Then  verify Status,Priority, and Category information is visible
    And   terminate the test

  Scenario: TC_006 Verify that the response returned to the Ticket opened on the Show page is displayed
    Given go to the browser "url"
    Then  close popup windows
    Then  the login button is click
    Then  enter a valid "SuserName" and "SuserPassword"
    And   the Signed in button is click
    Then  click the DashBoard button
    Then  click Support Ticket and verified that it redirects to Support Ticket page
    Then  click View button
    Then  verify Status information is visible
    And   terminate the test

  Scenario: TC_007 Verify that the ticket can be answered with the Reply button on the Show page
    Given go to the browser "url"
    Then  close popup windows
    Then  the login button is click
    Then  enter a valid "SuserName" and "SuserPassword"
    And   the Signed in button is click
    Then  click the DashBoard button
    Then  click Support Ticket and verified that it redirects to Support Ticket page
    Then  click View button
    Then  click Reply button
    Then  verify ticket can be answered form is visible
    And   terminate the test

  Scenario: TC_008 Verify that the Tickets shown in the All Submitted Ticket List are can be filtered according to All Ticket,
             Pending, On Going, Completed, Closed information
    Given go to the browser "url"
    Then  close popup windows
    Then  the login button is click
    Then  enter a valid "SuserName" and "SuserPassword"
    And   the Signed in button is click
    Then  click the DashBoard button
    Then  click Support Ticket and verified that it redirects to Support Ticket page
    Then  click All Ticket button
    Then  choose Pending link and click Pending information is visible
    Then  choose On Going link and click On Going information is visible
    Then  choose Completed link and click Completed information is visible
    Then  choose Closed link and click Closed information is visible
    And   terminate the test

  Scenario: TC_009 Verify that the Create new ticket page is accessed with the Add New button
    Given go to the browser "url"
    Then  close popup windows
    Then  the login button is click
    Then  enter a valid "SuserName" and "SuserPassword"
    And   the Signed in button is click
    Then  click the DashBoard button
    Then  click Support Ticket and verified that it redirects to Support Ticket page
    Then  click Add New button
    Then  verify Create new ticket page is visible
    And   terminate the test

  Scenario: TC_010 By entering Subject, Category, Priority, and Description, verified that a new ticket is opened with the Create new button
    Given go to the browser "url"
    Then  close popup windows
    Then  the login button is click
    Then  enter a valid "SuserName" and "SuserPassword"
    And   the Signed in button is click
    Then  click the DashBoard button
    Then  click Support Ticket and verified that it redirects to Support Ticket page
    Then  click Add New button
    Then  verify Subject is visible and write text
    Then  verify Category is visible and write text
    Then  verify Priority is visible and write text
    Then  verify Description is visible and write text
    Then  click Creat Now button
    Then  verify that a new ticket list is visible
    And   terminate the test