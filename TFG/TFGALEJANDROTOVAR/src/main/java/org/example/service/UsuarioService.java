package org.example.service;

import org.example.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public String validarLogin(String user, String pass) {
        // Buscamos al usuario y, si existe, devolvemos su rol (admin o empleado)
        return usuarioRepository.findByUsuarioAndPassword(user, pass)
                .map(u -> u.getRol())
                .orElse(null);
    }
}