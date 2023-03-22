@smoke
@demo
Feature: Verify that the functions in the top menu of the home page are active



  Scenario: TC_001--->(US_002) Play store and apple store buttons should redirect to the relevant page

    Given go to the "url"
    Then  close the popup
    Then  click on playstore button
    And   verify that the playstore link opens
    And close browser
    Then  go to the "url"
    Then click on appstore button
    And verify that the appstore link opens
    And close browser

  Scenario: TC_002--->(US_002) Track Your Order button should lead to the relevant page

    Given go to the "url"
    Then  close the popup
    Then  click on trackyourorder button
    And   verify that the trackyourorder link opens
    And close browser

  Scenario: TC_003--->(US_002) Compare button should lead to the relevant page

    Given go to the "url"
    Then  close the popup
    Then  click on compare button
    And   verify that the compare link opens
    And close browser

  Scenario: TC_004--->(US_002) After logging in as a user, the Wishlist button should redirect to the relevant page.

    Given go to the "url"
    Then  close the popup
    Then  click on login button
    Then  login as a user
    Then  click on Wishlist button
    And   verify that the Wishlist link opens
    And  close browser

  Scenario: TC_005--->(US_002) cart button should redirect to the relevant page.

    Given go to the "url"
    Then  close the popup
    Then  click on cart button
    And   verify that the cart link opens
    And  close browser

  Scenario: TC_006--->(US_002) It should redirect to the home page when the logo is pressed.

    Given go to the "url"
    Then  close the popup
    Then  click on logo image
    And   verify that the homepage link opens
    And  close browser

  Scenario: TC_007--->(US_002) It should be possible to search for products from the search box

    Given go to the "url"
    Then  close the popup
    Then  enter in the search box
    And verify that visibility of search query text


  Scenario: TC_008--->(US_002) login button should redirect to relevant page

    Given go to the "url"
    Then  close the popup
    Then  click on login button
    And   verify that the login link opens
    And  close browser

  Scenario: TC_009--->(US_002) The register button should lead to the relevant page

    Given go to the "url"
    Then  close the popup
    Then  click on register button
    And   verify that the register link opens
    And  close browser

  Scenario: TC_010--->(US_002) home button should redirect to the relevant page

    Given go to the "url"
    Then  close the popup
    Then  click on home button
    And   verify that the home link opens
    And  close browser

  Scenario: TC_011--->(US_002) blog button should redirect to relevant page

    Given go to the "url"
    Then  close the popup
    Then  click on blog button
    And   verify that the blog link opens
    And  close browser

  Scenario: TC_012--->(US_002) About Us button should lead to the relevant page

    Given go to the "url"
    Then  close the popup
    Then  click on about us button
    And   verify that the about us link opens
    And  close browser

  Scenario: TC_013--->(US_002) Contact button should lead to the relevant page

    Given go to the "url"
    Then  close the popup
    Then  click on contact button
    And   verify that the contact link opens
    And  close browser

  Scenario: TC_014--->(US_002) New User Zone button should lead to the relevant page

    Given go to the "url"
    Then  close the popup
    Then  click on New User Zone button
    And   verify that the New User Zone link opens
    And  close browser



