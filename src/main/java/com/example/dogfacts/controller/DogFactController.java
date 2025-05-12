package com.example.dogfacts.controller;

import com.example.dogfacts.service.DogFactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DogFactController {

    @Autowired
    private DogFactService dogFactService;

    @GetMapping("/")
    public String showDogFacts(Model model) {
        List<String> facts = dogFactService.getDogFacts();
        model.addAttribute("facts", facts);
        return "home";
    }
}
