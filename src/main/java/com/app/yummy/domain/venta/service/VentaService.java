package com.app.yummy.domain.venta.service;

import com.app.yummy.domain.venta.model.VentaModel;

import java.util.Optional;

public interface VentaService {
    Optional<VentaModel> buscarVenta(Long ventaId);
    VentaModel guardar();

}