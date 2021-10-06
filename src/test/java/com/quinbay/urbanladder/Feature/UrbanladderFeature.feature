Feature: Test Urbanladder
  Background: User navigates to Urbanladder
    Given I am on Urbanladder Home page

    Scenario: version1.01.1


  Scenario: Assert Kids Bunk Beds Page
    When I hover Kids room
    And I click kids bunk beds
    Then Check the current page as Kids Bunk Beds
    And Close Driver

  Scenario: Assert Exclude Out of Stock
    When I hover Kids room
    And I click kids bunk beds
    And Check the current page as Kids Bunk Beds
    And I click on exclude out of stock
    Then Check checkbox clicked
    And Close Driver

  Scenario: Assert Sort By price:high to low
    When I hover Kids room
    And I click kids bunk beds
    And Check the current page as Kids Bunk Beds
    And I click on exclude out of stock
    And Check checkbox clicked
    And I click sort
    Then Assert whether price:High to Low applied
    And Close Driver

  Scenario: Assert Filter Price
    When I hover Kids room
    And I click kids bunk beds
    And Check the current page as Kids Bunk Beds
    And I click on exclude out of stock
    And Check checkbox clicked
    And I click sort
    And Assert whether price:High to Low applied
    And I click price filter
    Then Assert Radio buttons
    And Close Driver

  Scenario: Click Filter Price
    When I hover Kids room
    And I click kids bunk beds
    And Check the current page as Kids Bunk Beds
    And I click on exclude out of stock
    And I click sort
    And I click price filter
    And I click on price range
    Then Assert Final Price
    And Close Driver



#First feature deleted
  Scenario: Version 1