package com.transfercoop.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.transfercoop.web.modelo.Usuario;
import com.transfercoop.web.servicio.UsuarioServicioImpl;

@Controller
public class RegistroControlador {

    UsuarioServicioImpl impl = new UsuarioServicioImpl();

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

    @GetMapping("/")
    public String user(Model model){
        Usuario usuario = impl.usuario;
        model.addAttribute("usuarios", usuario);
        return "user";
    }
}
