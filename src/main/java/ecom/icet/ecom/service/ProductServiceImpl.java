package ecom.icet.ecom.service;


import ecom.icet.ecom.entity.ProductEntity;
import ecom.icet.ecom.DTO.Product;
import ecom.icet.ecom.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProductServiceImpl {
    @Autowired
ProductRepository repository;


    public void createProduct(Product product){

       ProductEntity entity = new ProductEntity();
       entity.setName(product.getName());
       entity.setPrice(product.getPrice());
       entity.setDescription(product.getDescription());
       entity.setActive(product.isActive());

       repository.save(entity);

    }

    public Iterable<ProductEntity> getProducts(){
       return repository.findAll();
    }
}
