package com.pzeszko.microclothes.order.web;

import com.pzeszko.microclothes.order.dto.OrderDto;
import com.pzeszko.microclothes.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Admin on 11.04.2017.
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/finalize")
    public ResponseEntity<Void> finalizeOrder(@RequestBody OrderDto orderDto) {
        orderService.finalizeOrder(orderDto);
        return ResponseEntity.ok().build();
    }
}