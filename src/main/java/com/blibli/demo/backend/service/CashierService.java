package com.blibli.demo.backend.service;

import com.blibli.demo.backend.controller.model.request.OrderRequest;
import com.blibli.demo.backend.entity.Order;

public interface CashierService {
    public void putOrder(OrderRequest order);
    public int getTotalOrder();
    public Order getOrderWithId(int id);
}
