package com.bridgelabz.bookstore.controller;

import com.bridgelabz.bookstore.dto.OrderDTO;
import com.bridgelabz.bookstore.dto.ResponseDTO;
import com.bridgelabz.bookstore.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    IOrderService iOrderService;

    @PostMapping("/add")
    ResponseEntity<ResponseDTO> addOrder(@RequestBody OrderDTO orderDTO) {
        ResponseDTO response = new ResponseDTO("Product Added To Cart ", iOrderService.addOrder(orderDTO));
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
    @PutMapping("/cancel/{id}")
    ResponseEntity<ResponseDTO> cancelOrder(@PathVariable int id) {
        ResponseDTO response = new ResponseDTO("Order Cancelled Successfully ", iOrderService.cancelOrder(id));
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
    @GetMapping("/get/{id}")
    ResponseEntity<ResponseDTO> getById(@PathVariable int id) {
        ResponseDTO response = new ResponseDTO("Product Added To Cart ", iOrderService.getById(id));
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
    @GetMapping("/get-all")
    ResponseEntity<ResponseDTO> getAllOrders() {
        ResponseDTO response = new ResponseDTO("Product Added To Cart ", iOrderService.getAllOrders());
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}