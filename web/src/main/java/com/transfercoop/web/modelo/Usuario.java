package com.transfercoop.web.modelo;

import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name = "usuario", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;
    private String telefono;
    private String email;
    private double dinero;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "usuarios_roles", 
                joinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "id"),
                inverseJoinColumns = @JoinColumn(name = "rol_id", referencedColumnName = "id"))
    private Collection<Rol> roles;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getDinero() {
        return dinero;
    }
    public void setDinero(Double dinero) {
        this.dinero = dinero;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Collection<Rol> getRoles() {
        return roles;
    }
    public void setRoles(Collection<Rol> roles) {
        this.roles = roles;
    }

    public Usuario(Long id, String nombre, String apellido, String telefono, String email, Double dinero,
            String password, Collection<Rol> roles) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.dinero = dinero;
        this.password = password;
        this.roles = roles;
    }
    public Usuario(String nombre, String apellido, String telefono, String email, Double dinero, String password,
            Collection<Rol> roles) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.dinero = dinero;
        this.password = password;
        this.roles = roles;
    }
    public Usuario() {
    }
    
    
    

}
