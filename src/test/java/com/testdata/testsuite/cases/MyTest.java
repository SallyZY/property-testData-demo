package com.testdata.testsuite.cases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by sallyzhang on 4/13/16.
 */
public class MyTest extends TestCase {

    @Test
    public void should_be_able_get_read_properties_from_file() throws IOException {
//      中文乱码
//		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("homeTestData.properties","UTF-8");
//		Properties properties = new Properties();
//		properties.load(inputStream);

        Properties properties = new Properties();
        properties.load(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("homeTestData.properties"), "UTF-8"));
        assertThat(properties.getProperty("home.homeExcess"), is("$250 Optional excess"));
    }

    @Before
    public void setup() {
        System.out.println("before");
    }

    @After
    public void teardown() {
        System.out.println("after");
    }
}
