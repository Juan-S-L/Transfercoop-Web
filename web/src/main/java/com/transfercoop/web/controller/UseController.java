package com.transfercoop.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.transfercoop.web.dto.UsuarioRegistroDTO;
import com.transfercoop.web.servicio.UsuarioServicio;

@Controller
@RequestMapping("/registro")
public class UseController {
    
    @Autowired
    private UsuarioServicio servicio;

    @ModelAttribute("usuario")
    public UsuarioRegistroDTO retornarNuevoUsuario(){
        return new UsuarioRegistroDTO();
    }

    @GetMapping
    public String registro(){
        return "registro";
    }

    @PostMapping
    public String regitrarUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO dto){
        servicio.guardar(dto);
        return "redirect:/registro?exito";
    }

    // @GetMapping("/")
    // public String prueba(Model model){
    //     var usu = usuarioDao.findAll();
    //     model.addAttribute("usuarios", usu);
    //     return "prueba";
    // }

    // @GetMapping("/")
    // public String imp(){
    //     return "home";
    // }

    // @GetMapping("/login")
    // public String log(){
    //     return "login";
    // }

    // @GetMapping("/register")
    // public String reg(){
    //     return "register";
    // }
}
