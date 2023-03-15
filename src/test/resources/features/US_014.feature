
Feature: US_014 As a user, I would like to have an About Us page on the site so that I can have more information about the site I shopped at.
  @sema
  Scenario: Verify that you have access to the About Us page from the home page

    Given The application extension is entered into the browser
    Then The Subscribe popup closes
    Then  Verifies that About Us tab is click
    Then Verify that QUALITY AND REASONABLE PRICES is visible on the About Us page
    Then  Verified that their numbers are visible on Client Worldwide, Successful Project, Work Employed, Planning Services boards on the About Us page
    Then Verify that the text Online Shopping Easy Cost-Efficient is visible on the About Us page
    Then Verify that Team Member text is visible on the About Us page
    Then The About Us page should verify that the characters, statuses and images of Robert Pattison, Johnny Depp, Jason Statham, Bradley Cooper are visible on the page
    And The pages is closed
