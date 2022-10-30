package com.transfercoop.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistroControlador {

    @GetMapping("/login")
    public String iniciarSesion(){
        return "login";
    }

    @GetMapping("/Home")
    public String inicio(){
        return "home";
    }

    @GetMapping("/terminos")
    public String ter(){
        return "terminos";
    }
    
    @GetMapping("/privacidad")
    public String pri(){
        return "privacidad";
    }

    @RequestMapping("/")
    public String user(){
        return "user";
    }
}
