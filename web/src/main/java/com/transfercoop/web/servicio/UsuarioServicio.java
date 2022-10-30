package com.transfercoop.web.servicio;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.transfercoop.web.dto.UsuarioRegistroDTO;
import com.transfercoop.web.modelo.Usuario;

public interface UsuarioServicio extends UserDetailsService{
    public Usuario guardar(UsuarioRegistroDTO dto);
}
