package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

@Controller
public class ViewController {

    @GetMapping({"/"})
    public String root(Model model) {
        if (!model.containsAttribute("userForm")) {
            model.addAttribute("userForm", new UserForm());
        }
        model.addAttribute("message", "Bonjour, vous êtes dans la page d'accueil ! \nAllez sur la page /view");
        java.util.List<String> items = java.util.Arrays.asList("Item 1", "Item 2", "Item 3");
        model.addAttribute("items", items);
        return "view";
    }

    @GetMapping({"/view"})
    public String view(Model model) {
        if (!model.containsAttribute("userForm")) {
            model.addAttribute("userForm", new UserForm());
        }
        model.addAttribute("message", "Hello, vous êtes dans /view !");
        model.addAttribute("items", java.util.Arrays.asList("Item 1", "Item 2", "Item 3"));
        return "view";
    }

    @PostMapping("/welcome")
    public String welcome(@Valid @ModelAttribute("userForm") UserForm userForm, BindingResult bindingResult, Model model) {
        model.addAttribute("message", "Hello, vous êtes dans /welcome !");
        model.addAttribute("items", java.util.Arrays.asList("Element A", "Element B", "Element C"));

        if (bindingResult.hasErrors()) {
            model.addAttribute("org.springframework.validation.BindingResult.userForm", bindingResult);
            model.addAttribute("userForm", userForm);
            return "view";
        }

        model.addAttribute("welcomeMessage", "Bienvenue, " + userForm.getUsername() + " ! Vous avez " + userForm.getAge() + " ans.");
        return "view";
    }

}
