Feature: As a user, I would like to have a page where I can compare similar products on the site.


  Scenario: TC_121 It should be verified that the products that users put on the Compare page while shopping are displayed side by side with their pictures and content information.

    Given go to "url"
    Then  close popup
    Then  all-in-one logIn
    Then  scroll down for More Deal button
    Then  click product one
    Then  navigate page back
    Then  click product two
    Then  click compare button
    Then  verify pictures of products are displayed
    Then  verify content information of products are displayed
    And   terminate test





  Scenario: TC_122 When the Reset Compare button is clicked, it should be verified that the products selected for comparison are deleted from the Compare page.

    Given go to "url"
    Then  close popup
    Then  all-in-one logIn
    Then  scroll down for More Deal button
    Then  click product one
    Then  navigate page back
    Then  click product two
    Then  click compare button
    Then  click reset compare button
    Then  verify product compare page is empty
    And   terminate test
