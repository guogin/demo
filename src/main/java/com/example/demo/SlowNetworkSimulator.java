package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class SlowNetworkSimulator {
    public void waitForRandomTime() {
        try {
            Thread.sleep(random(0, 1) * 1000);
        } catch (InterruptedException e) {
            // nothing
        }
    }
    public long random(int min, int max) {
        int range = (max - min) + 1;
        return (long)(Math.random() * range) + min;
    }

}
