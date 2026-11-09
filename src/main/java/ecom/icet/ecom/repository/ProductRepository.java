package ecom.icet.ecom.repository;

import ecom.icet.ecom.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository
        extends CrudRepository<ProductEntity,Long> {

}
