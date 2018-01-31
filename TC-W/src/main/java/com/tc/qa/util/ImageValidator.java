package com.tc.qa.util;

import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.WebElement;
import com.tc.qa.base.TestBase;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ImageValidator extends TestBase{

    public Boolean isImageLoaded(WebElement image1) 
    { 
        Boolean imageLoaded1 = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && arguments[0].naturalWidth > 0", image1); 
        return imageLoaded1;
    }
    
    
    public void getBackgroundImage() {
        String html = "<html><head></head><body><div class=\"post_video\" style=\"background-image:url(http://img.youtube.com/vi/JFf3uazyXco/2.jpg);\"></body></html>";

        Document doc = Jsoup.parse( html );
        Elements elements = doc.getElementsByClass("post_video");

        for( Element e : elements ) {
            String attr = e.attr("style");
            System.out.println( attr.substring( attr.indexOf("http://"), attr.indexOf(")") ) );
        }
    }
    
}