package com.example.demo.controller;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class UserForm {
    @NotBlank(message = "Le nom est obligatoire.")
    private String username;

    @NotNull(message = "L'âge est obligatoire.")
    @Min(value = 1, message = "L'âge doit être supérieur ou égal à 1.")
    
    private Integer age;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}
