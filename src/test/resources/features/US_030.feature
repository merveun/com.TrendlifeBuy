Feature: Bir yönetici olarak sitedeki etkinliklerden haberdar
  olabilmek icin ana sayfada bildirimler kisminin olmasini istiyorum

  Background:
    Given Login on the "adminUrl" page.
    Then Click on the notifications icon.

  Scenario: Notifications icon Verify that the Notifications text is visible in the pop-up window.
    Then Tests that notifications appears.

  Scenario:  US_30---->TC02 Click the Setting button in the window that opens when the Notifications icon is clicked. when clicked, it should be verified that it redirects to the user-notification page
    Then clicks the settings button
    And Verifies that you are going to the user-notification page

  Scenario: US_30---->TC03 Personal Notification Setting on User-Notification page Verify that the information message type (active/passive) can be changed in the list.
    Then clicks the settings button
    Then deactivates it by clicking on the message type of the first notification
    And  Activates by clicking on the message type of the first notification.

  Scenario: US_30---->TC04 When the Notifications icon is clicked, the Read All menu appears. when the button is clicked, it should be verified that the information messages (as read) are deleted from the window.
    #Then Clicks the Read All button
    Then tests that notifications are cleared

  Scenario: US_30---->TC05 Clicking on the Notifications icon when clicking the View button in the drop-down menu, it should be verified that it redirects to the relevant page.
    Then clicks the view button
    And tests that notifications go to the page they opened.
Feature: Bir yönetici olarak sitedeki etkinliklerden haberdar
  olabilmek icin ana sayfada bildirimler kisminin olmasini istiyorum

  Background:
    Given Login on the "adminUrl" page.
    Then Click on the notifications icon.

  Scenario: Notifications icon Verify that the Notifications text is visible in the pop-up window.
    Then Tests that notifications appears.

  Scenario:  US_30---->TC02 Click the Setting button in the window that opens when the Notifications icon is clicked. when clicked, it should be verified that it redirects to the user-notification page
    Then clicks the settings button
    And Verifies that you are going to the user-notification page

  Scenario: US_30---->TC03 Personal Notification Setting on User-Notification page Verify that the information message type (active/passive) can be changed in the list.
    Then clicks the settings button
    Then deactivates it by clicking on the message type of the first notification
    And  Activates by clicking on the message type of the first notification.

  Scenario: US_30---->TC04 When the Notifications icon is clicked, the Read All menu appears. when the button is clicked, it should be verified that the information messages (as read) are deleted from the window.
    Then Clicks the Read All button
    And tests that notifications are cleared

  Scenario: US_30---->TC05 Clicking on the Notifications icon when clicking the View button in the drop-down menu, it should be verified that it redirects to the relevant page.
    Then clicks the view button
    And tests that notifications go to the page they opened.