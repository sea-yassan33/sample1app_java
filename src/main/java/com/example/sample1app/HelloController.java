package com.example.sample1app;

import com.samskivert.mustache.Mustache;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.io.IOException;
import java.io.Writer;
import com.samskivert.mustache.Mustache.Lambda;
import com.samskivert.mustache.Template.Fragment;

@Controller
public class HelloController {
    @RequestMapping("/")
    public ModelAndView index(ModelAndView mav){
        mav.setViewName("index");
        mav.addObject("title", "Groovy templates");
        mav.addObject("msg", "This is sample message!!");
        return mav;
    }
}
