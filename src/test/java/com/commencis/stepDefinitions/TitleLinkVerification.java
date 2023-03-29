package com.commencis.stepDefinitions;

import com.commencis.pages.HomePage;
import com.commencis.pages.NewsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TitleLinkVerification {
    HomePage homePage = new HomePage();
    NewsPage newsPage = new NewsPage();

    @When("user clicks on one of news from “The Latest News” list")
    public void user_clicks_on_one_of_news_from_the_latest_news_list() {
        homePage.clickArticle();
    }

    @Then("user sees the browser title is the same with the news title")
    public void user_sees_the_browser_title_is_the_same_with_the_news_title() {
        newsPage.verifyBrowserTitleAndNewsTitle();
    }


    @Then("user sees the browser link is the same with the news link")
    public void userSeesTheBrowserLinkIsTheSameWithTheNewsLink() {
        Assert.assertEquals(newsPage.getUrl(), homePage.getTitleUrl());
    }
}
