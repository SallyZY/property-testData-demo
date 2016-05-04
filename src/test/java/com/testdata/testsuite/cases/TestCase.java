package com.testdata.testsuite.cases;

import com.testdata.HomeTestDataSettings;
import com.testdata.MotorTestDataSettings;
import com.testdata.PropertyTestDataDemo;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by sallyzhang on 4/14/16.
 */

@Configuration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(PropertyTestDataDemo.class)
public class TestCase {

    @Autowired
    HomeTestDataSettings homeTestData;

    @Autowired
    MotorTestDataSettings motorTestData;

}

