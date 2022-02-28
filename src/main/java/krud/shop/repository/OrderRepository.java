package krud.shop.repository;

import krud.shop.model.Order;

import java.util.List;

public interface OrderRepository {

    Order save(Order order);
    List<Order> findAll();
    boolean existsById(long id);

    Order getOne(long order_id);
}
