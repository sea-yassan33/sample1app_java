package com.example.sample1app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class HelloController {
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("msg",
                "これはcontrollerに用意したメッセージです");
        return "index";
    }
}