Feature: US_015 As a user, I would like to have a special dashboard page on the site to control my operations and settings on the site.

  Scenario: TC_123 When you click on the Dashboard link from the main page,
  it is verified that you have gone to the relevant page.

    Given go to "url"
    Then  close popup
    Then  all-in-one logIn
    Then  verify dashbord button is displayed
    And   terminate test


  Scenario:  TC_124 It should be verified that the User Name and
  User E-mail address are displayed on the Dashboard page.

    Given go to "url"
    Then  close popup
    Then  all-in-one logIn
    Then  click dashbord button
    Then  verify user name is displayed
    Then  verify user email is displayed
    And   terminate test


  Scenario: TC_125 Verify that All Order, My Wishlist, Refund Success,
  Product in Cart, Coupon Used, Completed Order boards are visible on the Dashboard page.

    Given go to "url"
    Then  close popup
    Then  all-in-one logIn
    Then  click dashbord button
    Then  verify All Order board is displayed
    Then  verify My Wishlist board is displayed
    Then  verify Refund Success board is displayed
    Then  verify Product in Cart board is displayed
    Then  verify Coupon Used board is displayed
    Then  verify Completed Order board is displayed
    And   terminate test

  Scenario:  TC_126 Verify that the Total Balance amount is displayed on the Dashboard page.

    Given go to "url"
    Then  close popup
    Then  all-in-one logIn
    Then  click dashbord button
    Then  verify Total Balance amount is displayed

  Scenario: TC_127 When the Recharge Wallet button is clicked on the Dashboard page,
  it should be verified that the wallet can be loaded in the window that opens.

  Scenario: TC_128 It should be verified that when clicking the See All button on the
  Purchase History board on the Dashboard page, it directs the user to the Purchase History page.


  Scenario: TC_129 It should be verified that clicking the See All button on the My Wishlist board on the
  Dashboard page redirects the user to the My Wishlist page.


  Scenario: TC_130 It should be verified that it redirects the user to the Recent Order page when
  the See All button is clicked on the Recent Order panel on the Dashboard page.


  Scenario: TC_131 When clicking the See All button on the Product in Cart board on the Dashboard page,
  it should be verified that it redirects the user to the Cart page.


  Scenario: TC_132  When the Dashboard, Purchase History, My Wishlist, My Order, Giftcard, My Wallet, My Coupons,
  Refund & Dispute, My Account, Digital Products, Referral, Support Ticket, Notification links are
  clicked on the Side Bar on the Dashboard page, it should be verified that it redirects to the relevant page.
