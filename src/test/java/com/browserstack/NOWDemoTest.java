package com.browserstack;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.browserstack.SeleniumTest;

public class NOWDemoTest extends SeleniumTest {
    @Test
    public void openTestPage() throws Exception {
        driver.get("https://www.bstackdemo.com");

        String webDomainFromEnv = System.getenv("NOW_WEB_DOMAIN");

        // Check the title.
        Assert.assertTrue(driver.getTitle().toString().contains(webDomainFromEnv));
    }
}
