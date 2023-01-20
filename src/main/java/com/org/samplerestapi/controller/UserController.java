package com.org.samplerestapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping(value = "api/user")
public class UserController {
    @PostMapping("/login")
    public ResponseEntity<String> logUser(@RequestBody Map<String,String> user ){
        String username = user.get("username");
        String password = user.get("password");

        if(username.equals("admin") && password.equals("admin")) {
            return new ResponseEntity<>("OK", HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }

    }
}

