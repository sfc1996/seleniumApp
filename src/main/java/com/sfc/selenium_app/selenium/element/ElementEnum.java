package com.sfc.selenium_app.selenium.element;

/**
 * Created by sufuchuan on 2020/3/8.
 */
public enum ElementEnum {

    Id(1,"id"),NAME(2,"name"),TAGNAME(3,"tagName"),CLASSNAME(4,"className"),CSSSELECTOR(5,"cssSelector"),XPATH(6,"xPath");

    private Integer id;
    private String name;

    ElementEnum(Integer id, String name){
        this.id=id;
        this.name=name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
