package com.chamal.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/tests")
public class TestController {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to ci/cd test";
    }
}
