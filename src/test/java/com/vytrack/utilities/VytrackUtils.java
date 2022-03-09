package com.vytrack.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class VytrackUtils {


    //private static String username = ConfigurationReader.getProperty("username1");
    private static String password = ConfigurationReader.getProperty("password");


    public static void login(String username, String password) {
        //go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        //pass username
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(username);
        //pass password
        Driver.getDriver().findElement(By.id("prependedInput2")).sendKeys(password);
        // click login button
        Driver.getDriver().findElement(By.xpath("//button[@id='_submit']")).click();

    }

    public static void loginAsDriver(String username) {
        //go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        //pass username
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(username);
        //pass password
        Driver.getDriver().findElement(By.id("prependedInput2")).sendKeys(password);
        // click login button
        Driver.getDriver().findElement(By.xpath("//button[@id='_submit']")).click();

//        Select logOutDropDown = new Select(Driver.getDriver().findElement(By.xpath("//li[@id=\"user-menu\"]/a")));
//        logOutDropDown.selectByVisibleText("Logout");


    }

    public static void loginAsStoreManager(String username) {
        //go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        //pass username
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(username);
        //pass password
        Driver.getDriver().findElement(By.id("prependedInput2")).sendKeys(password);
        // click login button
        Driver.getDriver().findElement(By.xpath("//button[@id='_submit']")).click();

    }

    public static void loginAsSalesManager(String username) {
        //go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        //pass username
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(username);
        //pass password
        Driver.getDriver().findElement(By.id("prependedInput2")).sendKeys(password);
        // click login button
        Driver.getDriver().findElement(By.xpath("//button[@id='_submit']")).click();

    }


    public static void logOut(){
        Driver.getDriver().findElement(By.xpath("//li[@id=\"user-menu\"]/a")).click();
        Driver.getDriver().findElement(By.xpath("//a[@class='no-hash']")).click();
    }



}
