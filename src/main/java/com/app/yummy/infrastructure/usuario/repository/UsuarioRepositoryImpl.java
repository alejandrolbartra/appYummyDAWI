package com.app.yummy.infrastructure.usuario.repository;

import com.app.yummy.domain.usuario.model.UsuarioModel;
import com.app.yummy.domain.usuario.repository.UsuarioRepository;
import com.app.yummy.infrastructure.usuario.jpa.UsuarioRepositoryJpa;
import com.app.yummy.infrastructure.usuario.mapper.UsuarioMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UsuarioRepositoryImpl implements UsuarioRepository {

    private final UsuarioRepositoryJpa usuarioRepositoryJpa;
    private final UsuarioMapper usuarioMapper;

    @Override
    public Optional<UsuarioModel> buscaPorId(Long usuarioId) {

        return usuarioRepositoryJpa.findById(usuarioId)
                .stream()
                .map(usuarioMapper::usuarioMap)
                .findFirst();
    }

    @Override
    public List<UsuarioModel> todosLosUsuarios(String nombre) {
        return List.of();
    }
}
