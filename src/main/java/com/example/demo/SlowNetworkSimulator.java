package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class SlowNetworkSimulator {
    public void waitForRandomTime() {
        try {
            Thread.sleep(random(200, 1000)); // Simulate latency from 200ms to 1000ms
        } catch (InterruptedException e) {
            // nothing
        }
    }
    public long random(int min, int max) {
        int range = (max - min) + 1;
        return (long)(Math.random() * range) + min;
    }

}
