package com.bridgelabz.selenium.problem.statements.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utility.Log;
import ObjectRepository.ReadDataConfig;

import java.util.concurrent.TimeUnit;

public class BaseClass{

    public static WebDriver driver;

    @BeforeTest
    public void setUp () {

        Log.info ("Start chrome browser");
        WebDriverManager.chromedriver ().setup ();
        driver = new ChromeDriver ();

        Log.info ("getting url path from config.properties");
        String url = ReadDataConfig.getProperty (ReadDataConfig.CONFIG_PATH, "url");

        Log.info ("getting url path from config.properties");
        driver.get (url);
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait (20, TimeUnit.SECONDS);
    }

    @AfterTest
    public void tearDown () {
        Log.info ("close the browser");
        driver.close ();
    }
}