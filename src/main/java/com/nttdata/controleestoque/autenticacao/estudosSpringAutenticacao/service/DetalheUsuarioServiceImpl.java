package com.nttdata.controleestoque.autenticacao.estudosSpringAutenticacao.service;

import com.nttdata.controleestoque.autenticacao.estudosSpringAutenticacao.repository.UsuarioRepository;
import com.nttdata.controleestoque.autenticacao.estudosSpringAutenticacao.data.DetalheUsuarioData;
import com.nttdata.controleestoque.autenticacao.estudosSpringAutenticacao.model.UsuarioModel;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DetalheUsuarioServiceImpl implements UserDetailsService {

    private final UsuarioRepository repository;

    public DetalheUsuarioServiceImpl(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UsuarioModel> usuario = repository.findByEmail(username);
        if (usuario.isEmpty()){
            throw new UsernameNotFoundException("Usuário [" + username + "] não encontrado");
        }

        return new DetalheUsuarioData(usuario);
    }
}
