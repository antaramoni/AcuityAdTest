package com.acuity.framework.base;

import org.openqa.selenium.WebDriver;

public class Browser extends Base {

    private WebDriver _driver;

    public Browser(WebDriver _driver) {
        this._driver = _driver;
    }

    public BrowserType browserType;

    public void GoToUrl (String url){
        _driver.get(url);
    }


    public void Maximize(){
        _driver.manage().window().maximize();
    }
}




