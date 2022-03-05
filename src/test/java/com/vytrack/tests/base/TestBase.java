package com.vytrack.tests.base;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestBase {

    @BeforeClass
    public void setUp() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
    }

    @AfterClass
    public void afterClass() {
        Driver.closeDriver();
    }
}
