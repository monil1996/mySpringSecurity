package com.myFilter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {

    @GetMapping("/get1")
    public String get1() {
        return "Get1";
    }

    @GetMapping("/get2")
    public String get2() {
        return "Get2";
    }
}
