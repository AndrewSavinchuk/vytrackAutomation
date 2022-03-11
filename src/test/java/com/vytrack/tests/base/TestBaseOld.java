package com.vytrack.tests.base;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBaseOld {


    @BeforeMethod
    public void setUp () {
        Driver.getDriver().get(ConfigurationReader.getProperty("browser"));
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDown () {
        Driver.closeDriver();

    }







}
