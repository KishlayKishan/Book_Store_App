package com.bridgelabz.bookstore.controller;

import com.bridgelabz.bookstore.dto.CartDTO;
import com.bridgelabz.bookstore.dto.ResponseDTO;
import com.bridgelabz.bookstore.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    public ICartService cartService;

    @PostMapping("/add")
    ResponseEntity<ResponseDTO> addToCart(@RequestBody CartDTO cartDTO) {
        ResponseDTO response = new ResponseDTO("Product Added To Cart ", cartService.addToCart(cartDTO));
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @DeleteMapping("/remove/{cartId}")
    ResponseEntity<ResponseDTO> removeFromCart(@PathVariable("cartId") int cartId) {

        ResponseDTO response = new ResponseDTO("Cart with id " + cartId + " deleted successfully", cartService.deleteFromCart(cartId));
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/get/{cartId}")
    ResponseEntity<ResponseDTO> getById(@PathVariable("cartId") int cartId) {
        ResponseDTO response = new ResponseDTO("Product Added To Cart ", cartService.getById(cartId));
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}