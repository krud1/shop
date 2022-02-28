package krud.shop.adapter;

import krud.shop.model.Product;
import krud.shop.repository.ProductRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositoryAdapter extends ProductRepository, JpaRepository<Product, Long> {
}
