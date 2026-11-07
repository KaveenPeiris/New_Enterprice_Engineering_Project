package ecom.icet.ecom.controller;


import ecom.icet.ecom.DTO.Product;
import ecom.icet.ecom.service.ProductServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {


    ProductServiceImpl service ;

    ProductController(ProductServiceImpl service){
        this.service = service;
    }
    @PostMapping("/Product/Create")
    void createProduct(@RequestBody Product product){

    service.createProduct(product);

    }
    @GetMapping("/Product/All")
    List<Product> getProducts(){
        return null;
    }
}
