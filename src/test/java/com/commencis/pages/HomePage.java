package com.commencis.pages;

import com.commencis.utilities.BrowserUtils;
import com.commencis.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//article//div[@class='post-block__meta']//a")
    public List<WebElement> authorNames;

    @FindBy(xpath = "//article//figure[@class='post-block__media']//img")
    public List<WebElement> images;


    @FindBy(xpath = "(//div[@class='post-block__content'])[1]")
    public WebElement article;

    @FindBy(xpath = "(//h2//a[@href])[2]")
    public WebElement articleUrl;

    public void verifyEachNewsHasAuthor() {
        List<String> names = BrowserUtils.getElementsText(authorNames);

        for (String name : names) {
            Assert.assertFalse(name.isEmpty());

        }
    }

    public void verifyEachNewsHasImage(){
        for (WebElement image : images) {
            Assert.assertTrue(image.isDisplayed());
        }
    }

    public void clickArticle(){
        article.click();
    }

    public String getTitleUrl(){
        String href = articleUrl.getAttribute("href");
        System.out.println("href = " + href);
        return href;
    }


}
