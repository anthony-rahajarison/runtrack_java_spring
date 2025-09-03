package com.example.demo.controller;

import javax.management.modelmbean.ModelMBean;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewController {

    @GetMapping({"/"})
    public String root(Model model) {
        model.addAttribute("message", "Bonjour, vous êtes dans la page d'accueil ! \nAllez sur la page /view");
        java.util.List<String> items = java.util.Arrays.asList("Item 1", "Item 2", "Item 3");
        model.addAttribute("items", items);
        return "view";
    }

    @GetMapping({"/view"})
    public String view(Model model) {
        model.addAttribute("message", "Hello, vous êtes dans /view !");
        return "view";
    }

    @PostMapping("/welcome")
    public String welcome(@RequestParam("username") String username, Model model) {
        model.addAttribute("message", "Hello, vous êtes dans /view !");
        java.util.List<String> items = java.util.Arrays.asList("Element A", "Element B", "Element C");
        model.addAttribute("items", items);
        model.addAttribute("welcomeMessage", "Bienvenue, " + username + " !");
        return "view";
    }

}
