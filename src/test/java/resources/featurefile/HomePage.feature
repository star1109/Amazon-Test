Feature:Home Page Test
  As a User , I want to explore Amazon Website

  Background:
    Given I am on Amazon Home Page
    And I accept cookies

  Scenario: I want to select a book from Amazon Website
    When I click on search in dropdown
    And I select "Books" from the Drop down Menu
    And I Search "Bitcoin" in the search bar
    And I see the books in list

   # Scenario: I want the
