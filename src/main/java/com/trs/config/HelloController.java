package com.trs.config;

import com.season.core.Controller;
import com.season.core.ControllerKey;

/**
 * Created by Administrator on 2016/12/6.
 */
@ControllerKey("hello")
public class HelloController extends Controller {
    public void season(){
        renderText("hi season!");
    }
}
