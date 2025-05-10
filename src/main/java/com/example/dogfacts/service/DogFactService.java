package com.example.dogfacts.service;

import com.example.dogfacts.model.DogFactResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class DogFactService {

    private static final String API_URL = "//";

    @Autowired
    private RestTemplate restTemplate;

    public List<String> getCatFacts() {
        DogFactResponse resp = restTemplate.getForObject(API_URL, DogFactResponse.class);
        return resp != null ? resp.getData() : List.of();
    }
}
