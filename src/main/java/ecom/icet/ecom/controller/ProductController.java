package ecom.icet.ecom.controller;


import ecom.icet.ecom.model.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @PostMapping("/Product/Create")
    void createProduct(@RequestBody Product product){
        System.out.println(product);



    }
    @GetMapping("/Product/All")
    List<Product> getProducts(){
        return null;
    }
}
