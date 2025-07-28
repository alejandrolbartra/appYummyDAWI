package com.app.yummy.domain.usuario.model;

import lombok.Data;

@Data
public class UsuarioModel {
    private Long usuarioid;
    private String nombre;
    private String descripcion;
    private String categoria;

}
