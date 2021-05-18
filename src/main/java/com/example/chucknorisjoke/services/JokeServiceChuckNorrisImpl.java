package com.example.chucknorisjoke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceChuckNorrisImpl implements JokeService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;


    public JokeServiceChuckNorrisImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }

}
