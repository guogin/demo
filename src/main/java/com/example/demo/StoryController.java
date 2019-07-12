package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StoryController {
    @Autowired
    private StoryRepository storyRepository;
    @Autowired
    private SlowNetworkSimulator slowNetworkSimulator;

    @GetMapping("/story.json")
    @ResponseBody
    public Story getStory() {
        return storyRepository.getStory();
    }

    @GetMapping("/chapter-{id}.json")
    @ResponseBody
    public Chapter getChapter(@PathVariable int id) {
        slowNetworkSimulator.waitForRandomTime();
        return storyRepository.getChapter(id);
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
