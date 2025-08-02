package com.app.yummy.domain.venta.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class VentaModel {

    private Long ventaId;

    private Long usuarioId;

    private LocalDateTime fecha;

    private BigDecimal total;
}
