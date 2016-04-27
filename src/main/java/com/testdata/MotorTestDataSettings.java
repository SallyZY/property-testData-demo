package com.testdata;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by sallyzhang on 4/26/16.
 */

@ConfigurationProperties(prefix="motor", locations = "classpath:motorTestData.properties")
public class MotorTestDataSettings {
    private String suburbStatePostcode;
    private String address;

    public String getSuburbStatePostcode() {
        return suburbStatePostcode;
    }

    public void setSuburbStatePostcode(String suburbStatePostcode) {
        this.suburbStatePostcode = suburbStatePostcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
