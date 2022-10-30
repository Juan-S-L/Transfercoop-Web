package com.transfercoop.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.transfercoop.web.modelo.Usuario;
import com.transfercoop.web.servicio.UsuarioServicio;

@Controller
public class RegistroControlador {
    
    // @Autowired
    // private UsuarioServicio servicio;

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
        // usuario = servicio.buscar(usuario);
        // model.addAttribute("usuarios", usuario);
        return "user";
    }
}
