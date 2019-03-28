package com.hlb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Fly on 2019/3/28.
 */
@Controller
public class PageController {
    @GetMapping("/page/index")
    public String index(){
        System.out.println("666");
        return "index";
    }
}