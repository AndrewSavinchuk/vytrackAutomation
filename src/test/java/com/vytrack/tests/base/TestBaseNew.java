package com.vytrack.tests.base;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;

import org.testng.annotations.*;


public abstract class TestBaseNew {

    private static final String usernameDr1 = ConfigurationReader.getProperty("username1");
    private static final String usernameDr2 = ConfigurationReader.getProperty("username4");

    private static final String usernameSale1 = ConfigurationReader.getProperty("username3");
    private static final String usernameSale2 = ConfigurationReader.getProperty("username6");

    private static final String usernameStore1 = ConfigurationReader.getProperty("username2");
    private static final String usernameStore2 = ConfigurationReader.getProperty("username5");


    @DataProvider(name = "allManagers")
    public Object[][] allManagers() {
        return new Object[][]{
                {usernameSale1},
                {usernameSale2},
                {usernameStore1},
                {usernameStore2}

        };
    }


    @DataProvider(name = "salesManagers")
    public Object[][] salesManagers() {
        return new Object[][]{
                {usernameSale1},
                {usernameSale2}


        };
    }

    @DataProvider(name = "storeManagers")
    public Object[][] storeManagers() {
        return new Object[][]{
                {usernameStore1},
                {usernameStore2}

        };
    }

    @DataProvider(name = "drivers")
    public Object[][] driverLogin() {
        return new Object[][]{

                {usernameDr1},
                {usernameDr2}
        };
    }


    @BeforeClass
    public void setUp() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
    }


    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();

    }


    @AfterClass
    public void afterClass() {
        Driver.closeDriver();
    }


}
