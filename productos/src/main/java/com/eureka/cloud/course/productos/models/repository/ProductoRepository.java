package com.eureka.cloud.course.productos.models.repository;

import com.eureka.cloud.course.productos.models.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto,Long> {

}
