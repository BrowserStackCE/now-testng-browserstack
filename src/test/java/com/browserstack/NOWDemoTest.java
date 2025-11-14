package com.browserstack;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.browserstack.SeleniumTest;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NOWDemoTest extends SeleniumTest {
    @Test
    public void openTestPage() throws Exception {

        String content = new String(Files.readAllBytes(Paths.get("browserstack.yml")));
        System.out.println(content);
        
        String webDomainFromEnv = System.getenv("NOW_WEB_DOMAIN");
        System.out.println("Web Domain from Env: " + webDomainFromEnv);
        driver.get(webDomainFromEnv);

        Assert.assertTrue(driver.getPageSource().length() > 100);
    }
}
