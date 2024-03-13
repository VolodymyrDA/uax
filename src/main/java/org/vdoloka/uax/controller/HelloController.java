package org.vdoloka.uax.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String sendResponse() {
        return "Hello, Dude!";
    }
}
