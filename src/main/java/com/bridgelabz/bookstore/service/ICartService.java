package com.bridgelabz.bookstore.service;

import com.bridgelabz.bookstore.dto.CartDTO;
import com.bridgelabz.bookstore.entity.Cart;

public interface ICartService {

    public Cart addToCart(CartDTO cartDTO);

    public String deleteFromCart(int id);
    public Cart getById(int id);

}