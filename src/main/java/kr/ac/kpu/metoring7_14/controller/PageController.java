package kr.ac.kpu.metoring7_14.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello.html";

    }
}
