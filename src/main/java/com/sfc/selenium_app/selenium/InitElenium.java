package com.sfc.selenium_app.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by sufuchuan on 2020/3/10.
 */
public class InitElenium {

    private static WebDriver driver;

    private static InitElenium initElenium;

    private InitElenium(){
        String basePath=System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",
                basePath+"\\src\\main\\resources\\selenium\\chromedriver3.exe");
        driver=new ChromeDriver();
    }

    public static InitElenium getInitElenium(){
        if(initElenium!=null){
            return initElenium;
        }else{
            initElenium=new InitElenium();
            return initElenium;
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    /**
     * 基础请求操作
     * @param url
     */
    public static void singleTestOperate(String url){

    }
}
