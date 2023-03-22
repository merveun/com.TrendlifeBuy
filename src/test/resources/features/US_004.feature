@smoke
Feature: US_004 Verify that the functions in the submenu of the Home page are visible and active

  Scenario: TC_101 Verify that My Account, Order Status, Referral, Coupons links are visible

    Given go to "Url"
    Then  close popup
    Then  scroll down
    Then  verify My Account link is visible
    Then  verify Order Status link is visible
    Then  verify Referral link is visible
    Then  verify Coupons link is visible
    And   terminate test


  Scenario: TC_102 As a user, verify that clicking the My Account, Order Status, Referral, Coupons links redirects to the relevant page

    Given go to "Url"
    Then  close popup
    Then  scroll down
    Then  verify My Account link navigates to the the relevant page after clicking
    And   scroll down
    Then  verify Order Status link navigates to the the relevant page after clicking
    And   scroll down
    Then  verify Referral link navigates to the the relevant page after clicking
    And   scroll down
    Then  verify Coupons link navigates to the the relevant page after clicking
    And   terminate test


  Scenario: TC_103 Verify that the About Us, Contact Us, Career, Refund Policy, Terms & Condition links are visible

    Given go to "Url"
    Then  close popup
    And   scroll down
    Then  verify About Us link is visible
    Then  verify Contact Us link is visible
    Then  verify Career link is visible
    Then  verify Refund Policy Us link is visible
    Then  verify About Us link is visible
    Then  verify Terms & Condition link is visible
    And   terminate test


  Scenario: TC_104 As a visitor, verify that clicking on About Us, Contact Us, Career, Refund Policy, Terms & Condition links redirects to the relevant pages

    Given go to "Url"
    Then  close popup
    And   scroll down
    Then  verify About Us link navigates to the the relevant page after clicking
    And   scroll down
    Then  verify Contact Us link navigates to the the relevant page after clicking
    And   scroll down
    Then  verify Career link navigates to the the relevant page after clicking
    And   scroll down
    Then  verify Refund Policy Us link navigates to the the relevant page after clicking
    And   scroll down
    Then  verify About Us link navigates to the the relevant page after clicking
    And   scroll down
    Then  verify Terms & Condition link navigates to the the relevant page after clicking
    And   terminate test


  Scenario: TC_105 Verify that the Google Play and Apple Store buttons are visible

    Given go to "Url"
    Then  close popup
    And   scroll down
    Then  verify Google Play button is visible
    Then  verify Apple Store button is visible
    And   terminate test


  Scenario: TC_106 Verify as a visitor that Google Play and Apple Store buttons redirect to their relevant pages

    Given go to "Url"
    Then  close popup
    And   scroll down
    Then  verify Google Play button navigates to relevant page after clicking
    Then  navigate page back
    #Then  verify Apple Store button navigates to relevant page after clicking
    And   terminate test


  Scenario: TC_107 Verify that clicking the Go to Top button goes to the top of the home page

    Given go to "Url"
    Then  close popup
    And   scroll down
    Then  verify clicking Go To Top button goes top of the home page
    And   terminate test


  Scenario: TC_108 Verify that facebook, twitter, linkedin and instagram icons are visible

    Given go to "Url"
    Then  close popup
    And   scroll down
    Then  verify facebook icon is visible
    Then  verify twitter icon is visible
    Then  verify linkedin icon is visible
    Then  verify instagram icon is visible
    And   terminate test


  Scenario: TC_109 Verify that clicking on facebook, twitter, linkedin and instagram icons redirect to their relevant pages

    Given go to "Url"
    Then  close popup
    And   scroll down
    #Then  verify facebook icon navigates to relevant page after clicking
    Then  verify twitter icon navigates to relevant page after clicking
    Then  verify linkedin icon navigates to relevant page after clicking
    Then  verify instagram icon navigates to relevant page after clicking
    And   terminate test
