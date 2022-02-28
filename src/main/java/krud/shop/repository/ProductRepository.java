package krud.shop.repository;


import krud.shop.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository{

    Product save(Product product);
    Optional<Product> findById(Long id);
    List<Product> findAll();


    Product getOne(long product_id);
}
