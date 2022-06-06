package com.bridgelabz.bookstore.repository;

import com.bridgelabz.bookstore.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {
    @Query(value = "SELECT * FROM cart where user_Id = :userId", nativeQuery = true)
    List<Cart> findAllCartsByUserId(int userId);

    Cart getById(int cartId);
}