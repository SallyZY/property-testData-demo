package com.testdata.testsuite.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

import java.util.concurrent.TimeUnit;

/**
 * Created by sallyzhang on 4/13/16.
 */
public class WebDriverManager {

    private static WebDriver webDriver;

    public static WebDriver getWebDriver(){
        if(webDriver == null){
            webDriver = new ChromeDriver();

            webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        return webDriver;
    }

    public static void deleteWebDriver(){
        if (webDriver != null){
            webDriver =null;
        }
    }
}
