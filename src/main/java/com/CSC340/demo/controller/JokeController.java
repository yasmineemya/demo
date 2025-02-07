package com.CSC340.demo.controller;


import com.CSC340.demo.model.Joke;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;


public class JokeController {
    @GetMapping("/Joke")
    public Joke getJoke() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://v2.jokeapi.dev/joke/Any";
        Joke joke = restTemplate.getForObject(url, Joke.class);
        return joke;
    }

}
