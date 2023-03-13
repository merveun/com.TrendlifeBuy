Feature: US_004 Verify that the functions in the submenu of the Home page are visible and active

  Scenario: TC_101 Verify that My Account, Order Status, Referral, Coupons links are visible

    Given go to "Url"
    Then  close popup
    Then  scroll down
    *     verify required texts are visible
   # And   quit driver


  Scenario: TC_102 Verify that My Account, Order Status, Referral, Coupons links are navigates to relevant pages

    Given go to "Url"
    Then  close popup
    Then  scroll down
    Then  click My Account link
    And   verify My Account page is opened
    Then  click Order Status link
    And   verify Order Status page is opened
    Then  click Referral link
    And   verify Referral page is opened
    Then  click Coupons link
    And   verify Coupons page is opened


  Scenario: TC_103 Verify that the About Us, Contact Us, Career, Refund Policy, Terms & Condition links are visible

    Given go to "Url"
    Then  close popup
    And   scroll down
    Then  verify About Us link is visible
    Then  verify Contact Us link is visible
    Then  verify Career link is visible
    Then  verify Refund Policy link is visible
    Then  verify Terms & Condition link is visible


  Scenario: TC_104 Verify that the About Us, Contact Us, Career, Refund Policy, Terms & Condition links are navigates to relevant pages

    Given go to "Url"
    Then  close popup
    And   scroll down
    Then  click About Us link
    Then  verify About Us page is opened
    Then  click Contact Us link
    Then  verify Contact Us page is opened
    Then  click Career link
    Then  verify Career link page is opened
    Then  click Refund Policy page link
    Then  verify Refund Policy link page is opened
    Then  click Terms & Condition link
    Then  verify Terms & Condition page is opened