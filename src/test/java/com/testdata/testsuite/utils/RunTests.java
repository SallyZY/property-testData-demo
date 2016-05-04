package com.testdata.testsuite.utils;

import com.testdata.testsuite.cases.MyTest;
import com.testdata.testsuite.cases.Test_Home_Quote_And_Policy;
import com.testdata.testsuite.cases.Test_Motor_Quote_And_Policy;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by sallyzhang on 4/13/16.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
//        MyTest.class,
        Test_Home_Quote_And_Policy.class
//        Test_Motor_Quote_And_Policy.class
})
public class RunTests {
}
