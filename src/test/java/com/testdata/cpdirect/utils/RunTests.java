package com.testdata.cpdirect.utils;

import com.testdata.cpdirect.cases.MyTest;
import com.testdata.cpdirect.cases.Test_Home_Quote_And_Policy;
import com.testdata.cpdirect.cases.Test_Motor_Quote_And_Policy;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by sallyzhang on 4/13/16.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        MyTest.class,
        Test_Home_Quote_And_Policy.class,
        Test_Motor_Quote_And_Policy.class
})

public class RunTests {
}
