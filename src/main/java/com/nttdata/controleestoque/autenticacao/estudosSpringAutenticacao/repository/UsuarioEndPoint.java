package com.nttdata.controleestoque.autenticacao.estudosSpringAutenticacao.repository;

import com.nttdata.controleestoque.autenticacao.estudosSpringAutenticacao.model.UsuarioModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name= "usuarios", url = "http://localhost:8091/usuarios")
public interface UsuarioEndPoint {

    @RequestMapping(method = RequestMethod.GET, value = "")
    UsuarioModel getUsuario();
}
