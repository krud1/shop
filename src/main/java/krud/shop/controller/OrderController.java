package krud.shop.controller;

import krud.shop.model.Order;
import krud.shop.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    ResponseEntity<List<Order>> findAllOrders(){
        return ResponseEntity.ok().body(orderService.findAllOrders());
    }

    @PostMapping
    ResponseEntity<Order> saveOrder(@RequestBody @Valid Order source){
        orderService.saveOrder(source);
        return ResponseEntity.created(URI.create("/orders")).body(source);
    }

    @PutMapping(path = "/{order_id}/{product_id}/{quantity}")
    ResponseEntity<String> saveOrder(@PathVariable Long order_id, @PathVariable Long product_id, @PathVariable int quantity) {
        orderService.addToOrder(product_id, order_id, quantity);
        return ResponseEntity.created(URI.create("/")).body("created: " + order_id);
    }
}
