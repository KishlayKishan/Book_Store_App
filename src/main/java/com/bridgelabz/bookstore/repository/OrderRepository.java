package com.bridgelabz.bookstore.repository;

import com.bridgelabz.bookstore.entity.OrderData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderData,Integer> {
}