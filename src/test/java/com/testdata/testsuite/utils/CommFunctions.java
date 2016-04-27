package com.testdata.testsuite.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by sallyzhang on 4/13/16.
 */
public class CommFunctions {

    private static Select selectElement;


    public static void sendKeys(WebElement inputElement, String text){
        inputElement.clear();
        inputElement.sendKeys(text);
    }

    public static void selectByValue(WebElement select, String value){
        Select selectElement = new Select(select);
        selectElement.selectByValue(value);
    }

    public static void selectByText(WebElement select, String text){
        Select selectElement = new Select(select);
        selectElement.selectByVisibleText(text);
    }
}
