package com.commencis.utilities;


import org.openqa.selenium.*;
import java.util.ArrayList;
import java.util.List;


public class BrowserUtils {


    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }


}