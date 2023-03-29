Feature: Click one of news from “The Latest News” list to reach the full content and verify
  followings;
            a. the browser title is the same with the news title
            b. the links within the news content

  Background:
    Given user is on home page
  @wip
    Scenario: The browser title is the same with the news title
      When user clicks on one of news from “The Latest News” list
      Then user sees the browser title is the same with the news title

  Scenario: The browser link is the same with the news link
    When user clicks on one of news from “The Latest News” list
    Then user sees the browser link is the same with the news link