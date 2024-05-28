package com.student.noob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class BasicController {

    Date today = new Date();

    @GetMapping("/date")
    @ResponseBody
    String hello() {
        return today.toString();
    }
}
