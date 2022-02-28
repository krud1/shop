package krud.shop.adapter;

import krud.shop.model.Order;
import krud.shop.repository.OrderRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepositoryAdapter extends OrderRepository, JpaRepository<Order, Long> {
}
