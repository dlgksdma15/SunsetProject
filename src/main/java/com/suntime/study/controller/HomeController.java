package com.suntime.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // 기본페이지 요청 메서드
    @GetMapping("/")
    public String index(){
        return "index";
    }
    // ~~
    @GetMapping("/study")
    public String study(){
        return "study";
    }
    @GetMapping("/personal")
    public String personal(){
        return "personal";
    }
}
