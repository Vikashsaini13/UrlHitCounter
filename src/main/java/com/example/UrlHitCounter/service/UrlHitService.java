package com.example.UrlHitCounter.service;

import org.springframework.stereotype.Service;

@Service
public class UrlHitService {

    int hitCount=0;
    public void urlHitCountIncrement() {
        hitCount++;
    }


    public int getHitCount() {

        return hitCount;
    }
}
