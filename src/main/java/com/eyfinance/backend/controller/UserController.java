package com.eyfinance.backend.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/{id}")
    public ResponseEntity<Map<String, String>> getUserById(@PathVariable Long id) {
        Map<String, String> response = new HashMap<>();
        response.put("Prof", "Hello world!!");
        response.put("Id", String.valueOf(id));
        log.info("=== Info : {}", response.get("Id"));
        return ResponseEntity.ok(response);
    }
}
