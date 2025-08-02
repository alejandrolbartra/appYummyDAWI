package com.app.yummy.infrastructure.venta.jpa;

import com.app.yummy.infrastructure.usuario.entity.UsuarioEntity;
import com.app.yummy.infrastructure.venta.entity.VentaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepositoryJpa extends JpaRepository<VentaEntity, Long> {
}
