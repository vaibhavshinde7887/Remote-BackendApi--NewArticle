package com.remote.apis.news_article.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {

// Rest template - to call one api inside another api

    RestTemplate restTemplate = new RestTemplate();


    public Object getNewsArticle (String country, String apiKey){

       Object response = restTemplate.getForObject(getNewsUrl (country, apiKey), Object.class);
       return response;
    }
    public String getNewsUrl(String country, String apiKey){
        return "https://newsapi.org/v2/top-headlines?country="+country+"&apiKey="+apiKey;

    }
}
