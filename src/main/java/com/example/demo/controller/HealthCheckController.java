package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    /**
     * 헬스 체크를 시도한다.
     */
    @GetMapping("api/ping")
    public String ping() {
        return "ok";
    }
}
