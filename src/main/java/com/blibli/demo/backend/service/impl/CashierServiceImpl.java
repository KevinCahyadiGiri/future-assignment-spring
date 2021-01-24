package com.blibli.demo.backend.service.impl;

import com.blibli.demo.backend.controller.model.request.OrderItemRequest;
import com.blibli.demo.backend.controller.model.request.OrderRequest;
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
    private static int idOrder = 0;

    @Override
    public void putOrder(OrderRequest order) {
        List<OrderItemRequest> orderItemsReq = order.getOrderItems();
        List<OrderItem> orderItems = new ArrayList<OrderItem>();
        int idOrderItem = 0;
        int totalHarga = 0;
        int hargaTemp;
        for (OrderItemRequest orderItemReq : orderItemsReq) {
            hargaTemp = orderItemReq.getPrice() * orderItemReq.getQuantity();
            totalHarga += hargaTemp;
            orderItems.add(OrderItem.builder()
                    .harga(hargaTemp)
                    .jumlah(orderItemReq.getQuantity())
                    .nama(orderItemReq.getProductName())
                    .id(idOrderItem++)
                    .build()
            );
        }
        orderList.add(Order.builder()
                .orderItems(orderItems)
                .totalHarga(totalHarga)
                .pelanggan(order.getPelanggan())
                .id(idOrder++)
                .build()
        );
    }

    @Override
    public int getTotalOrder() {
        return orderList.size();
    }

    @Override
    public Order getOrderWithId(int id) {
        Order orderWanted = orderList.stream().filter(order -> id == order.getId()).findAny().orElse(null);
        return orderWanted;
    }
}
