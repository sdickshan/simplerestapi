package com.org.samplerestapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "api/user")
public class UserController {
    @PostMapping("/login")
    public ResponseEntity<Map<String, Boolean>> logUser(@RequestBody Map<String,String> user ){
        String username = user.get("username");
        String password = user.get("password");

        Map<String, Boolean> response = new HashMap<>();
        if(username.equals("admin") && password.equals("admin")) {
            response.put("success", true);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            response.put("success", false);
            return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
        }
    }
}

