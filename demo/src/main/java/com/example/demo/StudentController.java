package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
    @RequestMapping(value="/")
    @ResponseBody
    public String handleIndex(){
        return "Bangladesh";
    }
    @RequestMapping(value="/about")
    @ResponseBody
    public double handleIndex2(){
        return 3.98;
    }
}
