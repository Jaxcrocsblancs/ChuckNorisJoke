package com.example.chucknorisjoke.controllers;

import com.example.chucknorisjoke.services.ChuckNoris;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConstructorChuckNorisJoke {
    private ChuckNoris chuckNoris;
    public ConstructorChuckNorisJoke(ChuckNoris chuckNoris) {
        this.chuckNoris = chuckNoris;
    }
    @RequestMapping("/")
    public String getJokeChuckNoris() {
        return chuckNoris.getJoke();
    }
}
