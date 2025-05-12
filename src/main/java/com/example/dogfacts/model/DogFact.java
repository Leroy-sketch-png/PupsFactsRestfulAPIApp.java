package com.example.dogfacts.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DogFact {
    private String id;
    private String type;
    private Attributes attributes;

    public DogFact(String id, String type, Attributes attributes) {
        this.id = id;
        this.type = type;
        this.attributes = attributes;
    }

    @Setter
    @Getter
    public static class Attributes {
        private String body;

    }
}
