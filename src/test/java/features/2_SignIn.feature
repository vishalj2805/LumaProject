
Feature: Sign In Functionality

  Background:
    Given User is on Landing Page

  Scenario: Verify whether User is able to Sign In

    When User clicks on Sign In Link
    And User is navigated to Sign In page
    And User enters Email "vishalj2805@vj.co.in" and password "Vjadhav28"
    And User clicks on Sign In Button
    Then Verify whether User is on Home Page
    And Welcome Message is displayed on Home Page