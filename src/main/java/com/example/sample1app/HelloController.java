package com.example.sample1app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    private boolean flag = false;
    @RequestMapping("/")
    public ModelAndView index(ModelAndView mav){
        mav.setViewName("index");
        MyData[] data = new MyData[]{
                new MyData("Taro",39),
                new MyData("Hanako",28),
                new MyData("Sachiko",17)
        };
        mav.addObject("data", data);
        return mav;
    }
}

class MyData{
    public String name;
    public int age;
    public MyData(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return String.format("{Name: %s, age: %s}",name,age);
    }
}