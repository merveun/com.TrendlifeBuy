Feature: US_021 As a user, I should be able to access the Return & Dispute page and use its functions for the orders I wish to return
  Scenario: Verify that the Refund & Dispute page is accessible.
    Given The application extension is entered "url" into the browser
    Then The Subscribe popup closes
    Then Click on the Login button
    Then Type valid Email and Password
    Then Click the Sign In button
    Then Click on the Dashboard link on the page that opens
    And Verify that the All Submitted Ticket List is visible on the Support Ticket page
    And In the All Submitted Ticket List, it should be verified that the Tickets are listed with the Ticket ID, Subject, Priority, Last Update information
    And The View button is clicked on the Action column in the All Submitted Ticket List, it should be verified that the data of the relevant Ticket is displayed on the Show page that opens
    And On the show page where the ticket information is displayed, it should be verified that the Status, Priority, Category information of the ticket is displayed
    And It should be verified that the response returned to the Ticket opened on the Show page is displayed
    And It should be verified that the ticket can be answered with the Reply button on the Show page
    And It should be verified that the Tickets shown in the All Submitted Ticket List are can be filtered according to All Ticket, Pending, On Going, Completed, Closed information
    And It should be verified that the Create new ticket page is accessed with the Add New button
    And By entering Subject, Category, Priority and Description, it should be verified that a new ticket is opened with the Create new button
    Then The pages is closed
