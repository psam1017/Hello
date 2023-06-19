package com.example.Hello.web;

import com.example.Hello.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    // @RequestParam 으로 각각 파라미터를 받아도 됨.
    @GetMapping("/hello/dto")
    public HelloResponseDto helloDTO(@ModelAttribute HelloResponseDto dto) {
        return dto;
    }
}
