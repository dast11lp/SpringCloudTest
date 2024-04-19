package com.eureka.cloud.course.productos.models.service;

import com.eureka.cloud.course.productos.models.entity.Producto;
import com.eureka.cloud.course.productos.models.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> findAll() {
        return this.productoRepository.findAll();
    }

    public Producto findById(Long id) {
        return this.productoRepository.findById(id).orElse(null);
    }
}
