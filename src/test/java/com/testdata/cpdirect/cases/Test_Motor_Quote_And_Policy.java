package com.testdata.cpdirect.cases;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by sallyzhang on 4/20/16.
 */
public class Test_Motor_Quote_And_Policy extends TestCase {

    @Test
    public void Test_Create_And_Save_MotorQuote() {
        assertThat(motorTestData.getAddress(), is("level 7, 60 margaret street"));
    }
}
