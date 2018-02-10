package com.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleFireFoxTest {
    public static void main(String[] args) {

        //Selenium doesn't support FireFox 57
        //Github Issue #24: https://github.com/SeleniumHQ/selenium-ide/issues/24
        WebDriver driver = new FirefoxDriver();
        driver.get("http://google.com");
    }
}
