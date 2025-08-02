package com.app.yummy.infrastructure.venta.repository;

import com.app.yummy.domain.usuario.model.UsuarioModel;
import com.app.yummy.domain.venta.model.VentaModel;
import com.app.yummy.domain.venta.repository.VentaRepository;
import com.app.yummy.infrastructure.venta.entity.VentaEntity;
import com.app.yummy.infrastructure.venta.jpa.VentaRepositoryJpa;
import com.app.yummy.infrastructure.venta.mapper.VentaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class VentaRepositoryImpl implements VentaRepository {

    private final VentaRepositoryJpa ventaRepositoryJpa;
    private final VentaMapper ventaMapper;

    @Override
    public Optional<VentaModel> buscaPorId(Long ventaId) {
        return ventaRepositoryJpa.findById(ventaId)
                .stream()
                .map(ventaMapper::ventaMap)
                .findFirst();
    }

    @Override
    public List<VentaModel> todasLasVentas() {
        return List.of();
    }

    @Override
    public VentaModel guardar(VentaModel model) {

        VentaEntity ventaEntity = new VentaEntity();

        ventaEntity.setVentaId(model.getVentaId());
        ventaEntity.setUsuarioId(model.getUsuarioId());
        ventaEntity.setFecha(model.getFecha());
        ventaEntity.setTotal(model.getTotal());

        VentaEntity venta = ventaRepositoryJpa.save(ventaEntity);

        VentaModel ventaModel = new VentaModel();
        ventaModel.setVentaId(venta.getVentaId());
        ventaModel.setUsuarioId(ventaEntity.getUsuarioId());
        ventaModel.setFecha(ventaEntity.getFecha());
        ventaModel.setTotal(ventaEntity.getTotal());

        return ventaModel;
    }
}
