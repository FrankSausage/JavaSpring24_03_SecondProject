package com.team3.findmyhome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class Test {

    @GetMapping("/main")
    public String test() {
        return "main";
    }

    @GetMapping("/search")
    public String search() {
        return "search";
    }

    @GetMapping("/chart")
    public String chart() {
        return "chart";
    }
}
