package com.transfercoop.web.dto;

public class UsuarioRegistroDTO {
    
    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String dinero;
    private String password;
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
    public String getDinero() {
        return dinero;
    }
    public void setDinero(String dinero) {
        this.dinero = dinero;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public UsuarioRegistroDTO(Long id, String nombre, String apellido, String telefono, String email, String dinero,
            String password) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.dinero = dinero;
        this.password = password;
    }
    public UsuarioRegistroDTO(String nombre, String apellido, String telefono, String email, String dinero,
            String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.dinero = dinero;
        this.password = password;
    }
    public UsuarioRegistroDTO(Long id) {
        this.id = id;
    }
    public UsuarioRegistroDTO() {
    }
}
