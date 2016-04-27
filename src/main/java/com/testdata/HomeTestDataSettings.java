package com.testdata;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by sallyzhang on 4/26/16.
 */

@ConfigurationProperties(prefix="home", locations = "classpath:homeTestData.properties")
public class HomeTestDataSettings {

    private String homeValue;
    private String contentValue;
    private String age;
    private String builtYear;
    private String constructionType;
    private String roofType;
    private String suburbStatePostcode;
    private String address;
    private String homeExcess;
    private String contentExcess;
    private String sourceOfBusiness;
    private String username;
    private String password;

    public String getHomeValue() {
        return homeValue;
    }

    public void setHomeValue(String homeValue) {
        this.homeValue = homeValue;
    }

    public String getContentValue() {
        return contentValue;
    }

    public void setContentValue(String contentValue) {
        this.contentValue = contentValue;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBuiltYear() {
        return builtYear;
    }

    public void setBuiltYear(String builtYear) {
        this.builtYear = builtYear;
    }

    public String getConstructionType() {
        return constructionType;
    }

    public void setConstructionType(String constructionType) {
        this.constructionType = constructionType;
    }

    public String getRoofType() {
        return roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

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

    public String getHomeExcess() {
        return homeExcess;
    }

    public void setHomeExcess(String homeExcess) {
        this.homeExcess = homeExcess;
    }

    public String getContentExcess() {
        return contentExcess;
    }

    public void setContentExcess(String contentExcess) {
        this.contentExcess = contentExcess;
    }

    public String getSourceOfBusiness() {
        return sourceOfBusiness;
    }

    public void setSourceOfBusiness(String sourceOfBusiness) {
        this.sourceOfBusiness = sourceOfBusiness;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
