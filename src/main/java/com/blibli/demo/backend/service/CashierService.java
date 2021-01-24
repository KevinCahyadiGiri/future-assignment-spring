package com.blibli.demo.backend.service;

import com.blibli.demo.backend.entity.Order;

public interface CashierService {
    public void putOrder(Order order);
    public int getTotalOrder();
    public Order getOrderWithId(int id);
}
