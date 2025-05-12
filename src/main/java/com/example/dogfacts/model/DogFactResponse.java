package com.example.dogfacts.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DogFactResponse {
    private List<DogFact> data;
}
