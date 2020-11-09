package com.acuity.framework.config;

import com.acuity.framework.base.BrowserType;

import java.io.IOException;
import java.util.Properties;

public class ConfigReader {


    public static void PopulateSettings() throws IOException {
        ConfigReader reader = new ConfigReader();
        reader.ReadProperty();
    }

    private void ReadProperty() throws IOException {

        Properties p = new Properties();
        p.load(getClass().getResourceAsStream("GlobalConfig.properties"));

        // Get browser type from config file
        //Settings.browserType = BrowserType.valueOf(p.getProperty("BrowserType"));

        // Get Test url from config file
        Settings.TestUrl = p.getProperty("TestURL");



    }

}
