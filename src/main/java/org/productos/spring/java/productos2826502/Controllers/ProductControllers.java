package org.productos.spring.java.productos2826502.Controllers;

import lombok.ToString;
import org.productos.spring.java.productos2826502.entities.Product;
import org.productos.spring.java.productos2826502.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductControllers {

    //Inyectar el servidor
    private ProductService service =
            new ProductService();

    //Primer endpoint
    //Endpoint: un metodo en un controlador

    @GetMapping("/saludo")
    public String saludo(){
        return "HOLA ... 2826502";
    }

    //Segun endpoin
    //GET: obtener informacion SIN ALTERARLA
    //  (inmutable)
    @GetMapping("/{idproducto}")
    public String findById(@PathVariable  String idproducto){
        return "aqui se mostrará el producto cuyo id es:" + idproducto;

    }
    @GetMapping
    public List<Product> findAllProduct(){
        //utilizo el servivcio
        return service.findAllProducts();
    }
}
