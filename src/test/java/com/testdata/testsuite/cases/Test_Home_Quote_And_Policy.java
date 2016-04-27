package com.testdata.testsuite.cases;

import com.testdata.testsuite.cases.TestCase;
import com.testdata.testsuite.utils.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.openqa.selenium.support.PageFactory.initElements;

/**
 * Created by yinzhang on 4/13/16.
 */


public class Test_Home_Quote_And_Policy extends TestCase {
    WebDriver webDriver;

    @Test
    public void Test_Create_And_Save_HomeQuote() {

        assertThat(homeTestData.getHomeValue(), is("300000"));

    }

    @Before
    public void setup() {
        webDriver = WebDriverManager.getWebDriver();
        WebDriverManager.getWebDriver().manage().deleteAllCookies();
    }

    @After
    public void teardown() {
        webDriver.quit();
        WebDriverManager.getWebDriver().quit();
        WebDriverManager.deleteWebDriver();
    }
}
