package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController2 {
    @RequestMapping(value="/about2")
    @ResponseBody
    public String habdelIndex(){
        String rana=null;
        rana="{'0'=>[1,2,3,4,5,6,7,8,9,10]}";
        return rana;
    }
}
