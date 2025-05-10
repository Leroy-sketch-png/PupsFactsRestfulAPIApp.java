package com.example.dogfacts.model;

import java.util.List;

public class DogFactResponse {
    private List<String> data;

    public DogFactResponse() {}

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }
}
