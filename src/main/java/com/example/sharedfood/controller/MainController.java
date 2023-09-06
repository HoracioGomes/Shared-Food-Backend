package com.example.sharedfood.controller;

import com.example.sharedfood.data.OrdersVO;
import com.example.sharedfood.services.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shared-food")
public class MainController {
    @Autowired
    OrdersService ordersService;

    @PostMapping("/calculate")
    public ResponseEntity<OrdersVO> calculateFriendsDues(@RequestBody OrdersVO ordersVO) {
        return ResponseEntity.ok(ordersService.calculateDues(ordersVO));
    }
}
