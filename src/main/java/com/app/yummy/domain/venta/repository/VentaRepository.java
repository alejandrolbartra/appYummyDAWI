package com.app.yummy.domain.venta.repository;

import com.app.yummy.domain.venta.model.VentaModel;

import java.util.List;
import java.util.Optional;

public interface VentaRepository {
    Optional<VentaModel> buscaPorId(Long ventaId);
    List<VentaModel>todasLasVentas();
    VentaModel guardar(VentaModel model);
}



