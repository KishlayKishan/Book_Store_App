package com.bridgelabz.bookstore.service;

import com.bridgelabz.bookstore.dto.CartDTO;
import com.bridgelabz.bookstore.entity.Cart;

import java.util.List;

public interface ICartService {

    public Cart addToCart(CartDTO cartDTO);

    void deleteFromCart(int cartId);

    void deleteAll();

}
