package org.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String usuario;
    private String password;
    private String rol;

    // Getters
    public String getRol() { return rol; }
    public String getUsuario() { return usuario; }
    public String getPassword() { return password; }
}