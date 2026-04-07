package org.example.repository;

import org.example.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    // Este método busca en la DB por usuario y contraseña automáticamente
    Optional<Usuario> findByUsuarioAndPassword(String usuario, String password);
}