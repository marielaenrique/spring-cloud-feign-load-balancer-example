package com.dh.course.controller;

import com.dh.course.feign.ISubscriptionClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired
    private ISubscriptionClient iSubscriptionClient;

    @GetMapping("/course/find")
    public ResponseEntity<String> find() {
        return ResponseEntity.ok(iSubscriptionClient.find());
    }

}