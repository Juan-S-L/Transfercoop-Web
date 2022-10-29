package com.transfercoop.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transfercoop.web.modelo.Usuario;

@Repository
public interface UsuarioDao extends JpaRepository<Usuario, Long> {
    public Usuario findByEmail(String email);
}
