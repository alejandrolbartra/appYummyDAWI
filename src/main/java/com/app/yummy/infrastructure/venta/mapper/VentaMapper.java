package com.app.yummy.infrastructure.venta.mapper;

import com.app.yummy.domain.usuario.model.UsuarioModel;
import com.app.yummy.domain.venta.model.VentaModel;
import com.app.yummy.infrastructure.usuario.entity.UsuarioEntity;
import com.app.yummy.infrastructure.venta.entity.VentaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface VentaMapper {

    @Mapping(target = "ventaid", source = "ventaid")
    @Mapping(target = "usuarioid", source = "usuarioid")
    @Mapping(target = "fecha", source = "fecha")
    @Mapping(target = "total", source = "total")
    VentaModel ventaMap(VentaEntity entity);
}
