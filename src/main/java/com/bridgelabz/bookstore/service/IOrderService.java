package com.bridgelabz.bookstore.service;

import com.bridgelabz.bookstore.dto.OrderDTO;
import com.bridgelabz.bookstore.entity.OrderData;

import java.util.List;

public interface IOrderService {
    public OrderData addOrder(OrderDTO orderDTO);
    public OrderData cancelOrder(int id);
    public List<OrderData> getAllOrders();
    public OrderData getById(int id);
}
