package org.productos.spring.java.productos2826502.repositories;

import org.productos.spring.java.productos2826502.entities.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {
    //la lista de un repsitorio
    //debe ser inmutable
    //la logica de negocio no modifica
    //la lista de un repositorio
    List<Product> products = List.of(
            Product.builder()
                    .id(1L)
                    .nombre("Silla Reclinable")
                    .precio(345000.0)
                    .build()
                    ,
            new Product(2L,
                        "Escritorio",
                        200000.0)
    );

    //metodo (comportamiento) para consultar todos
    //los productos del repository
    public List<Product> findAll(){
        return this.products;
    }
}

