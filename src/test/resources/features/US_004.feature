Feature: US_004 Verify that the functions in the submenu of the Home page are visible and active

  Scenario: TC_101 Verify that My Account, Order Status, Referral, Coupons links are visible

    Given go to "Url"
    Then  close popup
    Then  scroll down
    *     verify required links in TC_101 are visible
    And   quit driver


  Scenario: TC_102 As a user, verify that clicking the My Account, Order Status, Referral, Coupons links redirects to the relevant page

    Given go to "Url"
    Then  close popup
    Then  scroll down
    * verify the clicked links in TC_102 navigates to relevant pages
    And   quit driver


  Scenario: TC_103 Verify that the About Us, Contact Us, Career, Refund Policy, Terms & Condition links are visible

    Given go to "Url"
    Then  close popup
    And   scroll down
    Then  verify required links in TC_103 are visible
    And   quit driver


  Scenario: TC_104 As a visitor, verify that clicking on About Us, Contact Us, Career, Refund Policy, Terms & Condition links redirects to the relevant pages

    Given go to "Url"
    Then  close popup
    And   scroll down
    Then  verify the clicked links in TC_104 navigates to relevant pages
    And   quit driver


  Scenario: TC_105 Verify that the Google Play and Apple Store buttons are visible

    Given go to "Url"
    Then  close popup
    And   scroll down
    Then  verify Google Play  and Apple Store buttons are visible
    And   quit driver


  Scenario: TC_106 Verify as a visitor that Google Play and Apple Store buttons redirect to their relevant pages

    Given go to "Url"
    Then  close popup
    And   scroll down
    Then  verify Google Play and Apple Store buttons navigate to relevant pages after clicking
    And   quit driver


  Scenario: TC_107 Verify that clicking the Go to Top button goes to the top of the home page

    Given go to "Url"
    Then  close popup
    And   scroll down
    Then  verify clicking Go To Top button goes top of the home page
    And   quit driver


  Scenario: TC_108 Verify that facebook, twitter, linkedin and instagram icons are visible

    Given go to "Url"
    Then  close popup
    And   scroll down
    *     verify required icons are visible
    And   quit driver


  Scenario: TC_109 Verify that clicking on facebook, twitter, linkedin and instagram icons

    Given go to "Url"
    Then  close popup
    And   scroll down
    Then  verify clicked icons navigate to relevant pages
    And   quit driver













