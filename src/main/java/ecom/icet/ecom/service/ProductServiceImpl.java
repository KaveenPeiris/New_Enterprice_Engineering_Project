package ecom.icet.ecom.service;


import ecom.icet.ecom.model.Product;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.List;

@Service
public class ProductServiceImpl {

    public void createProduct(Product product){
        System.out.println(product);

    }

    public List<Product> getProducts(){
        return null;
    }
}
