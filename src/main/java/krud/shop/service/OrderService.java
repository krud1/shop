package krud.shop.service;

import krud.shop.model.Order;
import krud.shop.model.Product;
import krud.shop.repository.OrderRepository;
import krud.shop.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;
    private final static Logger logger = LoggerFactory.getLogger(OrderService.class);

    public OrderService(OrderRepository orderRepository, ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
    }

    public void saveOrder(Order order){
        orderRepository.save(order);
    }

    public List<Order> findAllOrders(){
        return orderRepository.findAll();
    }

    public void addToOrder(long product_id, long order_id, int quantity){

            Order order = orderRepository.getOne(order_id);
            Product product = productRepository.getOne(product_id);
            product.setQuantity(quantity);
            order.addProduct(product);
            orderRepository.save(order);

    }
}
