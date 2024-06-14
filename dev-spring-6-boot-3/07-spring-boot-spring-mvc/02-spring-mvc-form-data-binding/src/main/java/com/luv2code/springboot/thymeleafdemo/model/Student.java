package com.luv2code.springboot.thymeleafdemo.model;

import lombok.Data;

import java.util.List;

public @Data class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private List<String> favoriteSystems;
}
