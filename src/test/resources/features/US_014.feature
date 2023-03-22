Feature: US_014 As a user, I would like to have an About Us page on the site so that I can have more information about the site I shopped at.
  @smoke
  Scenario: TC_001 Verify that you have access to the About Us page from the home page
    Given go to the browser "url"
    Then  close popup windows
    Then  verify AboutUsPage link is visible
    And   terminate the test


  Scenario: TC_002 Verify that the text QUALITY AND REASONABLE PRICES is visible on the About Us page
    Given go to the browser "url"
    Then  close popup windows
    Then  verify AboutUsPage link is visible
    Then  verify QUALITY AND REASONABLE PRICES is visible
    And   terminate the test


  Scenario: TC_003 Verify that the Client Worldwide, Successful Project, Work Employed, Planning Services numbers are visible
    Given go to the browser "url"
    Then  close popup windows
    Then  verify AboutUsPage link is visible
    Then  verify Client Worldwide, Successful Project, Work Employed, Planning Services numbers are visible
    And   terminate the test

  Scenario: TC_004 Verify that the text Online Shopping Easy Cost-Efficient is visible on the About Us page
    Given go to the browser "url"
    Then  close popup windows
    Then  verify AboutUsPage link is visible
    Then  verify ONLINE SHOPPING EASY AND COST-EFFICIENT is visible
    And   terminate test


  Scenario: TC_005 Verify that TEAM MEMBER text and Team Member are visible the characters, statuses and images of
            Robert Pattinson, Johnny Depp, Jason Statham, Harry Cooper are visible
    Given go to the browser "url"
    Then  close popup windows
    Then  verify AboutUsPage link is visible
    Then  verify TEAM MEMBER is visible
    Then  verify Robert Pattinson image visible
    And   verify Johnny Depp image visible
    And   verify Jason Statham image visible
    And   verify Harry Cooper image visible
    And   terminate the test





