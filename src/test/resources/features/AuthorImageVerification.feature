Feature: For “The Latest News” list, verify followings;
                        a. each news has an author
                        b. each news has an image

  Background:
    Given user is on home page

  Scenario: Each news in The Latest list has an author
    Then each news has an author

  Scenario: Each news in The Latest list has an image
    Then each news has an image


