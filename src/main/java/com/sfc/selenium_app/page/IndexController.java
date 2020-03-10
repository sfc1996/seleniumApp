package com.sfc.selenium_app.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sufuchuan on 2020/3/10.
 */

@Controller
public class IndexController {

    @RequestMapping("index")
    public String index(){
    return "page/index";
    }
}
