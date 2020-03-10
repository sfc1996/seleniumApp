package com.sfc.selenium_app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by sufuchuan on 2020/3/10.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SeleniumTest {

    @Test
    public void contextLoads() {

         String basePath=System.getProperty("user.dir");
         System.setProperty("webdriver.chrome.driver",
               basePath+"\\src\\main\\resources\\selenium\\chromedriver3.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://119.3.133.44:8082/#/login?redirect=%2Fmonitor%2Fpos");
    }
}
