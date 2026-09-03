package com.theja.StudentService.controller;

import  org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
@CrossOrigin("*")
public class TestController {
    @GetMapping("/hi")
    public ResponseEntity<?> hi() {
        return new ResponseEntity("hi", HttpStatus.OK);
    }

    @GetMapping("/students")
    public ResponseEntity<?> getStudents(){
        Map<String, Integer> students = new HashMap<>();
        students.put("hari",22);
        students.put("Giri",25);
        students.put("Siri",27);
        students.put("Puri",29);
        return new ResponseEntity<>(students,HttpStatus.OK);
    }
}
