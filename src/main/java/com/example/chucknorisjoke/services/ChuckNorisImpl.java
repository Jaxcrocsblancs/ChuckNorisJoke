package com.example.chucknorisjoke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class ChuckNorisImpl implements ChuckNoris {
    private ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorisImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }

}
