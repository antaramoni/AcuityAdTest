package com.acuity.framework.base;

import org.openqa.selenium.WebDriver;

public class DriverContext {

    public static WebDriver Driver;

    public static Browser Browser;

    public static void setDriver(WebDriver driver) {
        Driver = driver;
    }
}
