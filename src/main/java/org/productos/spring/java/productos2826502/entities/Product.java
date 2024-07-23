package org.productos.spring.java.productos2826502.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name='products')



public class Product {
        private Long id;
        private String nombre;
        private Double precio;
}
