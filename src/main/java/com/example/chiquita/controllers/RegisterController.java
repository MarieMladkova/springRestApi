package com.example.chiquita.controllers;

import com.example.chiquita.requests.RegisterRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class RegisterController {

    @PostMapping("/user")
    public ResponseEntity<Object>registerUser(@RequestBody @Valid RegisterRequest request){
        return ResponseEntity.ok().build();
    }
}
