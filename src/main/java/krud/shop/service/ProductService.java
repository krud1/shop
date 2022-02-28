package krud.shop.service;

import krud.shop.model.Product;
import krud.shop.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final Logger logger = LoggerFactory.getLogger(ProductService.class);
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void saveProduct(Product product){
        logger.info(getClass().getName() + " saveProduct");
        productRepository.save(product);
    }

    public Optional<Product> findProductById(Long id){
        logger.info(getClass().getName() + " findProductById");
        return productRepository.findById(id);
    }

    public List<Product> findAllProducts(){
        logger.info(getClass().getName() + " findAllProducts");
        return productRepository.findAll();
    }
}
