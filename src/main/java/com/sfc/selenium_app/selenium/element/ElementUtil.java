package com.sfc.selenium_app.selenium.element;

import com.sfc.selenium_app.selenium.InitElenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by sufuchuan on 2020/3/8.
 */
public class ElementUtil {

    private ElementUtil(){

    }

    public static boolean haveWebElement(ElementEnum type,String key){

        WebElement we;
        WebDriver driver= InitElenium.getInitElenium().getDriver();
        try{
         switch(type.getName()){
             case "id":
                 we=driver.findElement(By.id(key));
                 return we!=null;
             case "name":
                 we=driver.findElement(By.name(key));
                 return we!=null;
             case "tagName":
                 we=driver.findElement(By.tagName(key));
                 return we!=null;
             case "className":
                 we=driver.findElement(By.className(key));
                 return we!=null;
             case "cssSelector":
                 we=driver.findElement(By.cssSelector(key));
                 return we!=null;
             case "xPath":
                 we=driver.findElement(By.xpath(key));
                 return we!=null;
         }
        }catch(Exception e){
        return false;
        }
        return true;
    }
}
