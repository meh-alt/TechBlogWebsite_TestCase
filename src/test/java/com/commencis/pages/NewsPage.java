package com.commencis.pages;

import com.commencis.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsPage extends HomePage {

    @FindBy(xpath = "//h1[@class='article__title']")
    public WebElement articleTitle;


    public void verifyBrowserTitleAndNewsTitle() {
        String pageTitleText = Driver.get().getTitle();
        System.out.println("pageTitleText = " + pageTitleText);
        String articleTitleText = articleTitle.getText();
        System.out.println("articleTitleText = " + articleTitleText);
        Assert.assertTrue(pageTitleText.contains(articleTitleText));

    }
    public String getUrl(){
        String currentUrl = Driver.get().getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
        return currentUrl;
    }


}
