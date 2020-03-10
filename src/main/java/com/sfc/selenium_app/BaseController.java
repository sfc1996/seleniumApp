package com.sfc.selenium_app;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sufuchuan on 2019/9/13.
 */
public class BaseController {

    public Map<String,Object> getReturnSuccessMap(Object object){

        HashMap<String,Object> result=new HashMap<>();
        result.put("code",0);
        result.put("state","成功");
        result.put("msg",object);
        return result;
    }

    public Map<String,Object> getReturnErrorMap(){

        HashMap<String,Object> result=new HashMap<>();
        result.put("code",-1);
        result.put("state","失败");
        result.put("msg",null);
        return result;
    }
}
