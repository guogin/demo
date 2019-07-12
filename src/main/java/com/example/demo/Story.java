package com.example.demo;

import lombok.Data;

import java.util.List;

@Data
public class Story {
    private String heading;
    private List<String> chapterUrls;
}
