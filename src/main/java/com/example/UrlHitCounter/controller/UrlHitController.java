package com.example.UrlHitCounter.controller;

import com.example.UrlHitCounter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitController {
    @Autowired
    private UrlHitService urlHitService;
    // this is my fist project  of springBoot


<<<<<<< HEAD
    @GetMapping
=======
    @GetMapping("count") //to get the hitcount
>>>>>>> 2486549bdcc36fa109fd349e71742de790d78920
    public int getHitCount(){
        urlHitService.urlHitCountIncrement();
        return urlHitService.getHitCount();
    }

}
