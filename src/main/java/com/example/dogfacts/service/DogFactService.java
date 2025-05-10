package com.example.dogfacts.service;

import com.example.dogfacts.model.DogFact;
import com.example.dogfacts.model.DogFactResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class DogFactService {

    private static final String API_URL = "https://dogapi.dog/api/v2/facts";

    @Autowired
    private RestTemplate restTemplate;

    public List<String> getDogFacts() {
        List<String> facts = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            DogFactResponse response = restTemplate.getForObject(API_URL, DogFactResponse.class);
            if (response != null && response.getData() != null && !response.getData().isEmpty()) {
                DogFact fact = response.getData().get(0);
                if (fact != null && fact.getAttributes() != null) {
                    facts.add(fact.getAttributes().getBody());
                }
            }
        }
        return facts;
    }
}
