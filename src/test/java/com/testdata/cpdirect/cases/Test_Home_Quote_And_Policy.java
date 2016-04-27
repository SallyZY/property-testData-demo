package com.testdata.cpdirect.cases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by sallyzhang on 4/13/16.
 */


public class Test_Home_Quote_And_Policy extends TestCase {

    @Test
    public void Test_Create_And_Save_HomeQuote() {

        System.out.println("test");
        assertThat(homeTestData.getHomeValue(), is("300000"));
    }

    @Before
    public void setup() {

    }

    @After
    public void teardown() {

    }
}
