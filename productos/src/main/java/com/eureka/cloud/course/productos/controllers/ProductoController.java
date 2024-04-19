package com.eureka.cloud.course.productos.controllers;

import com.eureka.cloud.course.productos.models.entity.Producto;
import com.eureka.cloud.course.productos.models.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/listar")
    public List<Producto> listar() {
        return this.productoService.findAll();
    }

    @GetMapping("/ver/{id}")
    public Producto detalle (@PathVariable Long id) {
        return this.productoService.findById(id);
    }
}


