package com.sel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class SampleGrid {
    private static final Logger log = LogManager.getLogger(SampleGrid.class);

    WebDriver driver;

    @Before
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        String url = "http://localhost:4444/wd/hub";
        driver = new RemoteWebDriver(new URL(url), capabilities);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void gridTest() {
        driver.get("http://the-internet.herokuapp.com/");
        log.info(driver.getTitle());
        assertThat(driver.getTitle(), is(equalTo("The Internet")));
    }

}