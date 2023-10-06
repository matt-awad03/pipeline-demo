package com.matthewa.pipelineproj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AppController {
    @GetMapping
    String hello() {
        return "Hello, World!";
    }
}
