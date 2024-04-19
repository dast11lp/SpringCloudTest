package com.eureka.cloud.course.item.models;

import com.eureka.cloud.course.item.feignclients.ProductoClienteRestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService {

    @Autowired
    private ProductoClienteRestFeign productoClienteRestFeign;

    public List<Item> findAll() {
        return this.productoClienteRestFeign.listar().stream().map(p -> new Item(1,p)).collect(Collectors.toList());
    }

    public Item findById(Long id, Integer cantidad) {
        return new Item(cantidad, this.productoClienteRestFeign.detalle(id));
    }
}
