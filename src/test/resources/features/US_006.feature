@smoke
Feature: As a user, I want to be able to login with my registered email and password information.

  Scenario: TC 114 When clicking the Click Here link next to Forgot Password? text, verify that it redirects to the relevant page

    Given   go to "Url"
    Then    close popup
    Then    click log in
    Then    verify that after clicking Here link next to Password navigates to relevant page
    And     terminate test



  Scenario: TC 115 Verify that when the Sign Up link next to Don't have an Account? text is clicked, it redirects to the relevant page

    Given   go to "Url"
    Then    close popup
    Then    click log in
    Then    verify that after clicking Sign Up next to next to Don't have an Account? navigates to relevant page
    And     terminate test


  Scenario: TC 116 verify that when logged in correctly, it redirects to Home and a welcome message appears in the corner

    Given   go to "Url"
    Then    close popup
    Then    click log in
    Then    type valid email
    And     type valid password
    Then    click sign in
    Then    verify that navigates to Home Page
    Then    verify that Welcome message is displayed
    And     terminate test


  Scenario: TC 117 "These credentials do not match our records." Verify that the message is seen when trying to log in with wrong data

    Given   go to "Url"
    Then    close popup
    Then    click log in
    Then    type incorrect email
    And     type incorrect password
    Then    click sign in
    Then    verify that These credentials do not match our records text is displayed
    And     terminate test


  Scenario: TC 118 Verify that it cannot be logged in with a wrong password and a valid email

    Given   go to "Url"
    Then    close popup
    Then    click log in
    Then    type valid email
    And     type incorrect password
    Then    click sign in
    Then    verify that These credentials do not match our records text is displayed
    And     terminate test


  Scenario: TC 119 Verify that it cannot be logged in with a valid password and a wrong email

    Given   go to "Url"
    Then    close popup
    Then    click log in
    Then    type incorrect email
    And     type valid password
    Then    click sign in
    Then    verify that These credentials do not match our records text is displayed
    And     terminate test


  Scenario: TC 120 Verify that the Remember me checkbox is clickable

    Given   go to "Url"
    Then    close popup
    Then    click log in
    Then    Verify that the Remember me checkbox is clickable
    And     terminate test

