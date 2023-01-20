package com.nttdata.controleestoque.autenticacao.estudosSpringAutenticacao.repository;

import com.nttdata.controleestoque.autenticacao.estudosSpringAutenticacao.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

    public Optional<UsuarioModel> findByEmail(String email);
}
