Feature: US_15 As a user, I want to have a page where I can organize the notifications
  from the site and see the notifications.

  Scenario: TC_133 Verify that the Notification page is accessible.

    Given go to "url"
    Then  close popup
    Then  click log in
    Then  type valid email
    And   type valid password
    Then  click sign in
    Then  click dashboard button
    And   scroll down to see Side Bar
    Then  click Notification button on the side bar
    Then  verify that it is navigated to Notification page
    Then  terminate test

  Scenario:TC_134 It should be verified that the notifications sent from the site are displayed
  in the Notifications List on the Notification page.


    Given go to "url"
    Then  close popup
    Then  click log in
    Then  type valid email
    And   type valid password
    Then  click sign in
    Then  click dashboard button
    And   scroll down to see Side Bar
    Then  click Notification button on the side bar
    Then  verify Notifications List elements are displayed
    Then  verify View button of first notification is displayed
    And   terminate test


  Scenario: TC_135	In the Notification List, it should be verified that the notifications are listed
  with the Title and Date information.
    Given go to "url"
    Then  close popup
    Then  click log in
    Then  type valid email
    And   type valid password
    Then  click sign in
    Then  click dashboard button
    And   scroll down to see Side Bar
    Then  click Notification button on the side bar
    Then  verify the title and date of Notifications are displayed
    And   terminate test


  Scenario: TC_136	When you click on the view link under the action column in the Notification List,
  it should be verified that the link redirects to the relevant notification page.

    Given go to "url"
    Then  close popup
    Then  click log in
    Then  type valid email
    And   type valid password
    Then  click sign in
    Then  click dashboard button
    And   scroll down to see Side Bar
    Then  click Notification button on the side bar
    Then  click View button under Action column
    Then  verify My Purchase Order Details Page is opened


  Scenario: TC_137	When the Setting button is clicked, it should be verified that
  the Notifications Settings List is on the page that opens.

    Given go to "url"
    Then  close popup
    Then  click log in
    Then  type valid email
    And   type valid password
    Then  click sign in
    Then  click dashboard button
    And   scroll down to see Side Bar
    Then  click Notification button on the side bar
    Then  click Setting button on the Notification board
    Then  verify the relevant page of Setting is opened
    And   terminate test


  Scenario: TC_138	It should be verified that the Types of the Events found in
  the Notification Setting list are changeable.

    Given go to "url"
    Then  close popup
    Then  click log in
    Then  type valid email
    And   type valid password
    Then  click sign in
    Then  click dashboard button
    And   scroll down to see Side Bar
    Then  click Notification button on the side bar
    Then  click Setting button on the Notification board
    Then  scroll down to see all notifications setting menu
    Then  click Event- Offline recharge, Type- System checkbox
    Then  verify Event- Offline recharge, Type- System checkbox is unchecked
    Then  click Event- Order confirmation, Type- System checkbox
    Then  verify Event- Order confirmation, Type- System checkbox is unchecked
    Then  click Event- Ordered, Type- System checkbox
    Then  verify Event- Ordered, Type- System checkbox is unchecked
    Then  click Event- Ordered, Type- Email checkbox
    Then  verify Event- Ordered, Type- Email checkbox is unchecked
    Then  click Event- Processing, Type- System checkbox
    Then  verify Event- Processing, Type- System checkbox is unchecked
    Then  click Event- Processing, Type- Email checkbox
    Then  verify Event- Processing, Type- Email checkbox is unchecked
    Then  click Event- Shipped, Type- Email checkbox
    Then  verify Event- Shipped, Type- Email checkbox is unchecked
    Then  click Event- Shipped, Type- System checkbox
    Then  verify Event- Shipped, Type- System checkbox is unchecked
    Then  click Event- Received, Type- System checkbox
    Then  verify Event- Received, Type- System checkbox is unchecked
    Then  click Event- Received, Type- Email checkbox
    Then  verify Event- Received, Type- Email checkbox is unchecked
    Then  click Event- Delivered, Type- Email checkbox
    Then  verify Event- Delivered, Type- Email checkbox is unchecked
    Then  click Event- Delivered, Type- System checkbox
    Then  verify Event- Delivered, Type- System checkbox is unchecked
    Then  click Event- New Order, Type- System checkbox
    Then  verify Event- New Order, Type- System checkbox is unchecked
    And   terminate test
