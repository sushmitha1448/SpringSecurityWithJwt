package com.microservices.spring.SecurityExample.Student;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/greetings")
public class GreetingsController {

    @GetMapping("/greet")
    public ResponseEntity<String> greet(){
        return ResponseEntity.ok("Hey Hi Developer");
    }
}
