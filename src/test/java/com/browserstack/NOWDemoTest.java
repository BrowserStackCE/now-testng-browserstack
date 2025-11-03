package com.browserstack;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.browserstack.SeleniumTest;

public class NOWDemoTest extends SeleniumTest {
    @Test
    public void openTestPage() throws Exception {
        
        String webDomainFromEnv = System.getenv("NOW_WEB_DOMAIN");
        System.out.println("Web Domain from Env: " + webDomainFromEnv);
        driver.get(webDomainFromEnv);

        Assert.assertTrue(driver.getPageSource().length() > 100);
    }
}
