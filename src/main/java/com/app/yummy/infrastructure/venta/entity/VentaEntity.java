package com.app.yummy.infrastructure.venta.entity;

import com.app.yummy.infrastructure.shared.Auditoria;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "venta")
@Getter
@Setter
public class VentaEntity extends Auditoria<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private Long ventaId;

    @Column(name = "id_usuario")
    private Long usuarioId;

    @Column(name = "fecha")
    private LocalDateTime fecha;

    @Column(name = "total")
    private BigDecimal total;

}


