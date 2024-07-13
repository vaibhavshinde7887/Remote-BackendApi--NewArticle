package com.remote.apis.news_article.controller;


import com.remote.apis.news_article.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remote/v1/newarticle")
public class NewsController {

    @Autowired
   private NewsService newsService;

    @GetMapping(value = "/getnews")
    public Object getNews(@RequestParam("country") String country, @RequestParam ("apiKey") String apiKey){

        return newsService.getNewsArticle(country,apiKey);
    }
}
