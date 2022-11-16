package com.transfercoop.web.servicio;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.transfercoop.web.dao.UsuarioDao;
import com.transfercoop.web.dto.UsuarioRegistroDTO;
import com.transfercoop.web.modelo.Rol;
import com.transfercoop.web.modelo.Usuario;

@Service
public class UsuarioServicioImpl implements UsuarioServicio {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private UsuarioDao usuarioDao;

    public Usuario usuario;

    @Override
    public Usuario guardar(UsuarioRegistroDTO dto) {
        Usuario usuario = new Usuario(dto.getNombre(), dto.getApellido(), dto.getTelefono(), dto.getEmail(), 0.0, passwordEncoder.encode(dto.getPassword()), Arrays.asList(new Rol("ROLE_USER")));
        return usuarioDao.save(usuario);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        usuario = usuarioDao.findByEmail(username);
        if(usuario == null){
            throw new UsernameNotFoundException("Usuario o password invalidos");
        }
        return new User(usuario.getEmail(), usuario.getPassword(), mapearAutoridadesRoles(usuario.getRoles()));
    }

    private Collection<? extends GrantedAuthority> mapearAutoridadesRoles(Collection<Rol> roles){
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getNombre())).collect(Collectors.toList());
    }
}
