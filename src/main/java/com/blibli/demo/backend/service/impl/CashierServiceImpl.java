package com.blibli.demo.backend.service.impl;

import com.blibli.demo.backend.entity.Customer;
import com.blibli.demo.backend.entity.Order;
import com.blibli.demo.backend.entity.OrderItem;
import com.blibli.demo.backend.service.CashierService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CashierServiceImpl implements CashierService {

    private static List<Order> orderList = new ArrayList<Order>();

    @Override
    public void putOrder(Order order) {
        orderList.add(order);
    }

    @Override
    public int getTotalOrder() {
        return orderList.size();
    }

    @Override
    public Order getOrderWithId(int id) {
//        return orderList.get(id);
        OrderItem someOrderItem = OrderItem.builder()
                                            .harga(100)
                                            .jumlah(3)
                                            .nama("suatu barang")
                                            .id(9)
                                            .build();

        List<OrderItem> someListOrderItem = new ArrayList<OrderItem>();
        someListOrderItem.add(someOrderItem);

        Customer someCustomer = Customer.builder()
                                        .name("kevin")
                                        .email("kevinemail")
                                        .build();

        return Order.builder()
                    .orderItems(someListOrderItem)
                    .totalHarga(50)
                    .pelanggan(someCustomer)
                    .id(id)
                    .build();
    }
}
