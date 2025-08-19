package com.firstprogram.myfirstprogram;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MyController {
    
    @RequestMapping("m")
        public static String MyMethod()
    {
        return "<h1>Welcome to My Website</h1>";
    }

    @GetMapping("get-form")
    public static String getMethod(@RequestParam int num1,@RequestParam int num2) {

        int result=num1+num2;
        return "result"+ result;
    }

    @PostMapping("post-form")
    public static String postMethod(@RequestParam int num1,@RequestParam int num2) {

        int result=num1+num2;
        return "result"+ result;
    }
    
}
