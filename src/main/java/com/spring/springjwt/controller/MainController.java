package com.spring.springjwt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody // 웹 서버로 동작하지 않고 api서버 데이터로 작동하므로 이 어노테이션 사용
public class MainController {

    @GetMapping("/")
    public String mainP() {

        return "Main controller";
    }
}
