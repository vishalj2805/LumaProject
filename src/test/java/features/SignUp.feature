Feature: Sign Up Functionality

  Background:
    Given User is on Landing Page

  Scenario Outline: Verify User is able to Sign Up

    When User clicks on Create an Account Link
    And User is navigated to Create New Customer Account page
    And User enters all the details "<First Name>", "<Last Name>", "<Email>" and "<Password>" and Confirm Password in fields on Sign Up Page
    And User clicks on Create an Account Button
    Then Verify Account creation Message is displayed
    And Verify whether User is on My Account Page

    Examples:
      | First Name | Last Name | Email                 | Password       |
      | Vishal     | Jadhav    | vishalj2805@vj.co.in | Vjadhav28 |