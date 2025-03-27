package com.example.sbm_test_gmud.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/testTwo")
@RestController
public class TestTwoController {



    @GetMapping("")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("test");
    }
}
