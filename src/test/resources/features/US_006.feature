Feature: As a user, I want to be able to login with my registered email and password information.

  Scenario: TC 114 When clicking the Click Here link next to Forgot Password? text, verify that it redirects to the relevant page

    Given   go to "Url"
    Then    close popup
    Then    click login
    Then    verify that after clicking Here link next to Password navigates to relevant page
