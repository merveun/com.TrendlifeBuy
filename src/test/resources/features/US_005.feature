Feature: US_005 Verify that the functions in the body of the home page are active

  Scenario: TC_110 Trending Products,Hot Categories,House Appliances,Recommendation For You,Top Brand,Popular Searches,Trendlifebuy|Verify that ONLINE SHOPPING are visible

    Given   go to "Url"
    Then    close popup
    Then    verify required links in TC_110 are visible
    And     quit driver

  Scenario: TC 111 Verify that the View All button redirects to the relevant page

    Given   go to "Url"
    Then    close popup
    Then    scroll down bypixel
    Then    Verify that the View All button redirects to the relevant page
    And     quit driver

  Scenario: TC 112 Verify that the More Deals button redirects to the relevant page

    Given   go to "Url"
    Then    close popup
    Then    scroll down bypixel_2000
    Then    Verify that the More Deal button redirects to the relevant page
    And     quit driver

  Scenario: TC 113 Verify that more products are displayed when we hit the Load More button

    Given   go to "Url"
    Then    close popup
    Then    scroll down for Load More
    Then    verify that more products are seen as the Load More button is clicked
    And     quit driver

