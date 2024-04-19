package com.eureka.cloud.course.item.feignclients;

import com.eureka.cloud.course.item.models.Producto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "productos") // nombre del servicio (application.yml) al que nos queremos conectar
public interface ProductoClienteRestFeign {

    @GetMapping("/listar")
    public List<Producto> listar();

    @GetMapping("ver/{id}")
    public Producto detalle(@PathVariable Long id);
}
