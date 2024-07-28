package com.alfie.kafka.message.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/")
public class VersionApiController {

    @GetMapping("/version")
    public Map<String, String> version() {
        return Map.of("status", "UP");
    }
}
