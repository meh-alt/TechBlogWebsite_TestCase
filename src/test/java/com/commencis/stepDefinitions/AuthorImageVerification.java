package com.commencis.stepDefinitions;

import com.commencis.pages.HomePage;
import com.commencis.utilities.ConfigurationReader;
import com.commencis.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthorImageVerification {
    HomePage homePage = new HomePage();

    @When("user is on home page")
    public void user_is_on_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @Then("each news has an author")
    public void each_news_has_an_author() {
        homePage.verifyEachNewsHasAuthor();
    }


    @Then("each news has an image")
    public void eachNewsHasAnImage() {
        homePage.verifyEachNewsHasImage();
    }
}

