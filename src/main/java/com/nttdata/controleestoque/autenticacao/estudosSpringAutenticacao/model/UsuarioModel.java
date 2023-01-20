package com.nttdata.controleestoque.autenticacao.estudosSpringAutenticacao.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "usuarios")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nome;


    @Column(nullable = false, unique = true, length = 15)
    private String cpf;

    @Column(nullable = false,unique = true, length = 50)
    private String email;

    @Column(nullable = false, unique = true)
    private String senha;

    @Column(nullable = false, length = 30)
    private String tipo_usuario;


}
