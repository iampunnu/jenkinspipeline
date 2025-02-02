package com.project.jenkins.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/jenkins")
public class FirstController {

    @GetMapping
    public ResponseEntity<?> getMessage(){

        ResponseEntity<?> responseEntity=new ResponseEntity<>("hreloo",HttpStatus.OK);

        return responseEntity;
    }
}
